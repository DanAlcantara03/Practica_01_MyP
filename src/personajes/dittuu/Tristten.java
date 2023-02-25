package personajes.dittuu; 

public class Tristten implements PoderDittuu{ 

    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a dittuu.
     * Decidimos que este poder le sube 25 de ataque a dittuu
     * @return 25
     */
    @Override
    public int poderAtaque(){
        return 25;
    }

    /**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a dituu.
     * Decidimos que este poder no le subira la defensa a dittuu.
     * @return 0
     */
    @Override
    public double poderDefensa(){
        return 0;// Pon un numero que aumente la defensa entre [0-1]
    }

    /**
     * Metodo para representar en un String como es que Dittuu golpeo a alguien.
     * @param a El nombre del personaje al que ataco dittuu.
     * @return Un mensaje de un ataque normal de Dittuu.
     */
    @Override
    public String mensajeAtaque(String a){
        String msj = "";
        msj += "Dittuu se ha transformado en Tristten, llora como gata bajo la lluvia haciendo";
        msj += " que le caigan rayos a " + a + ".";
        return msj;
    }

    /**
     * Metodo para representar en un String como es que Dittuu se defendio de alguien.
     * @param p El nombre del personaje que ataco a dittuu.
     * @return Un mensaje de un ataque normal de Dittuu.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "Dittuu se a defendido de " + p;
        return msj;
    }
}