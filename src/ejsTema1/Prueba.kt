fun main() {
    val arrayInc = IntArray(10) {i -> i * 2}
    for (num in arrayInc) println(num)

    for (a: Int in 0..50 step 5) print("$a, ")
    println()

    var a = 10
    val b = a++
    println(a)
    println(b)

    val c = 6
    val d = 2
    println(c and d)
    println(c or d)
    println(c xor d)
    println(c shl d)
    println(c shr d)

    var cadena: String? = null
    println("La longitud de la cadena $cadena es ${cadena?.length}")
    cadena = "Hello world"
    println("La longitud de la cadena $cadena es ${cadena?.length}")

    cadena?.let { println("La longitud de la cadena $cadena es ${cadena?.length}")}

    println("${ cadena is String }")

    val edad = 130
    println(if (edad >= 18)"Eres mayor de edad" else "No eres mayor de edad")
    println()
    println()

    var result = when (edad) {
        in 65..125 -> "Jubilado"
        in 0..17 -> "Menor de edad"
        in 18..65 -> "Activo"
        else -> "O estás en la tumba o no has nacido"
    }

    println(result)

    a@ for (i in 1..50) {
        for (j in i..10) {
            if (j == 7) break@a
            println(j)
        }
    }
}