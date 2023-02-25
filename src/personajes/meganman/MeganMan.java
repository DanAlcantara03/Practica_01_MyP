package personajes.meganman;

import personajes.Personaje;

/**
 * Clase que modela al personaje MeganMan de la franquicia Copcam, este personaje
 * tiene la habilidad de replicar los poderes de los robots que derrota, para
 * así usar dichos poderes a su favor.
 */
public class MeganMan extends Personaje{
    
    /* El poder que se le dara a MeganMan dependiendo de a que poder se quiera cambiar
    durante el juego (4 opciones por el momento, PoderPorDefecto, Bake, GranOjo y
    Wachador) */
    PoderMeganMan poder;

    /**
     * Constructor unico y por defecto del personaje Meganman.
     */
    public MeganMan(){
        super(200,30,.3);
        poder = new PoderPorDefectoM();
    }

    /**
     * Getter del nombre del personaje
     * @return nombre del personaje
     */
    public String getNombre(){
        return "MeganMan";
    }

    /**
     * Metodo que nos ayuda a que MeganMan adquiera los poderes de robots derrotados
     * en la franquicia copcam y por ende que adquiera las habilidades de dichos personajes,
     * por el momento solo hay 4 poderes activos: PoderPorDefecto, Bake, GranOjo y Wachador.
     * @param poder el poder al que quieres cambiar a MeganMan.
     */
    public void replicar(PoderMeganMan poder){
        this.poder = poder;
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
        p +="####################" + "\n";
        p +="Nombre: " + this.getNombre() + "\n";
        p +="Vida: " + this.getVida() + "\n";
        p +="Ataque: " + this.getAtaque() + "\n";
        p +="Defensa: " + this.getDefensa() + "\n";
        return p;
    }

    /**
     * Es el ataque total que va a tener Meganman, esta conformado por su ataque
     * por default más un ataque que le de el poder dependiendo de cual tenga en el 
     * momento de la pelea.
     * @return El ataque total de Meganman.
     */
    @Override
    protected int ataque(){
        return  ataque + poder.poderAtaque();
    }

    /**
     * La defensa total que va a tener Meganman, esta conformada por su defensa por
     * default más una defensa que le de el poder, dependiendo de cual tenga en 
     * el momento de la pelea.
     * @return La defensa total de Meganman (un numero entre el intervalo [0,1]).
     */
    @Override
    protected double defensa(){
        return defensa + poder.poderDefensa();
    }

    /**
     * Metodo auxiliar pensado para que cada que Meganman golpee a un personaje
     * devuleva el como lo ataco.
     * Es el mensaje de ataque que va a tener el personaje dependiendo de que
     * robot adquiera sus poderes
     * @param a Es el nombre del personaje que es atacado por Meganman.
     * @return El mensaje de ataque del poder de MeganMan
     */
    @Override 
    public String mensajeAtaque(String a){
        return poder.mensajeAtaque(a);
    }

    /**
     * Metodo auxiliar pensado para que cada que alguien te ataque, si es que te
     * alcancaste a defender te devuelva el como te defendiste.
     * Es el mensaje de defensa que va a tener el personaje dependiendo de que
     * robot adquiera sus poderes
     * @param p Es el nombre del personaje que ataca a MeganMan.
     * @return Un string de como MeganMan se defendio del personaje p
     */
    @Override 
    public String mensajeDefensa(String p){
        return poder.mensajeDefensa(p);
    }

}
