package evento_juego;

/**
 * 
 */
public class Espectador implements Observador{
    String idUsuario;
    String bitacora;
    PersonajeApoyado personajeApoyado;
    EventoDeJuego evento;


    /**
     * Constructor por parametros de un espectador.
     */
    public Espectador(){

    }

    /**
     * 
     */
    @Override
    public void actualizar(){

    }
}