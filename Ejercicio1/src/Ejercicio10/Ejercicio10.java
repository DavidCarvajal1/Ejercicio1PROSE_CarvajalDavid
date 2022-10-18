package Ejercicio10;

import java.io.IOException;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Creamos los procesbuilder
        ProcessBuilder pb1=new ProcessBuilder("cmd","/C","md", "C:\\pruebas\\carpeta1");
        ProcessBuilder pb2=new ProcessBuilder("cmd","/C","type","null",">", "C:\\pruebas\\carpeta1\\fichero1.txt");
        ProcessBuilder pb3=new ProcessBuilder("notepad","C:\\pruebas\\carpeta1\\fichero1.txt");
        try {
            //Ejecutamos el primer proceso y esperamos a que termine
            Process p1 = pb1.start();
            p1.waitFor();//Esperamos a que termine el proces1, ejecutaremos el proceso 2
            Process p2= pb2.start();
            p2.waitFor();//Esperamos a que termine el proceso2, ejecutamos el proceso3
            Process p3=pb3.start();
            p3.waitFor();
            } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
