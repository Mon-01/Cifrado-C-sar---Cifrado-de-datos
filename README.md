# Cifrado de Datos: Cifrado César

## ✨ ¿Qué hace programa?
Este programa solicita al usuario un texto para cifrarlo utilizando el **Cifrado César**. Además, el usuario debe indicar el número de desplazamiento para realizar el cifrado. Una vez ingresados estos datos, el programa devuelve el **texto cifrado** y **descifrado**.

## 🎓 ¿Qué clases hay?
El programa se compone de **tres clases principales**:

1. **CifradoCesar**: Contiene el método `main` y gestiona la entrada de datos mediante la consola.
2. **Cifrar**: Implementa el método para cifrar el texto proporcionado.
3. **Descifrar**: Implementa el método invertido de `Cifrar`, permitiendo descifrar el texto cifrado.

## 🔧 ¿Cómo funciona el programa internamente?
Desde la clase `CifradoCesar` se utiliza `Scanner` para obtener la entrada del usuario. Posteriormente, se invocan los métodos de las clases `Cifrar` y `Descifrar` para realizar el proceso de cifrado y descifrado, respectivamente.

### ✅ Proceso de Cifrado
En el método de la clase Cifrar se declara un StringBuilder llamado cifrado, donde iremos almacenando el texto cifrado, esta clase que nos permite una mayor eficiencia a la hora de concatener grandes cadenas. Además, declaramos una variable denominada desplazamiento para almacenar el desplazamiento introducido por el usuario y la inicializamos. Al iniciarla añadiendo %26, conseguimos que una vez llegados a la z vuelva a la a, logrando así que "de vueltas" dentro del abecedario.

En el bucle for pasamos el texto introducido por el usuario a un array de tipo Char, dentro del bucle comprobamos con un condicional si el contenido de la posición del array es un carácter o no. Si no es un carácter simplemente lo añadimos a cifrado, por el contrario, si es un carácter se establece un char base "a" y un char nuevoCaracter.

Desde nuevochar restamos el caracter actual del array con base y le sumamos el desplazamiento que ha escogido el usuario, esto nos dará el valor del cifrado. Con esta cifra hacemos una operación módulo %26 para que el valor no esté fuera de rango y le sumamos la base para pasar el valor a char de nuevo. Finalmente, añadimos nuevoCaracter a cifrado y una vez termine el bucle se devuelve cifrado al main.

### 🔓 Proceso de Descifrado
En la clase Descifrar tenemos el método descifrar, método inverso de cifrar. Aquí simplemente invocamos al método cifrar pasándole por el parámetro desplazamiento **26-(desplazamiento % 26)**, de esta manera hará el mismo proceso explicado previamente de forma invertida y descifrando el texto.

## 🛠️ Dependencias Utilizadas
 Al ser un programa de cifrado de datos sencillo, únicamente se usan bibliotecas estándar del JDK, por este motivo no se ha utilizado ninguna dependencia externa.
 
### 📚 Bibliotecas Utilizadas
- `java.util.Scanner`
- `java.lang.StringBuilder`
- `java.lang.Character`
- `java.lang.System`

## ⚡ Requisitos
Compatible con **Java 8 o superior**.

---
**💡 Nota:** Este programa es una implementación sencilla del **Cifrado César**, ideal para comprender cómo funciona este algoritmo de cifrado básico.

