import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = leer.nextInt();

        System.out.println("Tabla del " + num);
        for (int i = 1; i <= 10; i++) {

            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);

        }
    }
}
