import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = leer.nextInt();

        int suma = 0;

        while(true) {
            System.out.println("Numero entero: ");
            num = leer.nextInt();
            if(num == 0) {
                break;
            }
            suma += num;
            System.out.println(suma);

        }
    }
}
