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
     * Metodo
     */
    public String getNombre(){
        return "Dittuu";
    }

    /**
     * Constructor unico y por defecto del personaje Dittuu.
     */
    public Dittuu(){
        super(200,30,.3);
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
        // Aqui ve agregando o el dibujito del personaje o sus atributos
        //dependiendo del tiempo que te de
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

    @Override
    public String mensajeAtaque(){
        return "";
    }

    public String mensajeDefensa(){
        return "";
    }
}