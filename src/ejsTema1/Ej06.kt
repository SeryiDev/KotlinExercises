/**
 * Ejercicio 06 - Tema 1
 * @author Sergio García Gómez
 *
 * Dada una variable n de tipo entero que puede contener valor nulo, muestra
 * por pantalla utilizando concatenación, el resultado de convertir su valor
 * a cadena. Si la variable es null, se mostrará por pantalla null.
 */

fun main() {
    val n: Int? = null
    println(n.let { "El número es ${n.toString()}" })
}