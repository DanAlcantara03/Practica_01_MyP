package personajes.dittuu;

/**
 * Interfaz que modela un poder en especifico que puede 
 * llegar a tener Dittuu con tan solo ver a otro chinpokomon.
 */
public interface PoderDittuu {

    /**
     * Metodo que posiblemente va a aumentar el ataque de dittuu mediante un poder que le 
     * especifiquemos en la implementación.
     * "Si no queremos que este metodo haga practicamente nada, entonces, que regrese 0 si
     * sumamos el ataque, o 1 si lo multiplicamos por el poder que ya tiene el personaje"
     * Este metodo esta pensado para ser usado en conjunto con el metodo abstracto ataque()
     * de la clase Personaje sobre Dittuu, al implementar dicho metodo, de manera que usaremos
     * el ataque por defecto de dittuu y le añadiremos este ataque extra.
     * @return El poder de ataque extra que se le quiere agregar al personaje.
     */
    public int poderAtaque();

    /**
     * Metodo que posiblemente va a aumentar la defensa de dittuu mediante un poder que le 
     * especifiquemos en la implementación.
     * "Si no queremos que este metodo haga practicamente nada, entonces, que regrese 0 si
     * sumamos la defensa"
     * Este metodo esta pensado para ser usado en conjunto con el metodo abstracto defensa
     * de la clase Personaje sobre Dittuu, al implementar dicho metodo, de manera que usaremos
     * la defensa por defecto de dittuu y le añadiremos esta defensa extra.
     * @return La defenza extra que se le quiere agregar a dittuu.
     */
    public double poderDefensa();

    /**
     * Metodo que nos ayuda a visualizar como es que se le agrega mas ataque a Dittuu
     * al convertirse en otro chinpokomon con solo mirarlo.
     * @return Un string con las especificaciónes de como con este poder es que dittu
     * aumento su ataque o "" en caso de que este poder no suba el ataque si no solo 
     * la defensa.
    */
    public String mensajeAtaque();

    /**
     * Metodo que nos ayuda a visualizar como es que se le agrega la defensa a Dittuu
     * al convertirse en otro chinpokomon con solo mirarlo
     * @return Un string con las especificaciónes de como con este poder es que dittuu
     * aumento su defensa o "" en caso de que este poder no suba la defensa si no solo
     * el ataque.
     */
    public String mensajeDefensa();
}
