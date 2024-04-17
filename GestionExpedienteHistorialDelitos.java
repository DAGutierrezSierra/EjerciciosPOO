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
public class GestionExpedienteHistorialDelitos {
     private ArrayList<ExpedienteHistorialDelitos> historiales;
    private Scanner teclado;
    
    public GestionExpedienteHistorialDelitos(ArrayList<ExpedienteHistorialDelitos> historiales) {
        this.historiales = historiales;
        teclado = new Scanner(System.in);
    }
    
    public boolean nuevoHistorialDelito() {
        System.out.println("\n\tALTA NUEVO HISTORIAL DE DELITO");
        System.out.print("Introduzca Código: ");
        String codigo = teclado.nextLine();
        System.out.print("Fecha: ");
        String fecha = teclado.nextLine();
        System.out.print("ID Persona: ");
        String idPersona = teclado.nextLine();
        System.out.print("ID Denunciado: ");
        String idDenunciado = teclado.nextLine();
        System.out.print("Observaciones: ");
        String observaciones = teclado.nextLine();
        
        ExpedienteHistorialDelitos nuevoHistorial = new ExpedienteHistorialDelitos(codigo, fecha, idPersona, idDenunciado, observaciones);
        return historiales.add(nuevoHistorial);
    }
    
    public void mostrarHistorialesDelitos() {
        if (historiales.isEmpty()) {
            System.out.println("No hay Historiales de Delitos registrados.");
            System.out.println("Por favor, ingrese un nuevo historial de delito.");
            nuevoHistorialDelito();
        } else {
            System.out.println("Lista de Historiales de Delitos registrados:");
            for (ExpedienteHistorialDelitos h : historiales) {
                h.mostrar();
            }
        }
    }
    
    public boolean modificarHistorialDelito() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca Código del historial de delito a modificar: ");
        String codigo = scanner.nextLine();
        
        ExpedienteHistorialDelitos historial = null;
        for (ExpedienteHistorialDelitos h : historiales) {
            if (h.getCodigo().equals(codigo)) {
                historial = h;
                break;
            }
        }
        
        if (historial == null) {
            System.out.println("No se encuentra Historial de Delito con el Código: " + codigo);
            scanner.close();
            return false;
        } else {
            System.out.print("Código actual: " + historial.getCodigo() + "\nIntroduzca nuevo código: ");
            historial.setCodigo(scanner.nextLine());
            
            System.out.print("Fecha actual: " + historial.getFecha() + "\nIntroduzca nueva fecha: ");
            historial.setFecha(scanner.nextLine());
            
            System.out.print("ID Persona actual: " + historial.getIdPersona() + "\nIntroduzca nuevo ID persona: ");
            historial.setIdPersona(scanner.nextLine());
            
            System.out.print("ID Denunciado actual: " + historial.getIdDenunciado() + "\nIntroduzca nuevo ID denunciado: ");
            historial.setIdDenunciado(scanner.nextLine());
            
            System.out.print("Observaciones actuales: " + historial.getObservaciones() + "\nIntroduzca nuevas observaciones: ");
            historial.setObservaciones(scanner.nextLine());
            
            scanner.close();
            return true;
        }
    }
}