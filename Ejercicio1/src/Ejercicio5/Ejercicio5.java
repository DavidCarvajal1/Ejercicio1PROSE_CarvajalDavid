package Ejercicio5;

import java.io.File;

public class Ejercicio5 {
    public static void main(String[] args) {
        ProcessBuilder pb=new ProcessBuilder("java", "src\\Ejercicio5\\PreguntaNombre.java");
        pb.inheritIO();
        pb.redirectInput(new File("src\\Ejercicio5\\Nombre.txt"));
        try {
            Process p = pb.start();
            p.waitFor();
            System.out.println("Proceso terminado");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
