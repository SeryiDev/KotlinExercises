/**
 * Ejercicio 05 - Tema 1
 * @author Sergio García Gómez
 *
 * Definidas las variables a = 10, b = 9, c = a % b y d = (c + 1) / 2
 * Resuelve las siguientes operaciones:
 *
 */

fun main() {
    val a = 10
    val b = 9
    val c = a % b
    val d = (c + 1) / 2
    println("a = 10    b = 9    c = 10 % 9    d = (c + 1) / 2")
    println("!((a > b) && (c == d)) = ${!((a > b) && (c == d))}")
    println("(a > b) && (c != d) = ${(a > b) && (c != d)}")
    println("!(a != b + 1) = ${!(a != b + 1)}")
    println("((a * b) % 2) > ((c + 1) / 2) = ${((a * b) % 2) > ((c + 1) / 2)}")
}