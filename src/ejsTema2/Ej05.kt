package ejsTema2

/**
 * @author Sergio García
 * Ejercicio 05 - Tema 01
 * Programa que le da la vuelta a un número por ejemplo 1234 sería 4321
 */

fun main() {
    val number = 1243
    var auxNumber = number
    var reversedNumber = 0

    while (auxNumber > 0) {
        reversedNumber = reversedNumber * 10 + auxNumber % 10
        auxNumber /= 10
    }

    println("El número $number al revés es $reversedNumber")
}