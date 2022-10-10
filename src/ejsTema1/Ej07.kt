/**
 * Ejercicio 07 - Tema 1
 * @author Sergio García Gómez
 *
 * Define un rango que almacene los números impares entre 10 y 50.
 * Seguidamente dice si 22 y 39 están en dicho rango (De impares).
 */

fun main() {
    val range = 1..50 step 2
    val isTwentyTwo: Boolean = (22 in range)
    val isThirtyNine: Boolean = (39 in range)
    println("¿El número 22 está en la cadena? $isTwentyTwo")
    println("¿El número 39 está en la cadena? $isThirtyNine")
}