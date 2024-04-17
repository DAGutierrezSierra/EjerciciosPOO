/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedientedelitos;

/**
 *
 * @author Henry
 */
public class PersonaDenunciante {
	
	private String id;
	private String nombres;
	private String apellidos;
	private int edad;
	private String genero;
	private String direccion;
        
	public PersonaDenunciante(String id, String nombres, String apellidos, int edad, String genero, String direccion) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.genero = genero;
                this.direccion = direccion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
        public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * Muestra por consola todos los datos del Denunciante
	 */
	public void mostrar() {
		System.out.println("\n\t---------------");
		System.out.println("ID Denunciante: " + id);
		System.out.println("Nombre: " + nombres);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Genero: " + genero);
		System.out.println("Direcció: " + direccion);
                System.out.println("\t---------------");
                                
	}     
}
    
