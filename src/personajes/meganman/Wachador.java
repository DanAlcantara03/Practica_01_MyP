package personajes.meganman;

/**
 * / Escribe lo que representa esta clase
 */
public class Wachador implements PoderMeganMan{

    @Override
    public int poderAtaque(){
        return 0;
    }

    @Override
    public double poderDefensa(){
        return 0.7;
    }

    @Override
    public String mensajeAtaque(){
        String msj = "";
        return msj;
    }

    @Override
    public String mensajeDefensa(){
        String msj = "";
        msj += "MeganMan ha adquirido los poderes de Wachador prediciendo los ataques de sus";
        msj += "contrincantes para esquivarlos";
        msj += "Su defensa se ha aumentado 0.7";
        return msj;
    }
}