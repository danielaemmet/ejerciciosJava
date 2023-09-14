import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Por favor, introduce el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Por favor, introduce el tercer número:");
        int num3 = scanner.nextInt();

        int min = Math.min(Math.min(num1, num2), num3);
        System.out.println("El mínimo de " + num1 + ", " + num2 + ", y " + num3 + " es: " + min);
    }
}
