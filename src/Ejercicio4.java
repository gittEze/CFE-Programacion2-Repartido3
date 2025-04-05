import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num;

        do {
            System.out.println("Introduce un numero entre el 1 y el 5: ");
            num = leer.nextInt();
        } while (num < 1 || num >5);

    }
}
