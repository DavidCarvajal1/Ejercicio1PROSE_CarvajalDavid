package Ejercicio7;

public class Clase1 {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        for (int i = 0; i < 10; i++) {
            num1 = (int) (Math.random() * 255);
            num2 = (int) (Math.random() * 255);
            num3 = (int) (Math.random() * 255);
            num4 = (int) (Math.random() * 255);
            System.out.printf("%d,%d,%d,%d",num1,num2,num3,num4);
            System.out.print(System.lineSeparator());
        }
    }
}
