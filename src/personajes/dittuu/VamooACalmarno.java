package personajes.dittuu;


public class VamooACalmarno implements PoderDittuu{

    
    @Override
    public int poderAtaque(){
        return 0;// Pon un numero que aumente el ataque
    }

    @Override
    public double poderDefensa(){
        return 1;// Pon un numero que aumente la defensa entre [0-1]
    }

    @Override
    public String mensajeAtaque(){
        String msj = "";
        // Lee las especificaciones para este metodo 
        return msj;
    }

    @Override
    public String mensajeDefensa(){
        String msj = "";
        msj += "Dittuu se ha transformado en VamooACalmarno aumentando su defensa en la";
        msj += " posición VAMO A CALMARNO";
        return msj;
    }

}