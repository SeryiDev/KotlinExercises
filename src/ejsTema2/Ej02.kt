package ejsTema2

/**
 * @author Sergio García
 * Ejercicio 02 - Tema 01
 * Programa que dada una nota numérica decimal almacenada en una variable,
 * muestra si el alumno tiene suspenso,aprobado, bien, notable o sobresaliente.
 * Si el valor es incorrecto se mostrará error.
*/

fun main() {

    val nota = 9
    val result: String

    if (nota < 0 || nota > 10) {
        result = "incorrecta"
    } else if (nota >= 0 && nota < 5) {
        result = "insuficiente"
    } else if (nota >= 5 && nota < 6) {
        result = "suficiente"
    } else if (nota >= 6 && nota < 7) {
        result = "bien"
    } else if (nota >= 7 && nota < 9) {
        result = "notable"
    } else {
        result = "sobresaliente"
    }

    println("La nota $nota es $result")
}