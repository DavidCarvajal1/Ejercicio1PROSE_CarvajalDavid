package Ejercicio6;

import java.io.File;

public class Ejercicio6 {
    public static void main(String[] args) {
        ProcessBuilder pb=new ProcessBuilder("java","src\\Ejercicio6\\TicketCompra.java");
        pb.inheritIO();
        pb.redirectOutput(ProcessBuilder.Redirect.appendTo(new File("src\\Ejercicio6\\salida.txt")));
        try{
            Process p=pb.start();
            p.waitFor();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
