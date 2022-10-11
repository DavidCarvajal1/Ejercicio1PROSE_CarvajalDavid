package Ejercicio7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    public static void main(String[] args) {
        File salida=new File("src\\Ejercicio7\\salida.txt");//Fichero de salida
        //Creamos una lista de ProcessBuilders
        List<ProcessBuilder> lpb=new ArrayList<>();
        //Añadimos los ProcessBuilders a la lista, redireccionando los errores a la consola del programa actual
        lpb.add(new ProcessBuilder("java", "src\\Ejercicio7\\Clase1.java").redirectError(ProcessBuilder.Redirect.INHERIT));
        lpb.add(new ProcessBuilder("java", "src\\Ejercicio7\\Clase2.java").redirectError(ProcessBuilder.Redirect.INHERIT));
        lpb.add(new ProcessBuilder("java", "src\\Ejercicio7\\Clase3.java").redirectError(ProcessBuilder.Redirect.INHERIT).redirectOutput(salida));

        //Ejecutamos la lista de procesos
        try {
            ProcessBuilder.startPipeline(lpb);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
