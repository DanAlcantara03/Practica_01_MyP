import evento_juego.*;

/**
 * Esta va a ser la clase main en donde vamos a crear las peleas para probar a los 
 * personajes y como es que funcióna la transmisión del evento a 4 espectadores 
 * específicos.
 */
public class ProbarJuego {

    public static void main(String [] args){

        /* Las peleas creadas aleatoriamente */
        Peleas combates = new Peleas();
        /* El evento de juego que vamos a transmitir */
        EventoDeJuego evento = new EventoDeJuego();

        /* Los espectadores. */
        Espectador esp1 = new Espectador("esp1", "Korby", evento);
        Espectador esp2 = new Espectador("esp2", "MeganMan", evento);
        Espectador esp3 = new Espectador("esp3", "Dittuu", evento);
        Espectador esp4 = new Espectador("esp4", "Korby", evento);

        for (String estado: combates.PeleaAleatoria()){
            evento.setYNotificar(estado);
        }
    }
}