package personajes.dittuu;

/**
 * Clase que modela un poder especifico de Dittuu
 */
public class Miawmbo implements PoderDittuu{

    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a dittuu.
     * Decidimos que este poder no le sube el poder de ataque a dittuu.
     * @return 0
     */
    @Override
    public int poderAtaque(){
        return 0;
    }

    /**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a dituu.
     * Decidimos que este poder le subira la defensa a ditu un 40%
     * @return 0.4
     */
    @Override
    public double poderDefensa(){
        return 0.4;
    }

    /**
     * Metodo para representar en un String como es que Dittuu golpeo a alguien.
     * @param a El nombre del personaje al que ataco dittuu.
     * @return Un mensaje de un ataque normal de Dittuu.
     */
    @Override
    public String mensajeAtaque(String a){
        String msj = "Dittuu golpeo a " + a + ".";
        return msj;
    }

    /**
     * Metodo para representar en un String como es que Dittuu se defendio de alguien.
     * @param p El nombre del personaje que ataco a dittuu.
     * @return Un mensaje de la defensa de dittuu con este poder.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "";
        msj += "Dittuu se ha transformado en Miawmbo esquivando algunos ataques de " + p;
        msj += " mientras baila UNA GATITA QUE LE GUSTA EL MAMBO\n";
        //msj += "(Su defensa aumento un 40%).";
        return msj;
    }
}