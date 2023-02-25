package personajes.meganman;

/**
 * Clase que modela un poder especifico de MeganMan
 */
public class Wachador implements PoderMeganMan{

    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a Meganman.
     * Decidimos que este poder no le sube el poder de ataque a Meganman.
     * @return 0
     */
    @Override
    public int poderAtaque(){
        return 0;
    }

    /**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a Meganman.
     * Decidimos que este poder le subira la defensa a Meganman un 59%.
     * @return 0.59
     */
    @Override
    public double poderDefensa(){
        return 0.59;
    }

    /**
     * Metodo para representar en un String como es que Meganman golpeo a alguien.
     * @param a El nombre del personaje al que ataco Meganman.
     * @return Un mensaje de un ataque normal de Meganman.
     */
    @Override
    public String mensajeAtaque(String a){
        String msj = "Meganman golpeo a " + a + ".";
        return msj;
    }

    /**
     * Metodo para representar en un String como es que Meganman se defendio de alguien.
     * @param p El nombre del personaje que ataco a Meganman.
     * @return Un mensaje de la defensa de Meganman con este poder.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "";
        msj += "MeganMan ha adquirido los poderes de Wachador y ah predecido los ataques de" + p;
        msj += "para esquivarlos";
        //msj += "Su defensa se ha aumentado 0.7";
        return msj;
    }
}