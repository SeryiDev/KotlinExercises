/**
 * Ejercicio 04 - Tema 1
 * @author Sergio García Gómez
 *
 *  Dados los números AB y 03 calcula sobre papel las operaciones AND OR Y XOR de los números dados.
 *  Un desplazamiento de 2 bits a la derecha de AB
 *  Un desplazamiento de 3 bits a la izquierda de AB
 */

fun main() {

    val n1 = 171 //AB HEX a Decimal es 171
    val n2 = 3

    println("AB and 03 = ${n1 and n2}") // Resultado = 3
    println("AB or 03 = ${n1 or n2}")   // Resultado = 171
    println("AB xor 03 = ${n1 xor n2}") // Resultado = 168
    println("AB shr 2 = ${n1 shr 2}")   // Resultado = 42
    println("AB shl 3 = ${n1 shl 3}")   // Resultado = 1368
}