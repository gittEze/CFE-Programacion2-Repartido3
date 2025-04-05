import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = leer.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
            System.out.println(factorial);

        }
    }
}
