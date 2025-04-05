import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int suma = 0;

        for(int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("Resultado suma del 1 al 100: " + suma);
    }
}
