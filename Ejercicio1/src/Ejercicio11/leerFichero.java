package Ejercicio11;

import java.io.BufferedReader;
import java.io.FileReader;

public class leerFichero {
    public static void main(String[] args) {
        String linea;
        try(BufferedReader reader=new BufferedReader(new FileReader("C:\\pruebas\\carpeta1\\fichero2.txt"))){
            linea=reader.readLine();
            while (linea!=null){
                System.out.println(linea);
                linea=reader.readLine();
            }
        }catch (Exception e){e.printStackTrace();}
    }
}
