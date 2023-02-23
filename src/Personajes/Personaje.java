/**
 * Esta clase modela el comportamiento que un personaje de un videojuego
 * deberia tener.
 * @version 1.0
 */
public abstract class Personaje{

    /* La vida que tiene el personaje */
    private int vida;
    /* El ataque que tiene el personaje */
    private int ataque;
    /* Tiene que ser un número entre 0 y 1 */
    private double defensa;
    /* Nos ayuda a saber si el personaje tiene la defensa a activa o no */
    private boolean defensaActiva;

    /**
     * Constructor vacio.
     */
    public Personaje(){}

    /**
     * Constructor especialmente hecho para ser llamado por las clases que
     * heredan esta clase abstracta mediante la función super() 
     * @param vida Es la vida que va a tener el personaje se recomienda poner
     * un número que sea congruente para poder hacer que el ataque del oponente
     * baje lo suficiente para matarlo en 10-15 ataques().
     * @param ataque Es el ataque que va a tener el personaje se recomienda que sea
     * congruente para poder hacer que la vida del oponente no baje tan rapido.
     * @param defensa Esta variable está pensada para que sea un numero dentro del
     * intervalo [0,1], para que si es que algun otro personaje ataca a este personaje
     * entonces si es verdad la variable de clase defensaActiva el ataque del personaje
     * atacante se vea reducida en un porcentaje contrario a esta defensa.(ver metodo bajar vida)
     */
    protected Personaje(int vida, int ataque, int defensa){
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.defensaActiva = false;
    }

    /**
     * Metodo que nos ayuda a poder visualizar como es el personaje que vamos a poner
     * a pelear durante el videojuego.
     * @return La representación en cadena del personaje ya sea una imagen hecha con ____
     * o el estado del personaje i.e. la vida su ataque y su defensa, o ambas.
     */
    public abstract String verPersonaje();

    /**
     * Metodo para obtener la vida del personaje
     * @return Devuelve la vida del personaje
     */
    public int getVida() {
        return vida;
    }

    /**
     * Metodo para obtener el ataque del personaje
     * @return Devuelve el ataque del personaje
     */
    public int getAtaque(){
        return ataque;
    }

    /**
     * Metodo para obtener la defensa del personaje
     * @return Nos regresa una representación de la defensa del personaje en un rango
     * del 1 al 100.
     */
    public int defensa(){
        return (int)defensa*100;
    }
    
    /**
     * @param Personaje Es el personaje al cual queremos atacar.
     */
    public void atacar(Personaje p){
        p.bajarVida(ataque);
    }

    /**
     * Metodo auxiliar pensado para que durante la batalla el personaje tenga la 
     * opción de defenderse para asi recibir menos daño dependiendo de la defensa
     * propia del personaje.
     */
    public void defenderse(){
        defensaActiva = true;
    }

    /**
     * Metodo auxiliar pensado para que durante la batalla solo se pueda tener la 
     * caracteristica de defenderse durante cierto tiempo determinado o dada una 
     * condición
     */
    public void bajarDefensa(){
        defensaActiva = false;
    }

    /**
     * Metodo auxiliar que nos ayuda a bajarle la vida al personaje al atacarlo.
     * @param ataque El ataque del personaje que ataco a este personaje.
     */
    private void bajarVida(int ataque){
        if(defensaActiva){
            vida -= (ataque*(1-defensa));
        }else{
            vida -= ataque;
        }
    }
}