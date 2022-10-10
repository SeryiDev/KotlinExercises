/**
 * Ejercicio 03 - Tema 1
 * @author Sergio García Gómez
 *
 *  Programa que dado un año guardado en una variable a, muestre true or false según sea bisiesto o no.
 *  Un año es bisiesto si es divisible por 4 pero no entre 100, o si es divisible por 400. SIN CONDICIONALES.
 */

fun main() {
    val year = 2020
    val isLapYear: Boolean = ((year % 4 == 0) && (year % 100 != 0) ||(year % 400 == 0))
    println("¿El año $year es bisiesto? $isLapYear")
}