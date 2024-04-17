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
public class GestionDenunciante {
    	private ArrayList<PersonaDenunciante> personas;
	private Scanner teclado;
	
	public GestionDenunciante(ArrayList<PersonaDenunciante> denunciantes) {
		this.personas = denunciantes;
                personas = new ArrayList<PersonaDenunciante>();
		teclado = new Scanner(System.in);
	}
	
	/**
	 * Crea y registra un nuevo denunciante.
	 */
	public boolean nuevoDenunciante() {
		System.out.println("\n\tALTA NUEVO DENUNCIANTE");
		System.out.print("Introduzca Identidficador: ");
		String id = teclado.nextLine();
		System.out.print("Nombres: ");
		String nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = teclado.nextLine();
		System.out.print("Genero: ");
		String genero = teclado.nextLine();
                System.out.print("Dirección: ");
		String direccion = teclado.nextLine();
		System.out.print("Edad: ");
		int edad = teclado.nextInt();
                                
                teclado.nextLine();//Tras leer un int, conviene "limpiar" el stream de entrada, para evitar problemas al querer leer luego datos String
                
                PersonaDenunciante nuevoDenunciante = new PersonaDenunciante(id, nombre, apellidos, edad, genero, direccion);
		return personas.add(nuevoDenunciante);//Devuelve TRUE si se insertó correctamente, FALSE si no se pudo insertar
	}
	
	/**
	 * Lista por pantalla los datos de todos los denunciantes registrados.
	 */
	public void mostrarDenunciantes() {
            if (personas.isEmpty()){
                System.out.println("No hay Denunciantes registrados.");
                System.out.println("Por favor, ingrese un nuevo denunciante.");
                nuevoDenunciante();
            }
            else {
                System.out.println("Lista de Denunciantes registrados:");
                for (PersonaDenunciante p: personas){
                    p.mostrar();
                }
            }
            
        }

        public boolean modificarDenunciante(ArrayList<PersonaDenunciante> personas) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduzca Identificador del denunciante a modificar: ");
                String id = scanner.nextLine();
    
                PersonaDenunciante denunciante = null;
                for (PersonaDenunciante persona : personas) {
                    if (persona.getId().equals(id)) {
                        denunciante = persona;
                        break;
                    }
                }

                    if (denunciante == null) {
                        System.out.println("No se encuentra Denunciante con el ID: " + id);
                        scanner.close();
                        return false;
                    } else {
                            System.out.print("ID actual: " + denunciante.getId() + "\nIntroduzca nuevo identificador: ");
                            denunciante.setId(scanner.nextLine());

                            System.out.print("Nombre actual: " + denunciante.getNombres() + "\nIntroduzca nuevo nombre: ");
                            denunciante.setNombres(scanner.nextLine());

                            System.out.print("Apellidos actuales: " + denunciante.getApellidos() + "\nIntroduzca nuevos apellidos: ");
                            denunciante.setApellidos(scanner.nextLine());

                            System.out.print("Genero actual: " + denunciante.getGenero() + "\nIntroduzca nuevo genero: ");
                            denunciante.setGenero(scanner.nextLine());

                            System.out.print("Direccion actual: " + denunciante.getDireccion() + "\nIntroduzca nueva dirección: ");
                            denunciante.setDireccion(scanner.nextLine());

                            System.out.print("Edad actual: " + denunciante.getEdad() + "\nIntroduzca nueva edad: ");
                        try {
                                denunciante.setEdad(Integer.parseInt(scanner.nextLine()));
                        } catch (NumberFormatException e) {
                            System.out.println("Solo se admite introducir números para la edad. No se ha registrado el valor introducido.");
                        }
                            scanner.close();
                            return true;
                        }
        }


}

   
