package personajes.meganman;

/**
 * / Escribe lo que representa esta clase
 */
public class Bake implements PoderMeganMan{

    @Override
    public int poderAtaque(){
        return 35;
    }

    @Override
    public double poderDefensa(){
        return 0;
    }

    @Override
    public String mensajeAtaque(){
        String msj = "";
        msj += "MeganMan ha adquirido los poderes de Bake y lanza bolillos duros a sus";
        msj += "contrincantes con su horno cañon";
        msj += "Se ha aumentado su ataque 35";
        return msj;
    }

    @Override
    public String mensajeDefensa(){
        String msj = "";
        return msj;
    }
}