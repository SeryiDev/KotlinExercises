package ejsTema2

/**
 * @author Sergio García
 * Ejercicio 03 - Tema 01
 * Ejercicio 01 pero HACER CON WHEN
 */

fun main() {

    val edad = 20

    val result = when (edad) {
        in 65..125 -> "Jubilado"
        in 0..17 -> "Menor de edad"
        in 18..65 -> "Activo"
        else -> "Edad introducida no válida"
    }

    println(result)
}