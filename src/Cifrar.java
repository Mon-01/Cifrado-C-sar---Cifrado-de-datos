
/**
 * Cifra un texto usando el método César.
 *
 * @param texto El texto a cifrar.
 * @param desplazamiento El número de posiciones para desplazar las letras.
 * @return El texto cifrado.
 */

public class Cifrar {

    public static String cifrar(String texto, int desplazamiento) {
        StringBuilder cifrado = new StringBuilder();
        // Garantiza un desplazamiento dentro de las 26 letras del alfabeto
        desplazamiento = desplazamiento % 26;

        for (char caracter : texto.toCharArray()) {
            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                // Desplazar el carácter y se asegura de que esté dentro del rango alfabético
                char nuevoCaracter = (char) ((caracter - base + desplazamiento) % 26 + base);
                cifrado.append(nuevoCaracter);
            } else {
                // Mantenemos los espacios sin cambios
                cifrado.append(caracter);
            }
        }

        return cifrado.toString();
    }
}