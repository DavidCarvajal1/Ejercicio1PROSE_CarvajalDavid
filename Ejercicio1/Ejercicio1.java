package Ejercicio1;

import java.util.Map;

public class Ejercicio1 {
    public static void main(String[] args) {
        ProcessBuilder pb=new ProcessBuilder();
        pb.inheritIO();
        Map<String, String> entorno=pb.environment();//Guardamos en un Map el entorno
        for (String key:entorno.keySet()) {//Iteramos mostrando los datos del map
            System.out.println("Key:" +key);
            System.out.println("Valor asociado: "+entorno.get(key)+System.lineSeparator());
        }
    }
}