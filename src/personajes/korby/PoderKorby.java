package personajes.korby; 

/**
 * Interfaz que modela un poder en especifico que puede 
 * llegar a tener Korby comiendose a otro personaje de Nientiendo.
 */
public interface PoderKorby {

    /**
     * Metodo que posiblemente va a aumentar el ataque de Korby mediante un poder que le 
     * especifiquemos en la implementación.
     * "Si no queremos que este metodo haga practicamente nada, entonces, que regrese 0 si
     * sumamos el ataque, o 1 si lo multiplicamos por el poder que ya tiene el personaje"
     * Este metodo esta pensado para ser usado en conjunto con el metodo abstracto ataque()
     * de la clase Personaje sobre Korby, al implementar dicho metodo de manera que usaremos
     * el ataque por defecto de Korby y le añadiremos este ataque extra.
     * @return El poder de ataque extra que se le quiere agregar al personaje.
     */
    public int poderAtaque();

    /**
     * Metodo que posiblemente va a aumentar la defensa de Korby mediante un poder que le 
     * especifiquemos en la implementación.
     * "Si no queremos que este metodo haga practicamente nada, entonces, que regrese 0 si
     * sumamos la defensa"
     * Este metodo esta pensado para ser usado en conjunto con el metodo abstracto defensa
     * de la clase Personaje sobre Korby, al implementar dicho metodo, de manera que usaremos
     * la defensa por defecto de Korby y le añadiremos esta defensa extra.
     * @return La defenza extra que se le quiere agregar a Korby.
     */
    public double poderDefensa();

    /**
     * Metodo que nos ayuda a visualizar como es que se le agrega mas ataque a Korby
     * al convertirse en otro personaje de Nientiendo comiendoselo.
     * @return Un string con las especificaciónes de como con este poder es que Korby
     * aumento su ataque o "" en caso de que este poder no suba el ataque si no solo 
     * la defensa.
    */
    public String mensajeAtaque();

    /**
     * Metodo que nos ayuda a visualizar como es que se le agrega la defensa a Korby
     * al convertirse en otro personaje de Nientiendo comiendoselo
     * @return Un string con las especificaciónes de como con este poder es que Korby
     * aumento su defensa o "" en caso de que este poder no suba la defensa si no solo
     * el ataque.
     */
    public String mensajeDefensa();
}
