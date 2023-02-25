package personajes.meganman;

import personajes.Personaje;

/**
 * Interfaz que modela un poder en especifico que puede llegar a tener MeganMan 
 * al derrotar algún robot y adquirir sus poderes.
 */
public interface PoderMeganMan{

    /* Mensaje por defecto del ataque que viene en la interfaz. */
    public String MSJ_ATAQUE = " golpeo a ";
    /* Mensaje por defecto al defenderse que viene en la interfaz. */
    public String MSJ_DEFENDIENDO = " se defendio de ";

    /**
     * Metodo que posiblemente va a aumentar el ataque de MeganMan mediante un poder que le 
     * especifiquemos en la implementación.
     * "Si no queremos que este metodo haga practicamente nada, entonces, que regrese 0 si
     * sumamos el ataque, o 1 si lo multiplicamos por el poder que ya tiene el personaje"
     * Este metodo esta pensado para ser usado en conjunto con el metodo abstracto ataque()
     * de la clase Personaje sobre MeganMan, al implementar dicho metodo de manera que usaremos
     * el ataque por defecto de MeganMan y le añadiremos este ataque extra.
     * @return El poder de ataque extra que se le quiere agregar al personaje.
     */
    public int poderAtaque();

    /**
     * Metodo que posiblemente va a aumentar la defensa de MeganMan mediante un poder que le 
     * especifiquemos en la implementación.
     * "Si no queremos que este metodo haga practicamente nada, entonces, que regrese 0 si
     * sumamos la defensa"
     * Este metodo esta pensado para ser usado en conjunto con el metodo abstracto defensa
     * de la clase Personaje sobre MeganMan, al implementar dicho metodo, de manera que usaremos
     * la defensa por defecto de MeganMan y le añadiremos esta defensa extra.
     * @return La defenza extra que se le quiere agregar a MeganMan.
     */
    public double poderDefensa();

    /**
     * Metodo que nos ayuda a visualizar como es que al agregarsele mas poder a meganman
     * ataca con mayor fuerza a sus oponentes.
     * @param p Meganman.
     * @param a Es el personaje que es atacado.
     * @return Un string con las especificaciónes de como con este poder es que MeganMan
     * 
    */
    public String mensajeAtaque(Personaje p, Personaje a);

    /**
     * Metodo que nos ayuda a visualizar como es que al agregarle mas poder de defensa a
     * meganman se defiende con mayor eficazia de sus oponentes.
     * @param d Meganman.
     * @param p Es el personaje que ataca.
     * @return Un string con las especificaciones de como con este poder es que MeganMan
     * se defendio del personaje p.
     */
    public String mensajeDefensa(Personaje d, Personaje p);
}