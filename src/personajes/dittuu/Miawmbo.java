package personajes.dittuu;

/**
 * / Escribe lo que representa esta clase
 */
public class Miawmbo implements PoderDittuu{

    @Override
    public int poderAtaque(){
        return 0;// Pon un numero que aumente el ataque
    }

    @Override
    public double poderDefensa(){
        return 1;
    }

    @Override
    public String mensajeAtaque(){
        String msj = "";
        msj += "Dittuu se ha transformado en Miawmbo esquivando los aqtaques de sus contrincantes";
        msj += " mientras baila UNA GATITA QUE LE GUSTA EL MAMBO";
        return msj;
    }

    @Override
    public String mensajeDefensa(){
        String msj = "";
        //Lee las especificaciones para este metodo
        return msj;
    }
}