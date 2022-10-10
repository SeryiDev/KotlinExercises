import kotlin.math.pow

/**
 * Ejercicio 02 - Tema 1
 * @author Sergio García Gómez
 *
 *  Muestra por pantalla el volumen de un cilindro conocido por su altura (h = 12.3) y su diámetro (d = 3.0).
 *  El volumen se calcula con la ecuación V = pi * r2 * h donde pi = 3.1416. r es el radio del cilindro.
*/

const val PI = Math.PI

fun main() {
    val height = 12.3
    val diameter = 3.0
    val radius = diameter / 2
    val volume = PI * (radius).pow(2.0) * height

    println("El volumen de un cilindro con altura $height m y diámetro $diameter m es de $volume")
}