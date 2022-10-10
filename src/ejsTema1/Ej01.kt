package ejsTema1

/**
 * Ejercicio 01 - Tema 1
 * @author Sergio García Gómez
 *
 * Bocadillo de jamón = 1.5, Refresco = 1.05, Cerveza = 0.75.
 * Muestra por pantalla lo que debería pagar un cliente que
 * ha comprado 5 bocadillos, 3 refrescos y 2 cervezas.
 */

const val PRECIO_BOCADILLO_JAMON = 1.5
const val PRECIO_REFRESCO = 1.05
const val PRECIO_CERVEZA = 0.75

fun main() {

    val totalBocadillos = 5
    val totalRefrescos = 3
    val totalCervezas = 2
    val total = (totalBocadillos * PRECIO_BOCADILLO_JAMON) + (totalRefrescos * PRECIO_REFRESCO) + (totalCervezas * PRECIO_CERVEZA)

    println("Factura:")
    println("Bocadillos de jamon... $totalBocadillos x ${PRECIO_BOCADILLO_JAMON}€")
    println("Bocadillos de jamon... $totalRefrescos x ${PRECIO_REFRESCO}€")
    println("Bocadillos de jamon... $totalCervezas x ${PRECIO_CERVEZA}€")
    println("Total...               $total€")
}