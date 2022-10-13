package Ejercicio9;

import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        InputStream is;
        OutputStream os;
        Runtime r=Runtime.getRuntime();
        try{
        Process p=r.exec(new String[]{"java", "src\\Ejercicio9\\PreguntaNombre.java"});
        os=p.getOutputStream();
            is=p.getInputStream();
            BufferedReader reader=new BufferedReader(new InputStreamReader(is));
            System.out.println(reader.readLine());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
