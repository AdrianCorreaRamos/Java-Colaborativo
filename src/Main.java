import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("soy Aurelio");
        System.out.println("Y yo Adrian");


        double num1;
        double num2;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        num1 = in.nextDouble();
        System.out.println("Ingresa un segundo numero: ");
        num2 = in.nextDouble();

        Sum sum = new Sum(num1, num2);
        double result = sum.calculate();

        System.out.println("La suma es: " + result);

    }
}