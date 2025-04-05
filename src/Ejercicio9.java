import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String acceso = "admin";
        String pass;

        do{
            System.out.println("Ingrese una contraseña: ");
            pass = leer.nextLine();
        } while(!pass.equals(acceso));

        System.out.println("Acceso exitoso");

    }
}
