import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un número:");
        int numero = scanner.nextInt();
        int suma = 0;

        while (numero != 0) {
            suma = suma + numero % 10;
            numero = numero / 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}
