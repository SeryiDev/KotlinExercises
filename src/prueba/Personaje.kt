package prueba

const val CONSTANTE : Int = 0
const val CONSTANTE2 : String = ""

// open class Foo {}            CLASE QUE SE PUEDE HEREDAR E INSTANCIAR
// abstract  class Foo {}       CLASE QUE SE PUEDE HEREDAR PERO NO INSTANCIAR
// class Foo {}                 CLASE QUE SE PUEDE INSTANCIAR PERO NO HEREDAR
// data class Person {}                CLASE PARA POJO(PLAIN OLD JAVA OBJECT)

abstract class Personaje(var name: String, var health: Int) {
    abstract fun die()
    open fun resurrect() {
        println("${this.name} has revived")
    }
}

class Mago: Personaje {
    constructor(name: String) : super(name, 100)
    constructor(name: String, health: Int) : super(name, health)

    override fun die() {
        println("The mage ${this.name} has died")
    }
}

class Elfo: Personaje {
    constructor(name: String) : super(name, 150)
    constructor(name: String, health: Int) : super(name, health)

    override fun die() {
        println("The elf ${this.name} has died")
    }
}

data class Item(var name: String, var quantity: Int)

fun main() {

    val a = Mago("Sergio")
    val b = Elfo("Elf Master", 1000)
    // val c = Personaje("", 0); ERROR PERSONAJE ES ABSTRACT NO SE PUEDE INSTANCIAR

    println("Name: ${a.name}. Health: ${a.health}")
    println("Name: ${b.name}. Health: ${b.health}")
    a.die()
    b.die()
    a.resurrect()

    val aItem = Item("Life potion", 10);

    // DESESTRUCTURACIÓN DE CLASES
    val (aName, aQuantity) = aItem
    println("You have $aQuantity $aName left")
}