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
            BufferedWriter escritor=new BufferedWriter(new FileWriter("src\\Ejercicio8\\salida.txt"));
            linea=lector.readLine();
            while(linea!=null){
                escritor.write(linea);
                escritor.newLine();
                linea=lector.readLine();
            }
            is.close();
            lector.close();
            escritor.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
