Cifrado de Datos: Cifrado César
📌 ¿Qué hace el programa?
Este programa solicita al usuario un texto para cifrarlo. Además, pide un número que se utilizará para realizar el cifrado. Una vez ingresados el texto y el número, el programa devuelve el texto cifrado y descifrado.

📌 ¿Qué clases hay?
El programa cuenta con tres clases principales:

CifradoCesar: Contiene el método main, donde se solicita la entrada del usuario mediante la consola.
Cifrar: Incluye un método encargado de cifrar el texto ingresado.
Descifrar: Implementa un método inverso al de la clase Cifrar, permitiendo descifrar el texto.
📌 ¿Cómo funciona el programa internamente?
Desde la clase CifradoCesar (main), se utiliza Scanner para obtener los datos ingresados por el usuario. Posteriormente, se llaman a los métodos de las clases Cifrar y Descifrar para procesar la información.

🔹 Proceso de cifrado
En la clase Cifrar, se declara un StringBuilder llamado cifrado, donde se almacenará el texto cifrado. Esta clase mejora la eficiencia en la manipulación de grandes cadenas de texto.
Se define una variable desplazamiento, que almacena el número ingresado por el usuario. Se inicializa con % 26, lo que garantiza que, al llegar a la letra z, el cifrado vuelva a comenzar desde a.
Se convierte el texto del usuario en un array de tipo char y se recorre con un bucle for.
Dentro del bucle, se verifica si el carácter es una letra:
Si no lo es, se agrega directamente a cifrado.
Si lo es, se establece una base ('a') y un nuevo carácter (nuevoCaracter).
Para cifrar, se realiza la operación:
java
Copiar
Editar
nuevoCaracter = (caracterActual - base + desplazamiento) % 26 + base;
La operación % 26 garantiza que el desplazamiento no exceda el rango del abecedario.
Se suma la base para convertir el valor de nuevo en un char.
Se añade nuevoCaracter a cifrado, y al finalizar el bucle, el resultado se devuelve al main.
🔹 Proceso de descifrado
En la clase Descifrar, el método descifrar invoca el método cifrar, pero con el desplazamiento modificado a:
java
Copiar
Editar
26 - (desplazamiento % 26)
Este ajuste invierte el cifrado, restaurando el texto original.
📌 Dependencias utilizadas
Este programa usa exclusivamente bibliotecas estándar del JDK, por lo que no requiere dependencias externas.

📌 Bibliotecas utilizadas
java.util.Scanner
java.lang.StringBuilder
java.lang.Character
java.lang.System
📌 Requisitos
Compatible con cualquier versión de Java 8 o superior.
