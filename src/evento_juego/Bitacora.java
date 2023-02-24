package evento_juego;

import java.io.*;

/**
 * Clase pensada para que nos sea más facil crear y agregar texto
 * a la bitacora de cada Espectador.
 */
public class Bitacora {

    /* El path en el que va a estar guardada la bitacora */
    String path;
    /* El objeto con el que vamos a escribir la bitacora */
    Writer bitacora;

    /**
     * Constructor de la clase Bitacora.
     * @param path la ruta en donde quieres guradar la bitacora
     */
    public Bitacora(String path){
        this.path = path;
        crearBitacora(path);
    }

    /**
     * Getter del path en donde se encuentra la bitacora
     * @return el path de la bitacora
     */
    public String getPath(){
        return path;
    }

    /**
     * Metodo auxiliar para poder crear la bitacora en la ruta especificada.
     * @param bitacora un objeto File para poder crear una bitacora
     */
    private void crearBitacora(String path){
        try{
            bitacora = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(path))));
        }catch(IOException ioe){}
    }

    /**
     * Metodo que nos va a ayudar a escribir sobre la bitacora lo que necesitemos.
     * @param texto El texto que queremos escribir en la bitacora.
     */
    public void escribir(String texto){
        try{
            bitacora.write(texto + "\n");
        }catch(IOException e){}
    }

}
