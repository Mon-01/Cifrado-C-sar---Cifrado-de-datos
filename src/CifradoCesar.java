/**
 * Programa que implementa el cifrado y descifrado de texto usando el método César.
 * <p>
 * Este programa permite al usuario ingresar un texto junto con un número que se utilizará
 * como desplazamiento para cifrar el texto introducido por el usuario.
 * Además, en el resultado se incluye tanto el texto cifrado como descifrado.
 * </p>
 *
 * @author [Monica Nieto]
 * @version 1.0
 */



import java.util.Scanner;

public class CifradoCesar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Programa de Cifrado César ----");

        // Pedimos el texto a cifrar al usuario
        System.out.print("Ingresa el texto a cifrar: ");
        String texto = scanner.nextLine();

        // Pedimos un número al usuario, número empleado para cifrar el texto
        System.out.print("Ingresa el desplazamiento (número): ");
        int desplazamiento = scanner.nextInt();

        // Ciframos el texto proporcionado por el usuario
        String textoCifrado = Cifrar.cifrar(texto, desplazamiento);
        System.out.println("Texto cifrado: " + textoCifrado);

        // Desciframos el texto del usuario
        String textoDescifrado = Descifrar.descifrar(textoCifrado, desplazamiento);
        System.out.println("Texto descifrado: " + textoDescifrado);

        scanner.close();
    }
}
