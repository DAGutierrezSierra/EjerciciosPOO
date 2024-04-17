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
public class GestionDenunciado {
    private ArrayList<PersonaDenunciado> denunciados;
    private Scanner teclado;

    public GestionDenunciado(ArrayList<PersonaDenunciado> denunciados) {
        this.denunciados = denunciados;
        this.teclado = new Scanner(System.in);
    }

    public boolean nuevoDenunciado() {
        System.out.println("\n\tALTA NUEVO DENUNCIADO");
        System.out.print("Introduzca Identificador: ");
        String id = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = teclado.nextLine();
        System.out.print("Delito: ");
        String delito = teclado.nextLine();

        PersonaDenunciado nuevoDenunciado = new PersonaDenunciado(id, nombre, apellidos, delito);
        return denunciados.add(nuevoDenunciado);
    }

    public void mostrarDenunciados() {
        if (denunciados.isEmpty()) {
            System.out.println("No hay Denunciados registrados.");
            System.out.println("Por favor, ingrese un nuevo denunciado.");
            nuevoDenunciado();
        } else {
            System.out.println("Lista de Denunciados registrados:");
            for (PersonaDenunciado d : denunciados) {
                d.mostrar();
            }
        }
    }
    
public boolean modificarDenunciado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca Identificador del denunciado a modificar: ");
        String id = scanner.nextLine();
        
        PersonaDenunciado denunciado = null;
        for (PersonaDenunciado d : denunciados) {
            if (d.getId().equals(id)) {
                denunciado = d;
                break;
            }
        }
        
        if (denunciado == null) {
            System.out.println("No se encuentra Denunciado con el ID: " + id);
            scanner.close();
            return false;
        } else {
            System.out.print("ID actual: " + denunciado.getId() + "\nIntroduzca nuevo identificador: ");
            denunciado.setId(scanner.nextLine());
            
            System.out.print("Nombre actual: " + denunciado.getNombre() + "\nIntroduzca nuevo nombre: ");
            denunciado.setNombre(scanner.nextLine());
            
            System.out.print("Apellidos actuales: " + denunciado.getApellidos() + "\nIntroduzca nuevos apellidos: ");
            denunciado.setApellidos(scanner.nextLine());
            
            System.out.print("Delito actual: " + denunciado.getDelito() + "\nIntroduzca nuevo delito: ");
            denunciado.setDelito(scanner.nextLine());
            
            scanner.close();
            return true;
            }
        }
    
}
