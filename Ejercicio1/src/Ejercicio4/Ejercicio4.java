package Ejercicio4;

import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Directorio donde se encuentra la clase ProcesoLento
        File directorio=new File("src\\Ejercicio4");
        //Proceso que ejecutara la clase ProcesoLento
        ProcessBuilder pb=new ProcessBuilder("java", "ProcesoLento.java");
        Process p;
        pb.directory(directorio);
        pb.redirectOutput(new File("src\\Ejercicio4\\salidaProcesoLento.txt"));
        try {
            p = pb.start();//Iniciamos el proceso

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
