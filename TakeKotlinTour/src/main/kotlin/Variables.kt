fun main() {
    variables()
    practice()
}

fun variables() {
    val popcorn = 5
    val hotdog = 7
    val customers = 10

    println(popcorn)
    println(hotdog)
    println(customers)

    println("There are $customers customers")
    println("There are ${customers + 1} customers")
}

fun practice() {
    val name = "Mary"
    val age = 20
    println("$name is $age years old")
}