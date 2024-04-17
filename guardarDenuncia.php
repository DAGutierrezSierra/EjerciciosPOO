<?php
// conexion a la base de datos
$host = 'localhost';
$port = '5432';
$dbname = 'expedientes_db';
$user = 'postgres';
$password = '123';

$conn = new PDO("pgsql:host=$host;port=$port;dbname=$dbname;user=$user;password=$password");

// Obtener los datos del formulario
$nombreDenunciante = $_POST['nombreDenunciante'];
$direccionDenunciante = $_POST['direccionDenunciante'];
$nombreDenunciado = $_POST['nombreDenunciado'];
$direccionDenunciado = $_POST['direccionDenunciado'];
$tipoDelito = $_POST['tipoDelito'];

$sql = "INSERT INTO expedientes (nombre_denunciante, direccion_denunciante, nombre_denunciado, direccion_denunciado, tipo_delito)
        VALUES (:nombreDenunciante, :direccionDenunciante, :nombreDenunciado, :direccionDenunciado, :tipoDelito)";
$stmt = $conn->prepare($sql);

$stmt->execute([
    ':nombreDenunciante' => $nombreDenunciante,
    ':direccionDenunciante' => $direccionDenunciante,
    ':nombreDenunciado' => $nombreDenunciado,
    ':direccionDenunciado' => $direccionDenunciado,
    ':tipoDelito' => $tipoDelito
]);

// Redirigir al usuario de vuelta al formulario
header('Location: formulario.html');
?>
