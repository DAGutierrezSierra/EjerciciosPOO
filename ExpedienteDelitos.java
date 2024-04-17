/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedientedelitos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dionisio
 */
public class ExpedienteDelitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Scanner scanner = new Scanner(System.in);
         
        ArrayList<PersonaDenunciante> denunciantes = new ArrayList<>();
        ArrayList<PersonaDenunciado> denunciados = new ArrayList<>();
        ArrayList<ExpedienteHistorialDelitos> historiales = new ArrayList<>();

        GestionDenunciante gestionDenunciante = new GestionDenunciante(denunciantes);
        GestionDenunciado gestionDenunciado = new GestionDenunciado(denunciados);
        GestionExpedienteHistorialDelitos gestionExpedienteHistorialDelitos = new GestionExpedienteHistorialDelitos(historiales);

        // Agregar denunciantes, denunciados e historiales delitos antes de intentar acceder a ellos
        gestionDenunciante.nuevoDenunciante();
        gestionDenunciado.nuevoDenunciado();
        gestionExpedienteHistorialDelitos.nuevoHistorialDelito();

        GestionExpedienteHistorialDelitos gestionHistoriales = new GestionExpedienteHistorialDelitos(historiales);
        
        if (!denunciantes.isEmpty()) {
        PersonaDenunciante denunciante = denunciantes.get(0);
    // Resto del código para trabajar con el denunciante
        } else {
        System.out.println("No se han registrado denunciantes.");
        }

        // Solicitar y guardar datos del denunciante
        gestionDenunciante.nuevoDenunciante();

        // Solicitar y guardar datos del denunciado
        gestionDenunciado.nuevoDenunciado();

        // Solicitar y guardar datos del historial de delitos
        gestionHistoriales.nuevoHistorialDelito();

        // Crear un expediente con los datos recolectados
        PersonaDenunciante denunciante = denunciantes.get(0);
        PersonaDenunciado denunciado = denunciados.get(0);
        ExpedienteHistorialDelitos historial = historiales.get(0);
        Expediente expediente = new Expediente(denunciante, denunciado, historial);

        // Mostrar el expediente
        expediente.mostrarExpediente();

        scanner.close();
    }
    
    
}

        /**
         * 
         * PRIMER METODO CON MENU
        ArrayList<PersonaDenunciante> denunciantes = new ArrayList<>();
        ArrayList<PersonaDenunciado> denunciados = new ArrayList<>();
        ArrayList<ExpedienteHistorialDelitos> expedientes = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        GestionDenunciante gestionDenunciante = new GestionDenunciante(denunciantes);
        GestionDenunciado gestionDenunciado = new GestionDenunciado(denunciados);
        GestionExpedienteHistorialDelitos gestionExpediente = new GestionExpedienteHistorialDelitos(expedientes);
        
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar nuevo denunciante");
            System.out.println("2. Mostrar denunciantes registrados");
            System.out.println("3. Modificar denunciante");
            System.out.println("4. Registrar nuevo denunciado");
            System.out.println("5. Mostrar denunciados registrados");
            System.out.println("6. Modificar denunciado");
            System.out.println("7. Registrar nuevo expediente de delitos");
            System.out.println("8. Mostrar expedientes de delitos registrados");
            System.out.println("9. Modificar expediente de delitos");
            System.out.println("10. Salir");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            switch (opcion) {
                case 1:
                    gestionDenunciante.nuevoDenunciante();
                    break;
                case 2:
                    gestionDenunciante.mostrarDenunciantes();
                    break;
                case 3:
                    gestionDenunciante.modificarDenunciante(denunciantes);
                    break;
                case 4:
                    gestionDenunciado.nuevoDenunciado();
                    break;
                case 5:
                    gestionDenunciado.mostrarDenunciados();
                    break;
                case 6:
                    gestionDenunciado.modificarDenunciado();
                    break;
                case 7:
                    gestionExpediente.nuevoHistorialDelito();
                    break;
                case 8:
                    gestionExpediente.mostrarHistorialesDelitos();
                    break;
                case 9:
                    gestionExpediente.modificarHistorialDelito();
                    break;
                case 10:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                    break;
            }
        }
        
        scanner.close();
        * */
        
        /**
         * 
         * 
         * SEGUNDO METODO SIMPLIFICADO
        
        Scanner scanner = new Scanner(System.in);

        // Crear listas para almacenar denunciantes, denunciados e historiales de delitos
        ArrayList<PersonaDenunciante> denunciantes = new ArrayList<>();
        ArrayList<PersonaDenunciado> denunciados = new ArrayList<>();
        ArrayList<ExpedienteHistorialDelitos> historialesDelitos = new ArrayList<>();

        // Crear instancias de las clases de gestión
        GestionDenunciante gestionDenunciante = new GestionDenunciante(denunciantes);
        GestionDenunciado gestionDenunciado = new GestionDenunciado(denunciados);
        GestionExpedienteHistorialDelitos gestionHistorialDelitos = new GestionExpedienteHistorialDelitos(historialesDelitos);

        // Solicitar al usuario que ingrese los datos del denunciante
        System.out.println("Ingrese los datos del denunciante:");
        gestionDenunciante.nuevoDenunciante();

        // Solicitar al usuario que ingrese los datos del denunciado
        System.out.println("Ingrese los datos del denunciado:");
        gestionDenunciado.nuevoDenunciado();

        // Solicitar al usuario que ingrese los datos del historial de delitos
        System.out.println("Ingrese los datos del historial de delitos:");
        gestionHistorialDelitos.nuevoHistorialDelito();

        // Crear un expediente con los datos ingresados
        Expediente expediente = new Expediente(denunciantes.get(0), denunciados.get(0), historialesDelitos.get(0));

        // Mostrar el expediente creado
        System.out.println("\nExpediente creado:");
        expediente.mostrarExpediente();

        scanner.close();
        * 
        *  */

        
        /**
         * 
         * 
         * TERCER METODO SIMPLIFICADO
        
         Scanner scanner = new Scanner(System.in);

        // Crear listas para almacenar denunciantes, denunciados e historiales de delitos
        ArrayList<PersonaDenunciante> denunciantes = new ArrayList<>();
        ArrayList<PersonaDenunciado> denunciados = new ArrayList<>();
        ArrayList<ExpedienteHistorialDelitos> historialesDelitos = new ArrayList<>();

        // Crear instancias de las clases de gestión
        GestionDenunciante gestionDenunciante = new GestionDenunciante(denunciantes);
        GestionDenunciado gestionDenunciado = new GestionDenunciado(denunciados);
        GestionExpedienteHistorialDelitos gestionHistorialDelitos = new GestionExpedienteHistorialDelitos(historialesDelitos);

        // Solicitar al usuario que ingrese los datos del denunciante
        System.out.println("Ingrese los datos del denunciante:");
        gestionDenunciante.nuevoDenunciante();

        // Solicitar al usuario que ingrese los datos del denunciado
        System.out.println("Ingrese los datos del denunciado:");
        gestionDenunciado.nuevoDenunciado();

        // Solicitar al usuario que ingrese los datos del historial de delitos
        System.out.println("Ingrese los datos del historial de delitos:");
        gestionHistorialDelitos.nuevoHistorialDelito();

        // Mostrar un mensaje indicando que se han ingresado todos los datos
        System.out.println("\nSe han ingresado todos los datos.");

        // Mostrar el expediente completo
        System.out.println("\nExpediente completo:");
        Expediente expediente = new Expediente(denunciantes.get(0), denunciados.get(0), historialesDelitos.get(0));
        expediente.mostrarExpediente();

        scanner.close();
        * 
        * */
        
        /**
         * CUARTO INTENTO
         * 
         
        
         Scanner scanner = new Scanner(System.in);

    // Crear listas para almacenar denunciantes, denunciados e historiales de delitos
    ArrayList<PersonaDenunciante> denunciantes = new ArrayList<>();
    ArrayList<PersonaDenunciado> denunciados = new ArrayList<>();
    ArrayList<ExpedienteHistorialDelitos> historialesDelitos = new ArrayList<>();

    // Crear instancias de las clases de gestión
    GestionDenunciante gestionDenunciante = new GestionDenunciante(denunciantes);
    GestionDenunciado gestionDenunciado = new GestionDenunciado(denunciados);
    GestionExpedienteHistorialDelitos gestionHistorialDelitos = new GestionExpedienteHistorialDelitos(historialesDelitos);

    // Solicitar al usuario que ingrese los datos del denunciante
    System.out.println("Ingrese los datos del denunciante:");
    gestionDenunciante.nuevoDenunciante();

    // Solicitar al usuario que ingrese los datos del denunciado
    System.out.println("Ingrese los datos del denunciado:");
    gestionDenunciado.nuevoDenunciado();

    // Solicitar al usuario que ingrese los datos del historial de delitos
    System.out.println("Ingrese los datos del historial de delitos:");
    gestionHistorialDelitos.nuevoHistorialDelito();

    // Mostrar un mensaje indicando que se han ingresado todos los datos
    System.out.println("\nSe han ingresado todos los datos.");

    // Verificar si las listas contienen elementos antes de intentar acceder a ellos
    if (!denunciantes.isEmpty() && !denunciados.isEmpty() && !historialesDelitos.isEmpty()) {
        // Mostrar el expediente completo
        System.out.println("\nExpediente completo:");
        Expediente expediente = new Expediente(denunciantes.get(0), denunciados.get(0), historialesDelitos.get(0));
        expediente.mostrarExpediente();
    } else {
        System.out.println("\nNo se pudo mostrar el expediente porque falta información.");
    }

    scanner.close();
    * 
    * * 
         */
        /**
      Scanner scanner = new Scanner(System.in);

        // Listas para almacenar los denunciantes, denunciados y expedientes
        ArrayList<PersonaDenunciante> denunciantes = new ArrayList<>();
        ArrayList<PersonaDenunciado> denunciados = new ArrayList<>();
        ArrayList<ExpedienteHistorialDelitos> historialesDelitos = new ArrayList<>();

        // Instancias de las clases para gestionar denunciantes, denunciados y expedientes
        GestionDenunciante gestionDenunciante = new GestionDenunciante(denunciantes);
        GestionDenunciado gestionDenunciado = new GestionDenunciado(denunciados);
        GestionExpedienteHistorialDelitos gestionExpediente = new GestionExpedienteHistorialDelitos(historialesDelitos);

        // Variables para almacenar los datos de un expediente
        PersonaDenunciante denunciante;
        PersonaDenunciado denunciado;
        ExpedienteHistorialDelitos historialDelitos;

        // Registro de un nuevo denunciante
        System.out.println("Registro de nuevo denunciante:");
        gestionDenunciante.nuevoDenunciante();

        // Registro de un nuevo denunciado
        System.out.println("Registro de nuevo denunciado:");
        gestionDenunciado.nuevoDenunciado();

        // Registro de un nuevo historial de delitos
        System.out.println("Registro de nuevo historial de delitos:");
        gestionExpediente.nuevoHistorialDelito();

        // Obtener el último denunciante registrado
        denunciante = denunciantes.get(denunciantes.size() - 1);

        // Obtener el último denunciado registrado
        denunciado = denunciados.get(denunciados.size() - 1);

        // Obtener el último historial de delitos registrado
        historialDelitos = historialesDelitos.get(historialesDelitos.size() - 1);

        // Creación del expediente
        Expediente expediente = new Expediente(denunciante, denunciado, historialDelitos);

        // Mostrar expediente
        expediente.mostrarExpediente();
 

        // Cerrar el scanner
        scanner.close();  
        
        **/
