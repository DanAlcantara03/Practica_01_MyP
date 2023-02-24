package evento_juego;

/**
 * Interfaz que nos modela los objetos que van a observar lo que el objeto especifico 
 * de la interfaz Sujeto les quiere informar.
 */
public interface Observador{

    /** 
     * Metodo abstracto que sirve para actualizar la información
     * que nos esta enviando el Sujeto.
     */
    public void actualizar();
}