package personajes.dittuu;

/**
 * 
 */
public class PoderPorDefecto implements PoderDittuu{
    

    @Override
    public int poderAtaque(){
        return 0;
    }

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