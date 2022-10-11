package Ejercicio8;

import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        Process p;
        String linea;
        try {
            p=r.exec(new String[]{"java","src\\Ejercicio8\\ProcesoLento.java"});
            InputStream is= p.getInputStream();
            BufferedReader lector=new BufferedReader(new InputStreamReader(is));
            linea=lector.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=lector.readLine();
            }
            is.close();
            lector.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
