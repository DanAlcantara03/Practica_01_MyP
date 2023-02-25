package personajes.dittuu;

/**
 * Clase necesaria para que todos los metodos de Dittuu funciones tanto con poderes
 * como sin poderes, esta clase como dice su nombre es por defecto
 */
public class PoderPorDefectoD implements PoderDittuu{
    
    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a dittuu.
     * Como este es el poder de ataque por defecto de dittuu solo va a regresar 0.
     * @return 0.
     */
    @Override
    public int poderAtaque(){
        return 0;
    }

    /**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a dituu.
     * Como este es el poder de defensa por defecto de dituu solo va a regresar 0.
     * @return 0;
     */
    @Override
    public double poderDefensa(){
        return 0;
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
     * @return Un mensaje de un ataque normal de Dittuu.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "Dittuu se defendio de " + p + ".";
        return msj;
    }
}