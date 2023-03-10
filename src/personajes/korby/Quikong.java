package personajes.korby;

/**
 * Clase que modela un poder especifico de Korby
 */
public class Quikong implements PoderKorby{

    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a Korby.
     * Decidimos que este poder le suira 40 puntos de ataque a Korby.
     * @return 40
     */
    @Override
    public int poderAtaque(){
        return 40;
    }

    /**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a Korby.
     * Decidimos que este poder no le subira la defensa a Korby.
     * @return 0
     */
    @Override
    public double poderDefensa(){
        return 0;
    }

    /**
     * Metodo para representar en un String como es que Korby golpeo a alguien.
     * @param a El nombre del personaje al que ataco Korby.
     * @return Un mensaje de la defensa de Korby con este poder.
     */
    @Override
    public String mensajeAtaque(String a){
        String msj = "";
        msj += "Korby se ha comido a Quikong y aplasta a " + a + " con sus puños";
        //msj += "Su ataque se ha aumentado 40";
        return msj;
    }

    /**
     * Metodo para representar en un String como es que Korby se defendio de alguien.
     * @param p El nombre del personaje que ataco a Korby.
     * @return Un mensaje de la defensa normal de Korby.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "Korby se defendio de " + p + ".";
        return msj;
    }
}