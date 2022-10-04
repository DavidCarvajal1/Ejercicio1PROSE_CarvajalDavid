package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner sc=new Scanner(System.in);
        Process p;
        ProcessBuilder pb;
        String lectura;

        System.out.printf("Introduzca el comando");
        lectura=sc.next();
        String [] comandos=lectura.split(" ");
        pb=new ProcessBuilder(comandos);
        pb.inheritIO();
        try{
            p=pb.start();
            int code= p.waitFor();
            System.out.println(code);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
