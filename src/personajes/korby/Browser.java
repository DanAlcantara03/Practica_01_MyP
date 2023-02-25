package personajes.korby;

/**
 * Clase que modela un poder especifico de Korby.
 */
public class Browser implements PoderKorby{

    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a Korby.
     * Decidimos que este poder le suira 40 puntos de ataque a Korby.
     * @return 0
     */
    @Override
    public int poderAtaque(){
        return 0;
    }

/**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a Korby.
     * Decidimos que este poder le subira 65% de defensa a Korby.
     * @return 0.65
     */
    @Override
    public double poderDefensa(){
        return 0.65;
    }

    /**
     * Metodo para representar en un String como es que Korby golpeo a alguien.
     * @param a El nombre del personaje al que ataco Korby.
     * @return Un mensaje de la defensa de Korby normal.
     */
    @Override
    public String mensajeAtaque(String a){
        String msj = "Korby ah golpeado a " + a + ".";
        return msj;
    }

    /**
     * Metodo para representar en un String como es que Korby se defendio de alguien.
     * @param p El nombre del personaje que ataco a Korby.
     * @return Un mensaje el ataque de Korby con este poder.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "";
        msj += "Korby se ha comido a Browser y se ha escondido en su caparazon evitando los ataques";
        msj += "de" + p + "mientras busca como hackear el juego";
        //msj += "Su defensa se ha aumentado 0.7";
        return msj;
    }
}