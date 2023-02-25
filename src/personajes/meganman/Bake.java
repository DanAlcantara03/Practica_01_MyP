package personajes.meganman;

/**
 * / Escribe lo que representa esta clase
 */
public class Bake implements PoderMeganMan{

    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a Meganman.
     * Decidimos que este poder le subira 35 puntos de ataque a MeganMan.
     * @return 35
     */
    @Override
    public int poderAtaque(){
        return 35;
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
        msj += "MeganMan ha adquirido los poderes de Bake y lanza bolillos duros a "+ a;
        msj += " con su horno cañon.";
        //msj += "Se ha aumentado su ataque 35";
        return msj;
    }

    /**
     * Metodo para representar en un String como es que Meganman se defendio de alguien.
     * @param p El nombre del personaje que ataco a Meganman.
     * @return Un mensaje de la defensa normal de Meganman.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "MeganMan se a defendido de " + p;
        return msj;
    }
}