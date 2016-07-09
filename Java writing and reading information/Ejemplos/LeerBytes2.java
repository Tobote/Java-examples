package Ejemplos;
/* Lectura de bytes: objeto BufferedInputStream(FileInputStream)
 * Programa que lee enteros almacenados en un archivo prueba.dat 
 * ubicado en la carpeta Ficheros(archivo prueba.dat creado en dicha carpeta)
 */

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerBytes2 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            File f = new File("src\\Ficheros\\prueba.dat");
            fis = new FileInputStream(f);
            bis = new BufferedInputStream(fis);

            byte[] contenido = new byte[4];//almacena cada entero leído

            int leidos = bis.read(contenido);
            while(leidos>0){//se sigue leyendo mientras que lo leido sea mayor que 0
                //proceso lo leido
                for(byte b:contenido){
                    if(b!=0){
                    System.out.println(b);
                    }
                }
                System.out.println("");
                leidos=bis.read(contenido);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerBytes2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerBytes2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(LeerBytes2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
