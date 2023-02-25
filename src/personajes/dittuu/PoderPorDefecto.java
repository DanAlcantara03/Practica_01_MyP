package personajes.dittuu;

/**
 * Clase necesaria para que todos los metodos de Dittuu funciones tanto con poderes
 * como sin poderes, esta clase como dice su nombre es por defecto
 */
public class PoderPorDefecto implements PoderDittuu{
    
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

    @Override
    public String mensajeAtaque(){
        String msj = "";
        return msj;
    }

    @Override
    public String mensajeDefensa(){
        String msj = "";
        return msj;
    }
}