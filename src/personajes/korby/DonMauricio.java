package personajes.korby;

/**
 * / Escribe lo que representa esta clase
 */
public class DonMauricio implements PoderKorby{

    @Override
    public int poderAtaque(){
        return 0;
    }

    @Override
    public double poderDefensa(){
        return 0.4;
    }

    @Override
    public String mensajeAtaque(){
        String msj = "";
        return msj;
    }

    @Override
    public String mensajeDefensa(){
        String msj = "";
        msj += "Korby se ha comido a Don Mauricio esquivando algunos ataques de sus oponentes";
        msj += "saltando por toda la arena";
        msj += "Su defensa se ha aumentado 0.4";
        return msj;
    }
}