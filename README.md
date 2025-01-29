# Cifrado de Datos: Cifrado César

## ✨ Descripción
Este programa solicita al usuario un texto para cifrarlo utilizando el **Cifrado César**. Además, el usuario debe indicar el número de desplazamiento para realizar el cifrado. Una vez ingresados estos datos, el programa devuelve el **texto cifrado** y **descifrado**.

## 🎓 Clases y Estructura
El programa se compone de **tres clases principales**:

1. **CifradoCesar**: Contiene el método `main` y gestiona la entrada de datos mediante la consola.
2. **Cifrar**: Implementa el método para cifrar el texto proporcionado.
3. **Descifrar**: Implementa el método inverso al de `Cifrar`, permitiendo descifrar el texto cifrado.

## 🔧 Funcionamiento Interno
Desde la clase `CifradoCesar` se utiliza `Scanner` para obtener la entrada del usuario. Posteriormente, se invocan los métodos de las clases `Cifrar` y `Descifrar` para realizar el proceso de cifrado y descifrado, respectivamente.

### ✅ Proceso de Cifrado
1. Se declara un `StringBuilder` llamado **cifrado**, donde se almacenará el texto cifrado de manera eficiente.
2. Se utiliza una variable `desplazamiento` para guardar el número de desplazamiento ingresado por el usuario.
3. Se inicializa `desplazamiento % 26` para asegurar que el cifrado sea circular dentro del abecedario (de la `z` vuelve a la `a`).
4. Se convierte el texto en un array de caracteres y se itera sobre él:
   - Si el carácter no es una letra, se añade directamente a `cifrado`.
   - Si es una letra, se calcula su desplazamiento basándose en el valor ASCII y se aplica el módulo `% 26` para mantenerlo dentro del rango de letras.
   - Finalmente, se reconstruye el texto cifrado y se retorna al `main`.

### 🔓 Proceso de Descifrado
El método `descifrar` invoca al método `cifrar` utilizando el desplazamiento **26 - (desplazamiento % 26)**, lo que revierte el proceso de cifrado, restaurando el texto original.

## 🛠️ Dependencias Utilizadas
Este programa es completamente autónomo y **no requiere dependencias externas**, ya que utiliza únicamente bibliotecas estándar del **JDK**.

### 📚 Bibliotecas Utilizadas
- `java.util.Scanner`
- `java.lang.StringBuilder`
- `java.lang.Character`
- `java.lang.System`

## ⚡ Requisitos
Compatible con **Java 8 o superior**.

---
**💡 Nota:** Este programa es una implementación sencilla del **Cifrado César**, ideal para comprender cómo funciona este algoritmo de cifrado básico.

