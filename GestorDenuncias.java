/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedientedelictivo;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
/**
 *
 * @author betin
 */
public class GestorDenuncias {
    private Map<Integer, Expediente> expedientes = new HashMap<>();
    private int ultimoNumeroExpediente = 0;

    public int registrarDenuncia(Persona denunciante, Persona denunciado, Delito delito) {
        Expediente expediente = new Expediente();
        expediente.agregarDelito(delito);
        expediente.setDenunciante(denunciante);
        expediente.setDenunciado(denunciado);
        
        expedientes.put(++ultimoNumeroExpediente, expediente);
        
        return ultimoNumeroExpediente;
    }
}
