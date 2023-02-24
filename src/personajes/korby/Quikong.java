package personajes.korby;

/**
 * / Escribe lo que representa esta clase
 */
public class Quikong implements PoderKorby{

    @Override
    public int poderAtaque(){
        return 40;
    }

    @Override
    public double poderDefensa(){
        return 0;
    }

    @Override
    public String mensajeAtaque(){
        String msj = "";
        msj += "Korby se ha comido a Quikong y aplasta a sus oponentes con sus puños";
        msj += "Su ataque se ha aumentado 40";
        return msj;
    }

    @Override
    public String mensajeDefensa(){
        String msj = "";
        return msj;
    }
}