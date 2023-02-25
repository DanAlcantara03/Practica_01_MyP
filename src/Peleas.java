
import java.util.Random;
import java.util.LinkedList;
import personajes.*;
import personajes.korby.*;
import personajes.dittuu.*;
import personajes.meganman.*;

/**
 * Clase para modelar las peleas que se pueden hacer entre los personajes
 */
public class Peleas{

    /* El random con el que se van a hacer aleatorias las peleas */
    private Random r = new Random();
    /* Los personajes que queremos que peleen. */
    private Korby korby ;
    private MeganMan meganman;
    private Dittuu dittuu;

    /**
     * Constructor en el que se inicializan los personajes de las peleas
     */
    public Peleas(){
        this.korby = new Korby();
        this.meganman = new MeganMan();
        this.dittuu = new Dittuu();
    }

    /**
     * Metodo para crear una pelea aleatoria entre los personajes que creamos para el
     * videojuego.
     * @return La lista con los strings de todo lo que paso en la pelea aleatoria.
     */
    public LinkedList<String> PeleaAleatoria(){        
        LinkedList<String> combate = new LinkedList<String>();
        combate.add("Los combatientes son los siguientes:");
        combate.add(korby.verPersonaje());
        combate.add(meganman.verPersonaje());
        combate.add(dittuu.verPersonaje());
        while((estaVivo(dittuu) && estaVivo(korby))||(estaVivo(dittuu) && estaVivo(meganman)) || (estaVivo(korby) && estaVivo(meganman))){
            int c = r.nextInt(2);
            if(estaVivo(korby)){
                if(c == 0){
                    if(estaVivo(dittuu)){
                        combate.add(korby.atacar(dittuu));
                        poderAleatorioDittuu();
                    }
                }else{
                    if(estaVivo(meganman)){
                        combate.add(korby.atacar(meganman));
                        poderAleatorioMeganMan();
                    }
                }
                defenderseAleatrio(korby);
            }
            c = r.nextInt(2);
            if(estaVivo(dittuu)){
                if(c == 0){
                    if(estaVivo(korby)){
                        combate.add(dittuu.atacar(korby));
                        poderAleatorioKorby();
                    }
                }else{
                    if(estaVivo(meganman)){
                        combate.add(dittuu.atacar(meganman));
                        poderAleatorioMeganMan();
                    }
                }
                defenderseAleatrio(dittuu);
            }
            c = r.nextInt(2);
            if(estaVivo(meganman)){
                if(c == 0){
                    if(estaVivo(korby)){
                        combate.add(meganman.atacar(korby));
                        poderAleatorioKorby();
                    }
                }else{
                    if(estaVivo(dittuu)){
                        combate.add(meganman.atacar(dittuu));
                        poderAleatorioDittuu();
                    }
                }
                defenderseAleatrio(meganman);
            }
        }

        if(estaVivo(korby)){
            combate.add("¡¡¡¡¡ Gano Korby !!!!!");
        }else if(estaVivo(dittuu)){
            combate.add("¡¡¡¡¡ Gano Dittuu !!!!!");
        }else{
            combate.add("¡¡¡¡¡ Gano MeganMan !!!!!");
        }
        return combate;
    }

    /**
     * Metodo para saber si un personaje esta muerto
     * @param p El personaje 
     * @return true si esta vivo false en otro caso.
     */
    private boolean estaVivo(Personaje p){
        return p.getVida() > 0;
    }

    /*
     * Metodo que nos ayuda a asignarle a korby un poder aleatorio
     */
    private void poderAleatorioKorby(){
        int c = r.nextInt(5);
        if(c == 0){
            korby.comer(new Browser());
        }else if(c == 1){
            korby.comer(new DonMauricio());
        }else if(c == 2){
            korby.comer(new Quikong());
        }else{
            korby.comer(new PoderPorDefectoK());
        }
    }

    /*
     * Metodo que nos ayuda a asignarle a Dittuu un poder aleatorio
     */
    private void poderAleatorioDittuu(){
        int c = r.nextInt(5);
        if(c == 0){
            dittuu.transformar(new Miawmbo());
        }else if(c == 1){
            dittuu.transformar(new Tristten());
        }else if (c == 2){
            dittuu.transformar(new VamooACalmarno());
        }else{
            dittuu.transformar(new PoderPorDefectoD());
        }
    }

    /*
     * Metodo que nos ayuda a asignarle a Dittuu un poder aleatorio
     */
    private void poderAleatorioMeganMan(){
        int c = r.nextInt(5);
        if(c == 0){
            meganman.replicar(new Bake());
        }else if(c == 1){
            meganman.replicar(new GranOjo());
        }else if(c == 2){
            meganman.replicar(new Wachador());
        }else{
            meganman.replicar(new PoderPorDefectoM());
        }
    }

    /**
     * Metodo que nos ayuda a defendernos con una probabilidad de 1/3
     * @param p El personaje que queremos que se defienda.
     */
    private void defenderseAleatrio(Personaje p){
        int c = r.nextInt(3);
        if(c == 0){
            p.defenderse();
        }else{
            p.bajarDefensa();
        }
    }
}