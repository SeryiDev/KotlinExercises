package ejsTema2

/**
 * @author Sergio García
 * Ejercicio 01 - Tema 01
 * Escribe un programa que almacena una edad, y muestra por pantalla si el usuario está jubilado,
 * en activo o menor de edad.
*/


fun main() {

    val edad = 100

    var result = when (edad) {
        in 65..125 -> "Jubilado"
        in 0..17 -> "Menor de edad"
        in 18..65 -> "Activo"
        else -> "Edad introducida no válida"
    }

    println(result)
}