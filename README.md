Cifrado de datos: Cifrado César

-¿Qué hace el programa?
Este programa le pide al usuario por consola un texto para cifrarlo, además del texto te pide el número que 
quieras usar para realizar el cifrado. Después de indicarle el texto y el número te devuelve el texto cifrado y descifrado.

-¿Qué clases hay?
Disponemos de 3 clases diferentes, una con el método main donde le pedimos los datos al usuario mediante consola (clase CifradoCesar),
otra clase denomida "Cifrar" donde hay un método que cifra el texto que le pasamos y una última clase llamada 
"Descifrar", donde hay un método inverso al de la clase cifrar.

-¿Cómo funciona el programa internamente?
Desde la clase main se usa Scanner para obtener los datos que introduzca el usuario y se llama a los métodos de las clases Cifrar y Descifrar respectivamente.

En el método de la clase Cifrar se declara un StringBuilder llamado cifrado, donde iremos almacenando el texto cifrado, esta clase que nos permite una mayor eficiencia a la hora de concatener grandes cadenas. Además, declaramos una variable denominada desplazamiento para almacenar el desplazamiento introducido por el usuario y la inicializamos. Al iniciarla añadiendo **%26**, conseguimos que una vez llegados a la _z_ vuelva a la _a_, logrando así que "de vueltas" dentro del abecedario.

En el bucle for pasamos el texto introducido por el usuario a un array de tipo Char, dentro del bucle comprobamos con un condicional si el contenido de la posición del array es un carácter o no. Si no es un carácter simplemente lo añadimos a cifrado, por el contrario, si es un carácter se establece un char base "a" y un char nuevoCaracter.

Desde nuevochar restamos el caracter actual del array con base y le sumamos el desplazamiento que ha escogido el usuario, esto nos dará el valor del cifrado. Con esta cifra hacemos una operación módulo **%26** para que el valor no esté fuera de rango y le sumamos la base para pasar el valor a char de nuevo. Finalmente, añadimos nuevoCaracter a cifrado y una vez termine el bucle se devuelve cifrado al main.

En la clase Descifrar tenemos el método descifrar, método inverso de cifrar. Aquí simplemente invocamos al método cifrar pasándole por el parámetro desplazamiento _26-(desplazamiento % 26)_, de esta manera hará el mismo proceso explicado previamente de forma invertida y descifrando el texto.

-Dependencias utilizadas
Al ser un programa de cifrado de datos sencillo, únicamente se usan bibliotecas estándar del JDK, por este motivo no se ha utilizado ninguna dependencia externa.

-Bibliotecas utilizadas
1. java.util.Scanner
2. java.lang.StringBuilder
3. java.lang.Character
4. java.lang.System

-Requisitos
Compatible con cualquier versión de Java 8 o superior.
