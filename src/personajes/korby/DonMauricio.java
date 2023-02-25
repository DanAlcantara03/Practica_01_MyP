package personajes.korby;

/**
 * Clase que modela un poder especifico de Korby.
 */
public class DonMauricio implements PoderKorby{

    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a Korby.
     * Decidimos que este poder no le subira puntos de ataque a Korby.
     * @return 0
     */
    @Override
    public int poderAtaque(){
        return 0;
    }

    /**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a Korby.
     * Decidimos que este poder le subira en un 40% la defensa a Korby.
     * @return 0.4
     */
    @Override
    public double poderDefensa(){
        return 0.4;
    }

    /**
     * Metodo para representar en un String como es que Korby golpeo a alguien.
     * @param a El nombre del personaje al que ataco Korby.
     * @return Un mensaje de un ataque normal de Korby.
     */
    @Override
    public String mensajeAtaque(String a){
        String msj = "Korby a golpeado a " + a;
        return msj;
    }

    /**
     * Metodo para representar en un String como es que Korby se defendio de alguien.
     * @param p El nombre del personaje que ataco a Korby.
     * @return Un mensaje de la defensa de Korby con este poder.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "";
        msj += "Korby se ha comido a Don Mauricio esquivando algunos ataques de " + p;
        msj += "saltando por toda la arena";
        //msj += "Su defensa se ha aumentado 0.4";
        return msj;
    }
}