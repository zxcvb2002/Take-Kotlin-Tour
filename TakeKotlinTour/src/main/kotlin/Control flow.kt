fun main() {
    conditionalexpressions()
    ranges()
    loops()
    practice4()
}

fun conditionalexpressions() {
    val d: Int
    val check = true
    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d)

    val a = 1
    val b = 2
    println(if (a > b) a else b)

    val obj = "Hello"
    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }
    val result = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println(result)

    val temp = 18
    val description = when {
        temp < 0 -> "very cold"
        temp < 10 -> "a bit cold"
        temp < 20 -> "warm"
        else -> "hot"
    }
    println(description)
}

fun ranges() {
    for (i in 1..4) print(i)
    println()
    for (i in 1..<4) print(i)
    println()
    for (i in 4 downTo 1) print(i)
    println()
    for (i in 1..5 step 2) print(1)
    println()
    for (i in 'a'..'d') print(i)
    println()
    for (i in 'z' downTo 's' step 2) print(i)
}

fun loops() {
    for (number in 1..5) {
        print(number)
    }

    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

fun practice4() {
    val button = "A"
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )

    var pizzaSlices = 1
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)
//    {
//        println("There's only $pizzaSlices slice/s of pizza :(")
//        pizzaSlices++
//    }
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    for (i in 1..100) {
        println(
            when {
                i % 15 == 0 -> "fizzbuzz"
                i % 3 == 0 -> "fizz"
                i % 5 == 0 -> "buzz"
                else -> i
            }
        )
    }

    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}