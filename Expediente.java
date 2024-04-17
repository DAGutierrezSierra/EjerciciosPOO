package expedientedelitos;

/**
 *
 * @author Henry
 */
public class Expediente {
    private PersonaDenunciante denunciante;
    private PersonaDenunciado denunciado;
    private ExpedienteHistorialDelitos historialDelitos;

    public Expediente(PersonaDenunciante denunciante, PersonaDenunciado denunciado, ExpedienteHistorialDelitos historialDelitos) {
        this.denunciante = denunciante;
        this.denunciado = denunciado;
        this.historialDelitos = historialDelitos;
    }

    public PersonaDenunciante getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(PersonaDenunciante denunciante) {
        this.denunciante = denunciante;
    }

    public PersonaDenunciado getDenunciado() {
        return denunciado;
    }

    public void setDenunciado(PersonaDenunciado denunciado) {
        this.denunciado = denunciado;
    }

    public ExpedienteHistorialDelitos getHistorialDelitos() {
        return historialDelitos;
    }

    public void setHistorialDelitos(ExpedienteHistorialDelitos historialDelitos) {
        this.historialDelitos = historialDelitos;
    }

    public void mostrarExpediente() {
        System.out.println("\n------------------ Expediente de Delitos ------------------");
        System.out.println("Denunciante:");
        denunciante.mostrar();
        System.out.println("Denunciado:");
        denunciado.mostrar();
        System.out.println("Historial de Delitos:");
        historialDelitos.mostrar();
        System.out.println("-----------------------------------------------------------\n");
    }
    
}
