package personajes.dittuu; 

public class Tristten implements PoderDittuu{ 

    
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
        msj += "Dittuu se ha transformado en Tristten, llora como gata bajo la lluvia haciendo";
        msj += " que caigan rayos a sus contrincantes";
        // Lee las especificaciones para este metodo 
        return msj;
    }

    @Override
    public String mensajeDefensa(){
        String msj = "";
        return msj;
    }
}