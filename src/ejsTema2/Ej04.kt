package ejsTema2

/**
 * @author Sergio García
 * Ejercicio 04 - Tema 01
 * Programa que muestre por pantalla todos los múltiplos de 3 en un rango de 1 a 100
 */

fun main() {

    val range = 0..100

    for (number in range step 3) {
        print("$number, ")
    }
}