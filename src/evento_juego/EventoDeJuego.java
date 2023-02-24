package evento_juego;

import java.util.LinkedList;

/**
 * 
 * 
 */
public class EventoDeJuego implements Sujeto{

    /* La lista de los espectadores */
    LinkedList<Espectador> espectadores;
    /*  */
    String estadoDelJuego;

    public String getEstadoDelJuego() {
        return estadoDelJuego;
    }

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
        // Vasques 
    }
}