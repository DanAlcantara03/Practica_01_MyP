package personajes.korby;

/**
 * / Escribe lo que representa esta clase
 */
public class Browser implements PoderKorby{

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
        msj += "Korby se ha comido a Browser y se ha escondido en su caparazon evitando los ataques";
        msj += "de sus contrincantes mientras busca como hackear el juego";
        msj += "Su defensa se ha aumentado 0.7";
        return msj;
    }
}