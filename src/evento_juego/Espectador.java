package evento_juego;

/**
 * Clase que nos ayuda a modelar los espectadores que van a mirar el EventoDeJuego, 
 * esta clase es parte del patron de diseño observer y una implementación concreta
 * de la interfaz Observador.
 */
public class Espectador implements Observador{

    /* El id para poder identificar al usuario. */
    private String idEspectador;
    /* Personaje al que va a apoyar el espectador al visualizar el evento. */
    private String personajeApoyado;
    /* El evento del juego que esta viendo el espectador. */
    private EventoDeJuego evento;
    /* El estado actual del juego */
    private String estadoActual;
    /* La bitacora que va a tener el espectador */
    private Bitacora bitacora;

    /**
     * Constructor por parametros de un espectador.
     * @param idEspectador El id del espectador.
     * @param personajeApoyado El personaje al que va a apoyar el espectador.
     * @param evento El evento del juego que esta viendo el espectador.
     */
    public Espectador(String idEspectador, String personajeApoyado, EventoDeJuego evento){
        this.idEspectador = idEspectador;
        this.personajeApoyado = personajeApoyado;
        this.evento = evento;
        evento.registrar(this);
        estadoActual = evento.getEstadoDelJuego();
        bitacora = new Bitacora("../"+getIdEspectador()+".txt");
        bitacora.escribir("idEspectador: " + idEspectador);
        bitacora.escribir("personajeApoyado: " + personajeApoyado);
        bitacora.escribir(estadoActual);
    }

    /**
     * Metodo que nos imprime(en terminal) el estado actual del juego, y ademas 
     * escribe dicho estado en una bitacora.
     * Este metodo está pensado para que cada vez que el EventoDeJuego haga un 
     * anunció, dicho anunció se mande a todos los espectadores que están viendo
     * el juego.
     */
    @Override
    public void actualizar(){
        estadoActual = evento.getEstadoDelJuego();
        gano();
        bitacora.escribir(estadoActual);
        verEstadoActual();
    }

    /**
     * Metodo get para obtener el IdEspectador.
     * @return nos regresa el id del espectador.
     */
    public String getIdEspectador(){
        return idEspectador;
    }

    /**
     * Metodo get para obtener el personaje apooyado.
     * @return el personaje que esta apoyando el espectador.
     */
    public String getPersonajeApoyado(){
        return personajeApoyado;
    }

    /**
     * Metodo para que el espectador pueda dejar de ver el juego si asi lo desea.
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

    /**
     * Metodo auxiliar para personalizar quien fue el que gano con base al personaje
     * apoyado, si el personaje del espectador gano, se imprime personajeApoyado gano,
     * en caso contrario se imprime personajeApoyado perdio.
     */
    public void gano(){
        if(estadoActual.toLowerCase().contains("gano")){
            if(estadoActual.contains(personajeApoyado)){
                estadoActual = personajeApoyado + " gano!!! (:";
            }else{
                estadoActual = personajeApoyado + " perdio ):";
            }
        }
    }

}