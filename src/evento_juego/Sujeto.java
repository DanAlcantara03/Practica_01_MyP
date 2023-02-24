package evento_juego;

/**
 * Interfaz que modela al sujeto que quiere informar o comunicar
 * información a otros muchos objetos a los que llamaremos Sujetos.
 */
public interface Sujeto{

    /**
     * Este metodo nos va a ayudar a ir agregando observadores
     * al sujeto, a los cuales les va a llegar toda la información
     * que este notifque a dichos usuarios.
     * @param o El Observador que queremos registrar.
     */
    public void registrar(Espectador e);

    /**
     * Este metodo nos va a ayudar a que los observadores se 
     * remuevan por si solos si es que ya no quieren recibir información
     * de este sujeto.
     * @param o El Observador que queremos remover.
     */
    public void remover(Espectador e);

    /**
     * Este metodo sirve para poder notificar a todos los observadores
     * que esten registrados, la información que nos quiere transmitir 
     * el sujeto.
     */
    public void notificar();
}