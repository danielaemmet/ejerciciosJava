import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        int mcd = calcularMCD(num1, num2);

        System.out.println("El Máximo Común Divisor de " + num1 + " y " + num2 + " es: " + mcd);

        scanner.close();
    }

    public static int calcularMCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return calcularMCD(num2, num1 % num2);
        }
    }
}
