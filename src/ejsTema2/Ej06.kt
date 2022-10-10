package ejsTema2

/**
 * @author Sergio García
 * Ejercicio 06 - Tema 01
 * Programa que dibuja una pirámide como esta:
 *    1
 *   121
 *  12321
 * 1234321
 */

fun main() {

    val height = 9
    var spaces = height - 1
    var starterHeight = 1

    for (i in 1..height) {

        for (j in 1..spaces) print(" ")// espacios en blanco
        for (j in 1..starterHeight) print(j) // imprime la parte izquierda y el centro
        for (j in (starterHeight - 1) downTo 1) print(j) // imprime la parte derecha sin contar el centro

        spaces--
        starterHeight++
        println()
    }
}