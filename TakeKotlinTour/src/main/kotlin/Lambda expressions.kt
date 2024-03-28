fun main() {
    lambdaexpressions()
    assigntovariable()
    passtoanotherfunction()
    functiontypes()
    returnfromafunction()
    invokeseparately()
    trailinglambdas()
    practice0()
}

fun lambdaexpressions() {
    fun uppercaseString(string: String): String {
        return string.uppercase()
    }
    println(uppercaseString("hello"))

    println({ string: String -> string.uppercase() }("hello"))


}

fun assigntovariable() {
    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("hello"))
}

fun passtoanotherfunction() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)

    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubled)
    println(tripled)
}

fun functiontypes() {
    val upperCaseString: (String) -> String = { string -> string.uppercase() }
    println(upperCaseString("hello"))
}

fun returnfromafunction() {
    fun toSeconds(time: String): (Int) -> Int = when (time) {
        "hour" -> { value -> value * 60 * 60 }
        "minute" -> { value -> value * 60 }
        "second" -> { value -> value }
        else -> { value -> value }
    }

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
}

fun invokeseparately() {
    println({ string: String -> string.uppercase() }("hello"))
}

fun trailinglambdas() {
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item }))
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })
}

fun practice0() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)

    fun repeatN(n: Int, action: () -> Unit) {
        for (i in 1..n) {
            action()
        }
    }
    repeatN(5) { println("hello") }
}