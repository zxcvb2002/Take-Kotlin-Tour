fun main() {
    variable_declaration()
    functions()
    classes()
}

var count: Int = 10
fun variable_declaration() {
    count = 15

    val languageName: String = "Kotlin"

    fun type_inference() {
        val languageName = "Kotlin"
        val upperCaseName = languageName.toUpperCase()

//        languageName.inc()
    }
    type_inference()

    fun null_safety() {
//        val languageName: String = null
        val languageName: String? = null
    }
    null_safety()

    fun conditionals() {
//        if (count == 42) {
//            println("I have the answer.")
//        } else {
//            println("The answer eludes me.")
//        }

        if (count == 42) {
            println("I have the answer.")
        } else if (count > 35) {
            println("The answer is close.")
        } else {
            println("The answer eludes me.")
        }

//        val answerString: String = if (count == 42) {
//            "I have the answer."
//        } else if (count > 35) {
//            "The answer is close."
//        } else {
//            "The answer eludes me."
//        }
//
//        println(answerString)

        val answerString = when {
            count == 42 -> "I have the answer."
            count > 35 -> "The answer is close."
            else -> "The answer eludes me."
        }

        println(answerString)

        val languageName: String? = null
        if (languageName != null) {
            println(languageName.toUpperCase())
        }
    }
    conditionals()
}

fun functions() {
    fun generateAnswerString(): String {
        val answerString = if (count == 42) {
            "I have the answer."
        } else {
            "The answer eludes me"
        }

        return answerString
    }

    var answerString = generateAnswerString()

    answerString

    fun generateAnswerString(countThreshold: Int): String {
        val answerString = if (count > countThreshold) {
            "I have the answer."
        } else {
            "The answer eludes me."
        }

        return answerString
    }

    answerString = generateAnswerString(42)

    answerString

    fun simplifying_function_declarations() {
        fun generateAnswerString(countThreshold: Int): String {
            return if (count > countThreshold) {
                "I have the answer."
            } else {
                "The answer eludes me."
            }
        }

//        fun generateAnswerString(countThreshold: Int): String = if (count > countThreshold) {
//            "I have the answer"
//        } else {
//            "The answer eludes me"
//        }

        generateAnswerString(countThreshold = 12)
    }
    simplifying_function_declarations()

    fun anonymous_functions() {
        val stringLengthFunc: (String) -> Int = { input ->
            input.length
        }

        val stringLength: Int = stringLengthFunc("Android")
    }
    anonymous_functions()

    fun higher_order_functions() {
        fun stringMapper(str: String, mapper: (String) -> Int): Int {
            return mapper(str)
        }

        stringMapper("Android", { input ->
            input.length
        })
    }
    higher_order_functions()
}

fun classes() {
    class Car

    fun properties() {
        class Car {
            val wheels = listOf<String>()
        }

        val car = Car()
        val wheels = car.wheels

//        class Car(val wheels: List<String>)
    }
    properties()

    fun class_functions_and_encapsulation() {
        class Car(val wheels: List<String>) {

//            private val doorLock: String = ""

            var gallonsOfFuelInTank: Int = 15
                private set

//            fun unlockDoor(key: String): Boolean {
//                // Return true if key is valid for door lock, false otherwise
//            }
        }
    }
    class_functions_and_encapsulation()
}