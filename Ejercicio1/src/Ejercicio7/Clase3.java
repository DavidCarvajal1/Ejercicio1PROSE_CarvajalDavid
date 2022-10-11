package Ejercicio7;

import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        //Inicializamos variables
        Scanner sc = new Scanner(System.in);
        String ip;
        int clase;
        //Las agrupamos por clases
        while (sc.hasNextLine()) {
            ip = sc.nextLine();
            clase = Integer.parseInt(ip.split(",")[0]);//Dividimos la primera parte de la IP
            if (clase < 128) {
                System.out.println(ip+" CLASE A");
            }else if(clase < 192){
                System.out.println(ip + " CLASE B");
            }else{
                System.out.println(ip +" CLASE C");
            }
        }

    }
}
