package personajes.meganman;

import personajes.Personaje;

public class MeganMan extends Personaje{
    
    PoderMeganMan poder;

    /**
     * Constructor unico y por defecto del personaje Dittuu.
     */
    public MeganMan(){
        super(200,30,.3);
    }

    /**
     * Getter del nombre del personaje
     * @return nombre del personaje
     */
    public String getNombre(){
        return "MeganMan";
    }

    @Override
    public String verPersonaje(){
        String p = "";
        p +="░░░░░░░░░░░░░░░░░░░░"+"\n";
        p +="░░░░░░░░▄▄▄▄░░░░░░░░"+"\n";
        p +="░░░░░▄███░░███▄░░░░░"+"\n";
        p +="░░░▄█████▄▄█████▄░░░"+"\n";
        p +="░░░██████░░██████░░░"+"\n";
        p +="░░█░█▀░░▀██▀░░▀█░█░░"+"\n";
        p +="░░█░█░░██░░██░░█░█░░"+"\n";
        p +="░░░▀█░░▄▄▄▄▄▄░░█▀░░░"+"\n";
        p +="░░░░░▀▄▄▀▀▀▀▄▄▀░░░░░"+"\n";
        return p;
    }

    @Override
    protected int ataque(){
        return  ataque + poder.poderAtaque();
    }

    @Override
    protected double defensa(){
        return defensa + poder.poderDefensa();
    }

    /**
     * Es el mensaje de ataque que va a tener el personaje dependiendo de que
     * robot adquiera sus poderes
     * @return El mensaje de ataque del poder de MeganMan
     */
    @Override 
    public String mensajeAtaque(){
        return poder.mensajeAtaque();
    }

     /**
     * Es el mensaje de defensa que va a tener el personaje dependiendo de que
     * robot adquiera sus poderes
     * @return El mensaje de defensa del poder de MeganMan
     */
    @Override 
    public String mensajeDefensa(){
        return poder.mensajeDefensa();
    }

}
