/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedientedelitos;

/**
 *
 * @author betin
 */
public class PersonaDenunciado {
    
        private String id;
	private String nombre;
	private String apellidos;
	private String delito;
	
	public PersonaDenunciado(String id, String nombre, String apellidos, String delito) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.delito = delito;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDelito() {
		return delito;
	}

	public void setDelito(String delito) {
		this.delito = delito;
	}
	
	/**
	 * Muestra por consola todos los datos del Denunciado
	 */
	public void mostrar() {
		System.out.println("\n\t---------------");
		System.out.println("ID Denunciado: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Delito: " + delito);
		System.out.println("\t---------------");
	}

}
    
