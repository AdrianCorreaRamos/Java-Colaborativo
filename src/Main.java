
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double num1;
        double num2;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        num1 = in.nextDouble();
        System.out.println("Ingresa un segundo numero: ");
        num2 = in.nextDouble();

        Sum sum = new Sum(num1, num2);
        double result = sum.calculate();

        resta resta1 = new resta(num1, num2);
        double result1 = resta1.calculate1();

        System.out.println("La suma es: " + result);
        System.out.println("La resta es: " + result1);

    }
}