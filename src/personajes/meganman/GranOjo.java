package personajes.meganman;

/**
 * / Escribe lo que representa esta clase
 */
public class GranOjo implements PoderMeganMan{

    @Override
    public int poderAtaque(){
        return 45;
    }

    @Override
    public double poderDefensa(){
        return 0;
    }

    @Override
    public String mensajeAtaque(){
        String msj = "";
        msj += "MeganMan ha adquirido los poderes de GranOjo lanzando conjuntivitis a sus";
        msj += "contrincantes debilitandolos";
        msj += "Se ha aumentado su ataque 45";
        return msj;
    }

    @Override
    public String mensajeDefensa(){
        String msj = "";
        return msj;
    }
}