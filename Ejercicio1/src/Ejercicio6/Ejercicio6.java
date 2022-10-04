package Ejercicio6;

import java.io.File;

public class Ejercicio6 {
    public static void main(String[] args) {
        ProcessBuilder pb=new ProcessBuilder("java","src\\Ejercicio6\\TicketCompra.java");
        pb.redirectOutput(new File("salida.txt"));
        try{
            Process p=pb.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
