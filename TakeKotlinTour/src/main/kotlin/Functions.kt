import kotlin.math.PI

fun main() {
    functions()
    namedarguments()
    defaultparametervalues()
    functionswithoutreturn()
    single_expressionfunctions()
    practice5()
}

fun functions() {
    fun hello() {
        return println("Hello, world!")
    }
    hello()

    fun sum(x: Int, y: Int): Int {
        return x + y
    }
    println(sum(1, 2))
}

fun namedarguments() {
    fun printMessageWithPrefix(message: String, prefix: String) {
        println("[$prefix] $message")
    }
    printMessageWithPrefix(prefix = "Log", message = "Hello")
}

fun defaultparametervalues() {
    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
}

fun functionswithoutreturn() {
    fun printMessage(message: String) {
        println(message)
    }
    printMessage("Hello")
}

fun single_expressionfunctions() {
    fun sum(x: Int, y: Int) = x + y
    println(sum(1, 2))
}

fun practice5() {
    fun circleArea(r: Int): Double {
        return PI * r * r
    }
    println(circleArea(2))

    fun circleArea_single_expression(r: Int) = PI * r * r
    println(circleArea_single_expression(2))

    fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
        ((hours * 60) + minutes) * 60 + seconds
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(1, 25))
    println(intervalInSeconds(2))
    println(intervalInSeconds(10))
    println(intervalInSeconds(1, 1))
}