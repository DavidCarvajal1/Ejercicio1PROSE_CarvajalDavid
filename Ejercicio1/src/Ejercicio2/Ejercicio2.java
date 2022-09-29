package Ejercicio2;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Directorio donde se encuentra la clase ProcesoLento
        File directorio=new File("src\\Ejercicio2");
        //Proceso que ejecutara la clase ProcesoLento
        ProcessBuilder pb=new ProcessBuilder("java", "ProcesoLento.java");
        pb.directory(directorio);
        pb.inheritIO();
        try {
            Process p = pb.start();//Iniciamos el proceso

            while (p.isAlive()){//Comprobamos si sigue vivo
                System.out.println("El porceso sigue activo");
                Thread.sleep(3000);
            }
            System.out.printf("Proceso finalizado");
        }catch (IOException e){
            System.out.printf("Error ejecutando el proceso");
        } catch (InterruptedException e) {
            System.out.printf("Proceso interrumpido");
        }
    }
}
