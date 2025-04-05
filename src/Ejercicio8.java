import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cuantos numeros positivos quieres sumar?");
        int cantidad = leer.nextInt();

        int contador = 0;
        int suma = 0;

        while(contador < cantidad) {
            System.out.println("Ingresa un numero positivo: ");
            int numero = leer.nextInt();

            if (numero > 0) {
                suma += numero;
                contador++;
            } else {
                System.out.println("El numero debe ser positivo.");
            }
        }

        System.out.println("La suma total es: " + suma);

    }
}
