package personajes.meganman;

/**
 * / Escribe lo que representa esta clase
 */
public class GranOjo implements PoderMeganMan{

    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a Meganman.
     * Decidimos que este poder le sube 45 puntos de poder de ataque a Meganman.
     * @return 45
     */
    @Override
    public int poderAtaque(){
        return 45;
    }

    /**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a Meganman.
     * Decidimos que este poder no le subira la defensa a Meganman.
     * @return 0
     */
    @Override
    public double poderDefensa(){
        return 0;
    }

    /**
     * Metodo para representar en un String como es que Meganman golpeo a alguien.
     * @param a El nombre del personaje al que ataco Meganman.
     * @return Un mensaje de un ataque con este poder de MeganMan.
     */
    @Override
    public String mensajeAtaque(String a){
        String msj = "";
        msj += "MeganMan ha adquirido los poderes de GranOjo lanzando conjuntivitis a " + a;
        msj += ", debilitandolo";
        //msj += "Se ha aumentado su ataque 45";
        return msj;
    }

    /**
     * Metodo para representar en un String como es que Meganman se defendio de alguien.
     * @param p El nombre del personaje que ataco a Meganman.
     * @return Un mensaje de la defensa de Meganman normal.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "MeganMan se defendio de " + p;
        return msj;
    }
}