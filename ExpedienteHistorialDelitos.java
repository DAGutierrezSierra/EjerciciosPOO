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
public class ExpedienteHistorialDelitos {
   
        private String codigo;
	private String fecha;
	private String idPersona;
	private String idDenunciado;
	private String observaciones;
	
	public ExpedienteHistorialDelitos(String codigo, String fecha, String idPersona,
			String idDenunciado, String observaciones) {
		this.codigo = codigo;
		this.fecha = fecha;
		this.idPersona = idPersona;
		this.idDenunciado = idDenunciado;
		this.observaciones = observaciones;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getIdDenunciado() {
		return idDenunciado;
	}

	public void setIdDenunciado(String idDenunciado) {
		this.idDenunciado = idDenunciado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	/**
	 * Muestra por consola todos los datos del Historial Delictivo
	 */
	public void mostrar() {
		System.out.println("\n\t---------------");
		System.out.println("Codigo Historial Delito: " + codigo);
		System.out.println("Fecha: " + fecha);
		System.out.println("ID Denunciante: " + idPersona);
		System.out.println("ID Denunciado: " + idDenunciado);
		System.out.println("Observaciones:\n" + observaciones);
		System.out.println("\t---------------");
	}
}
