package evento_juego;

import java.util.LinkedList;

/**
 * Clase que modela el Evento de Juegos que va a transmitir el juego que hicimos
 * a los espectadores, esta clase es parte del patron de diseño Observer, más
 * específicamente implementa la interfaz Sujeto que seria la que envia la información
 * a todos los demás observadores, para que estós la lean.
 */
public class EventoDeJuego implements Sujeto{

    /* La lista de los espectadores */
    LinkedList<Espectador> espectadores;
    /* String que va a tener el estado del juego. */
    String estadoDelJuego;

    /**
     * Getter del estado actual del Juego.
     * @return el estado del juego.
     */
    public String getEstadoDelJuego() {
        return estadoDelJuego;
    }

    /**
     * Metodo auxiliar para establecer el estado del juego cada que un personaje haga
     * algún movimiento o cosas de ese estilo, tambíen cuando pierda.
     * @param estadoDelJuego el estado actual del juego que queremos notificar a 
     * todos los espectadores.
     */
    public void setEstadoDelJuego(String estadoDelJuego) {
        this.estadoDelJuego = estadoDelJuego;
    }

    /**
     * Este metodo nos va a ayudar a ir agregando espectadores al evento, a los cuales
     * les va a llegar toda la información que este notifique a dichos espectadores.
     * @param espectador El Espectador que queremos registrar.
     */
    @Override
    public void registrar(Espectador e){
        espectadores.add(e);
    }

    /**
     * Este metodo principalmente, nos va a ayudar a que los espectadores si es que
     * ellos quieren, dejen de ver el evento por x o y razones.
     * @param espectador El espectador que queremos remover.
     */    
    @Override
    public void remover(Espectador e){
        espectadores.remove(e);
    }

    /**
     * Este metodo sirve para poder notificar a todos los espectadores que esten
     * registrados, el estado del juego en un momento específico.
     */    
    @Override
    public void notificar(){
        for(Espectador espectador: espectadores){
            espectador.actualizar();
        }
    }

    /**
     * Metodo pensado para no estar llamando a cada rato el metodo notificar, y que
     * se haga automaticamente cada que ponemos un mensaje en el videojuego.
     * @param estadoDelJuego El estado actual del juego que queremos notificar a todos
     * los espectadores.
     */
    public void setYNotificar(String estadoDelJuego){
        setEstadoDelJuego(estadoDelJuego);
        notificar();
    }
}