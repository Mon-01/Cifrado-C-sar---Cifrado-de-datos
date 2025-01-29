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

En el método de la clase Cifrar se declara un StringBuilder llamado cifrado, clase que nos permite una mayor eficiencia a la hora de concatener grandes cadenas. Además, declaramos una variable denominada desplazamiento para almacenar el desplazamiento introducido por el usuario y la inicializamos. Al iniciarla añadiendo **%26**
