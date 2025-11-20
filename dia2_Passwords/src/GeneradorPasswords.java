import java.util.Random;
import java.util.Scanner;

public class GeneradorPasswords{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        //Aqui añadiremos el conjunto de caracteres
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()-_=+<>?";
        String contrasena = letras;
        //Aqui inicializamos otras variables
        int longitud;
        boolean incluirNumeros = false;
        boolean incluirSimbolos = false;

        while (true) {
            //Preguntamos la longitud de la contraseña

            System.out.println("¿Que longitud necesitas en tu password?");
            if (teclado.hasNextInt()) {
            longitud = teclado.nextInt();
            teclado.nextLine();
            break;
            } else {
                System.out.println("Entrada inválida. Pruebe a insertar un número entero.");
                teclado.next();
            }
        }

        //Preguntamos ahora si la contraseña tendrá numeros o no
        while (true) {
            System.out.println("¿Quieres que incluya números? (s/n): ");
            String respuestaNumeros = teclado.nextLine().trim().toLowerCase();
            if (respuestaNumeros.equals("s")) {
                incluirNumeros = true;
                break;
            } else if (respuestaNumeros.equals("n")) {
                incluirNumeros = false;
                break;
            } else {
                System.out.println("Responde solo con 's' para SI o 'n' para NO");
            }
        }

        //Preguntamos ahora si la contraseña tendrá simbolos o no
        while (true) {
            System.out.print("¿Quieres que incluya símbolos? (s/n): ");
            String respuestaSimbolos = teclado.nextLine().trim().toLowerCase();
            if (respuestaSimbolos.equals("s")) {
                incluirSimbolos = true;
                break;
            } else if (respuestaSimbolos.equals("n")) {
                incluirSimbolos = false;
                break;
            } else {
                System.out.println("Responde solo con 's' para SI o 'n' para NO");
            }
        }

            //Aqui empieza a contruirse la contraseña segun los parametros elegidos

            if (incluirNumeros) contrasena += numeros;
            if (incluirSimbolos) contrasena += simbolos;


        //Ahora se genera la contraseña
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(contrasena.length());
            password.append(contrasena.charAt(index));
        }
        System.out.println("Tu contraseña ahora es: " + password);

        teclado.close();
    }
}