package personajes.dittuu;

import personajes.Personaje;

/**
 * Clase que modela al personaje Dittuu de la franquicia chimpokomon, este personaje
 * tiene la habilidad de que al ver otro chinpokomon, este se puede transformar
 * en dicho chinpokomon y por ende copiar sus características.
 */
public class Dittuu extends Personaje{

    /* El poder que se le dara a Dittuu dependiendo de a que poder se quiera cambiar
    durante el juego (4 opciones por el momento, PoderPorDefecto, Miawmbo, Tristten y
    VamooACalmarno)*/
    PoderDittuu poder;

    /**
     * Constructor unico y por defecto del personaje Dittuu.
     */
    public Dittuu(){
        super(200,30,.3);
    }

    /**
     * Getter del nombre del personaje
     * @return nombre del personaje
     */
    public String getNombre(){
        return "Dittuu";
    }

    /**
     * Metodo que nos ayuda a transformar a dituu en otro chinpokomon y por ende darle
     * las habilidades de dicho chinpokomon, por el momento solo hay 4 poderes
     * activos: PoderPorDefecto, Miawmbo, Tristten y VamooACalmarno.
     * @param poder el poder al que quieres cambiar a dittuu
     */
    public void transformar(PoderDittuu poder){
        this.poder = poder;
    }

    /**
     * Metodo que nos ayuda a visualizar como va a ser Dittuu y sus caracteristicas.
     * @return La información de ditu o el dibujo en ascii de Dittuu.
     */
    @Override
    public String verPersonaje(){
        String p = "";
        p += "   ⢠⡜⠛⠛⠿⣤⠀⠀⣤⡼⠿⠿⢧⡄"+"\n";
        p += "⣀⡶⠎⠁⠀⠀⠀⠉⠶⠶⠉⠁⠀⠀⠈⠹⢆⣀⣀"+"\n";
        p+="⣀⡿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠶⠶⠶⠶⣆"+"\n";
        p+="⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢣⡄"+"\n";
        p+="⠛⣧⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇"+"\n";
        p+="⠛⣧⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⠀⠀⠀⠀⢠⡼⠃"+"\n";
        p+="⠀⠀⠿⢇⡀⠀⠀⠀⠀⠀⠀⠀⠰⠶⠶⢆⣀⣀⣀⠀⠀⠀⠀⠀⠀⢸⡇"+"\n";
        p+="    ⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠀⠀⠀⠀⠀⠀  ⢸⡇"+"\n";
        p+="    ⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇"+"\n";
        p+="   ⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢣⣤"+"\n";
        p+="⠀⣶⡏⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿"+"\n";
        p+="⠿⣇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⢀⣀⣸⠿"+"\n";
        p+="⠀⠀⠙⢳⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⡞⠛⠛⠛⠛⠛⠛⣶⣶⣶⣶⡞⠛⠃"+"\n";
        return p;
    }

    /**
     * Es el ataque total que va a tener Dittuu, esta conformado por su ataque
     * por default más un ataque que le de el poder dependiendo de cual tenga en el 
     * momento de la pelea.
     * @return El ataque total de Dittuu.
     */
    @Override
    protected int ataque(){
        return  ataque + poder.poderAtaque();
    }

    /**
     * La defensa total que va a tener Dittuu, esta conformada por su defensa por
     * default más una defensa que le de el poder, dependiendo de cual tenga en el momento
     * de la pelea.
     * @return La defensa total de Dittuu (un numero entre el intervalo [0,1]).
     */
    @Override
    protected double defensa(){
        return defensa + poder.poderDefensa();
    }

    /**
     * Metodo auxiliar pensado para que cada que ataques a un personaje
     * te devuleva el como lo atacaste.
     * Es el mensaje de ataque que va a tener el personaje dependiendo de en que 
     * chinpokomon se transforme.
     * @param p Es el personaje que ataca.
     * @param a Es el personaje que es atacado.
     * @return Un string de como el personaje p ataco al personaje a.
     */
    @Override
    public String mensajeAtaque(Personaje p, Personaje a){
        return poder.mensajeAtaque();
    }

    /**
     * Metodo auxiliar pensado para que cada que alguien te ataque, si es que te
     * alcancaste a defender te devuelva el como te defendiste.
     * Es el mensaje de defensa que va a tener el personaje dependiendo de en que
     * chinpokomon se transforme.
     * @param d Es el personaje que se defiende.
     * @param p Es el personaje que ataca.
     * @return Un string de como el personaje d se defendio del personaje p.
     */
    @Override
    public String mensajeDefensa(Personaje d, Personaje p){
        return poder.mensajeDefensa();
    }
}