package evento_juego;

import java.util.LinkedList;

/**
 * Clase que modela el modelo 
 * 
 */
public class EventoDeJuego implements Sujeto{

    /* La lista de los espectadores */
    LinkedList<Espectador> espectadores;
    /* String que va a tener el estado del juego. */
    String estadoDelJuego;

    /**
     * 
     * @return
     */
    public String getEstadoDelJuego() {
        return estadoDelJuego;
    }

    /**
     * 
     * @param estadoDelJuego
     */
    public void setEstadoDelJuego(String estadoDelJuego) {
        this.estadoDelJuego = estadoDelJuego;
    }

    @Override
    public void registrar(Espectador espectador){
        espectadores.add(espectador);
    }

    @Override
    public void remover(Espectador espectador){
        espectadores.remove(espectador);
    }

    @Override
    public void notificar(){
        for(Espectador espectador: espectadores){
            espectador.actualizar();
        }
    }
}