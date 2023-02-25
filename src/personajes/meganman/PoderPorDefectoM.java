package personajes.meganman;

/**
 * Clase necesaria para que todos los metodos de Meganman funciones tanto con poderes
 * como sin poderes, esta clase como dice su nombre es por defecto
 */
public class PoderPorDefectoM implements PoderMeganMan{
    
    /**
     * Metodo para obtener el poder de ataque que le queremos agregar a Meganman.
     * Como este es el poder de ataque por defecto de Meganman solo va a regresar 0.
     * @return 0.
     */
    @Override
    public int poderAtaque(){
        return 0;
    }

    /**
     * Metodo para obtener el poder de defensa que le queremos agregaregar a Meganman.
     * Como este es el poder de defensa por defecto de Meganman solo va a regresar 0.
     * @return 0;
     */
    @Override
    public double poderDefensa(){
        return 0;
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
     * @return Un mensaje de un ataque normal de Meganman.
     */
    @Override
    public String mensajeDefensa(String p){
        String msj = "Meganman se defendio de " + p + ".";
        return msj;
    }
}