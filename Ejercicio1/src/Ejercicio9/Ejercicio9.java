package Ejercicio9;

import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        OutputStream os;
        InputStream is;
        Runtime r=Runtime.getRuntime();
        try{
        Process p=r.exec(new String[]{"java", "src\\Ejercicio9\\PreguntaNombre.java"});
        os=p.getOutputStream();
        is=p.getInputStream();
        BufferedReader reader=new BufferedReader(new FileReader("src\\Ejercicio9\\entrada.txt"));
        BufferedReader salidaProceso= new  BufferedReader(new InputStreamReader(is));
            BufferedWriter entradaProceso=new BufferedWriter(new OutputStreamWriter(os));
            entradaProceso.write(reader.readLine());
            entradaProceso.close();
            System.out.println(salidaProceso.readLine());
            salidaProceso.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
