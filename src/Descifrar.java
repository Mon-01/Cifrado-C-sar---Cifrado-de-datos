
/**
 * Descifra un texto cifrado con el método César.
 *
 * @param texto El texto cifrado a descifrar.
 * @param desplazamiento El número de posiciones usadas para cifrar.
 * @return El texto descifrado.
 */

public class Descifrar {

    public static String descifrar(String texto, int desplazamiento) {
        // Llamar a cifrar con el desplazamiento invertido
        return Cifrar.cifrar(texto, 26 - (desplazamiento % 26));
    }
}
