package personajes.korby;

import personajes.Personaje;

/**
 * 
 */
public class Korby extends Personaje{

    /* El poder que se le dara a Korby dependiendo de a quien se vaya a comer, duerante
    el juego (4 opciones por el momento, PoderPorDefecto, Browser, DonMauricio y Quikong)*/
    PoderKorby poder;

    /**
     * Constructor unico y por defecto del personaje Korby.
     */
    public Korby(){
        super(200,30,.3);
    }

    /**
     * Getter del nombre del personaje
     * @return nombre del personaje
     */
    public String getNombre(){
        return "Korby";
    }

    /**
     * Metodo que nos ayuda a que Korbi se coma a otros personajes de la franquicia 
     * nientiendo  y por ende que adquiera las habilidades de dichos personajes,
     * por el momento solo hay 4 poderes activos: PoderPorDefecto, Browser, DonMauricio y Quikong
     * @param poder el poder al que quieres cambiar a Korby
     */
    public void comer(PoderKorby poder){
        this.poder = poder;
    }


    /**
     * Metodo para poder visualizar a Korby y sus atributos.
     * @return Un string con con la visualización de Korby y su caracteristicas
     */
    @Override
    public String verPersonaje(){
        String p ="";
        p += "                            ⠀⣀⣤⣤⠶⠶⠶⠶⠶⠤⠄⠤⠤⠄⠀"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠶⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ "+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠟⠁⠀⢀⣠⣤⡄⠀⠀⠀⢠⡤⣄⠀⠀⠀⠀⠀⠀⠀⠀"+"\n";
        p += "               ⠀⠀⠀⢀⣀⡴⠋⠀⠀⠀⣰⣸⠁⣸⡇⠀⠀⣠⡟⠀⣹⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠲⠤⠤⠤⠤⣄⡀"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⠖⠛⠉⢁⠀⠀⠀⠀⠀⣾⣿⣤⣿⢳⠀⢀⣿⣷⣴⣿⠰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠲⢦⣄"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠛⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⣿⣿⣿⡿⠈⠀⠀⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠀"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡟⠁⠀⠀⠀⢀⡞⠀⠀⢀⣀⣀⠀⡿⣿⣿⡇⠀⠀⠰⢿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠓⢦⡀⠀⠀⠘⣆ "+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠀⠀⣀⣀⠀⠀⠀⢸⣿⣥⣩⡿⠃⠹⠯⡀⣀⣀⠀⠨⠽⠋⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⢲⣮⣍⣉⣓⣀⣁⠀⠀⠁⠘⢦⠀" + "\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⣼⡃⠀⠠⠤⢵⡏⢸⠆⠀⠈⠉⠉⠉⠀⠀⠀⢻⢿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡀⠀⠉⠉⠉⠉⠁⠀⠀⠀⠘⣆⠀"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⣼⠃⠃⠀⠀⠀⠀⣇⡎⡄⠀⠀⠀⠀⠀⠀⠀⠀⠈⠈⠉⠙⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⠀"+"\n";
        p += "⠀⠀⠀⠀⢀⣤⠾⢫⢀⠀⠀⠀⠀⠀⣿⣰⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⣷⣿⡂⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⡄"+"\n";
        p += "⠀⠀⠀⢠⡿⠁⠀⠈⣿⢀⠀⢀⣤⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡟⠈⠻⣿⣦⣄⠀⠀⠀⠀⠀⠀⠈⠇"+"\n";
        p += "⠀⠀⠀⣾⡇⠀⠀⠀⠙⠻⣷⣾⣿⡿⠟⠉⢿⡃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡿⠁⠀⠀⠈⠙⣿⠃⣤⠀⠀⠀⠀⠀⠀⠀"+"\n";
        p += "⠀⠀⢰⡿⠀⠀⠀⢰⣶⠚⠋⣹⣿⠃⠀⠀⠈⢿⣠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡿⠁⠀⠀⠀⠀⠘⢿⣦⣽⡄⠀⠀⠀⠀⠀⠀"+"\n";
        p += "⠀⠀⣼⠁⠀⠀⢀⡿⣹⢄⣿⡿⠃⠀⠀⠀⠀⠈⠻⣷⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣶⣾⠟⠁⠀⠀⠀⠀⠀⠀⠈⠛⢿⣧⠀⠀⠀⠀⠀⠀"+"\n";
        p += "⠀⢸⠇⠀⠀⢠⣿⣿⠿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠶⠛⠉⠁⠀⠐⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠀⠀⠀⠀⠀⠀"+"\n";
        p += "⠀⣾⠀⠀⠀⠈⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠉⠻⠷⣤⣄⣀⡀⠀⠀⢀⣤⣀⣤⡾⠟⠁⠀⠀⠀⠀⠀⠀⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣷⣄⣀⡀⠀⠀⠀⠀"+"\n";
        p += "⢰⠇⡄⠀⠀⢁⣈⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⢿⠀⠀⠀⠀⠀⠈⠙⠛⠿⣿⣿⣿⣿⡟⠁⠀⠀⣦⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⣏⣟⠉⣹⣿⡆⠀⠀⠀"+"\n";
        p += "⢸⣿⡇⢠⡿⠛⣧⣽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⠸⣇⠀⠀⠀⠀⠀⠀⠀⠀⣾⡟⠀⠈⣷⡆⠀⠀⠸⣦⠀⠀⠀⠀⢠⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⢿⣾⠟⠋⣧⢀⣤⣴ "+"\n";
        p += "⠈⣿⣥⡟⠀⠀⠿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⡀⣿⣤⠀⠀⠀⠀⠀⠀⣰⣾⠃⠀⠀⠈⣷⣦⠀⠀⠘⣷⠀⠀⠀⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⣼⡾⠏ "+"\n";
        p += "⠸⣷⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣷⣿⣿⣿⣀⠀⠀⠀⣼⣿⠃⠀⠀⠀⠀⠈⢿⣆⠀⠀⣹⣄⣶⣾⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⠉⠀⠀"+ "\n";
        p += "⠀⠈⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣮⣿⣝⣦⣄⣠⣿⠇⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⠃⠉⢛⠛⡇⠀"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⡎⡌⠙⢿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣧⣄⡴⠾⢟⣧⠀"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣟⣻⢾⣦⡽⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣶⡾⠟⢸⣇ "+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⢽⡿⢛⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⠛⠒⠀⠀⣻⡄"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⠀⢠⣿⠀⠸⣇⠀⠀⢀⣼⡇"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⠀⠀⠀⠀⠀⣶⣿⠀⠀⠀⠀⠀⠀⠀⠈⢿⣠⠀⢿⡀⠀⠀⡿⠀"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⣴⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣦⣨⠃⠀⢰⡇⠀"+"\n";
        p += "                       ⠀⠀⠀⢹⠀⠀⠀⣴⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡭⠄⠀⢸⠀⠀"+"\n";
        p += "                       ⠀⠀⠀⣿⣤⣄⣀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⢿⣿⡆⠀"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣾⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⡀⡹⣷⡀"+"\n";
        p += "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⣟⣿⣿⣿⣻⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣟⣿⣽⣿⣦⡀";
        p += "###############################################################################\n";
        p += "Nombre: " + this.getNombre() + "\n";
        p += "Vida: " + this.getVida() + "\n";
        p += "Ataque: " + this.getAtaque() + "\n";
        p += "Defensa: " + this.getDefensa() + "\n";
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
     * Metodo auxiliar pensado para que cada que ataques a un personaje
     * te devuleva el como lo atacaste.
     * Es el mensaje de ataque que va a tener el personaje dependiendo de en que 
     * chinpokomon se transforme.
     * @param a Es el personaje que es atacado por Korby.
     * @return Un string de como el personaje p ataco al personaje a.
     */
    @Override
    public String mensajeAtaque(Personaje a){
        return poder.mensajeAtaque(a);
    }

    /**
     * Metodo auxiliar pensado para que cada que alguien te ataque, si es que te
     * alcancaste a defender te devuelva el como te defendiste.
     * Es el mensaje de defensa que va a tener el personaje dependiendo de en que
     * chinpokomon se transforme.
     * @param p Es el personaje que ataca a Korby.
     * @return Un string de como el personaje d se defendio del personaje p.
     */
    @Override
    public String mensajeDefensa(Personaje p){
        return poder.mensajeDefensa(p);
    }
}