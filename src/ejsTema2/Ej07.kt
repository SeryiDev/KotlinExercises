package ejsTema2

/**
 * @author Sergio García
 * Ejercicio 07 - Tema 01
 * Programa que tiene un array con diferentes valores.
 * Muestra por pantalla la longitud de cada cadena del array que no sea nula.
 */

fun main() {

    val wordArray = arrayOf("campamento", "cardinales", "polen", null, "hoja", "hermana", "relatividad", null)

    for (word:String? in wordArray) {
        if (word != null) {
            println(word + ": " +word.length + " caracteres.")
        }
    }
}