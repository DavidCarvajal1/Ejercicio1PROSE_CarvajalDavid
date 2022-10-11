package Ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        //Declaramos variables
        Scanner sc=new Scanner(System.in);
        String ip;
        int clase;
        //Filtramos las IP de clase a b c
        for (int i = 0; i < 10; i++) {
            ip=sc.nextLine();
            clase=Integer.parseInt(ip.split(",")[0]);//Cogemos la primera parte de la ip
            if(clase<224){
                System.out.println(ip);
            }
        }
    }
}
