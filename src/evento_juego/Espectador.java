package evento_juego;

import java.io.File;

/**
 * Clase que nos ayuda a modelar los espectadores que van a 
 */
public class Espectador implements Observador{

    /* El id para poder identificar al usuario. */
    String idEspectador;
    /* Personaje al que va a apoyar el espectador al visualizar el evento. */
    String personajeApoyado;
    /* El evento del juego que esta viendo el espectador. */
    EventoDeJuego evento;
    /* El estado actual del juego */
    String estadoActual;
    /* La bitacora que va a tener el espectador */
    Bitacora bitacora = new Bitacora("../"+idEspectador+".txt");

    /**
     * Constructor por parametros de un espectador.
     */
    public Espectador(String idEspectador, String personajeApoyado, EventoDeJuego evento){
        this.idEspectador = idEspectador;
        this.personajeApoyado = personajeApoyado;
        this. evento = evento;
        evento.registrar(this);
        estadoActual = evento.getEstadoDelJuego();
    }

    /**
     * Metodo que nos regresa el estado actual del juego.
     */
    @Override
    public void actualizar(){
        estadoActual = evento.getEstadoDelJuego();
    }

    /**
     * Metodo geter para el IdEspectador
     * @return nos regresa el id del espectador.
     */
    public String getIdEspectador() {
        return idEspectador;
    }

    /**
     * Metodo para que el espectador deje de ver el juego.
     */
    public void dejarDeVerJuego(){
        evento.remover(this);
    }

    /**
     * Metodo para poder visualizar estado actual del Juego
     */
    public void verEstadoActual(){
        String edo = "\nidEspectador: " + idEspectador + "\n";
        edo += estadoActual;
        System.out.println(edo);
    }
}