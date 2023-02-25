package personajes.korby;

/**
 * Clase necesaria para que todos los metodos de Korby funciones tanto con poderes
 * como sin poderes, esta clase como dice su nombre es por defecto
 */
public class PoderPorDefecto implements PoderKorby{
    
    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a Korby.
     * Como este es el poder de ataque por defecto de Korby solo va a regresar 0.
     * @return 0.
     */
    @Override
    public int poderAtaque(){
        return 0;
    }

    /**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a Korby.
     * Como este es el poder de defensa por defecto de Korby solo va a regresar 0.
     * @return 0;
     */
    @Override
    public double poderDefensa(){
        return 0;
    }

    /**
     * Metodo para representar en un String como es que Korby golpeo a alguien.
     * @param a El nombre del personaje al que ataco Korby.
     * @return Un mensaje de un ataque normal de Korby.
     */
    @Override
    public String mensajeAtaque(String a){
        String msj = "Korby golpeo a " + a + ".";
        return msj;
    }

    /**
     * Metodo para representar en un String como es que Korby se defendio de alguien.
     * @param p El nombre del personaje que ataco a Korby.
     * @return Un mensaje de un ataque normal de Korby.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "Korby se defendio de " + p + ".";
        return msj;
    }
}