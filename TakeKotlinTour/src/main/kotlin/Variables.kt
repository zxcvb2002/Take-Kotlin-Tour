fun main() {
    variables()
    practice1()
}

fun variables() {
    val popcorn = 5
    val hotdog = 7
    var customers = 10

    println(popcorn)
    println(hotdog)

    customers = 8
    println(customers)

    println("There are $customers customers")
    println("There are ${customers + 1} customers")
}

fun practice1() {
    val name = "Mary"
    val age = 20
    println("$name is $age years old")
}