import java.util.Random;

public class Peleas{

    Random r = new Random();
    int random;

    public Peleas(){

        int random = r.nextInt(3);

    }

    public void escogePelea(){
        switch(random){
            case 0: 
                System.out.println("Pelea 1"); 
                break;

            case 1: 
                System.out.print("Pelea 2");
                break;

            case 2: 
                System.out.print("pelea 3");
                break;
        }
    }
}