package personajes.dittuu;


public class VamooACalmarno implements PoderDittuu{

    /**
     * Metodo para obtener el poder de ataque que le queremos agregaregar a dituu.
     * Decidimos que este poder no le subira el ataque a Korbu
     * @return 0
     */    
    @Override
    public int poderAtaque(){
        return 0;
    }

    /**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a dituu.
     * Decidimos que este poder le subira la defensa a dittuu un 60%
     * @return .6
     */
    @Override
    public double poderDefensa(){
        return .6;
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
        msj += "Dittuu se ha transformado en VamooACalmarno aumentando su defensa en la";
        msj += " posición VAMO A CALMARNO, por lo que ah reducido el ataque de " + p + ".";
        return msj;
    }

}