package Ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ip;
        int clase;
        for (int i = 0; i < 10; i++) {
            ip=sc.nextLine();
            clase=Integer.parseInt(ip.split(",")[0]);
            if(clase<224){
                System.out.println(ip);
            }
        }
    }
}
