fun main() {
    nullabletypes()
    checkfornullvalues()
    usesafecalls()
    useelvisoperator()
    practice7()
}

fun nullabletypes() {
    var neverNull: String = "This can't be null"
    var nullable: String? = "You can keep a null here"
    var inferredNonNull = "The compiler assumes non-nullable"

//    neverNull = null
    nullable = null
//    inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
//    println(strLength(nullable))
}

fun checkfornullvalues() {
    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"
        }
    }

    var nullString: String? = null
    println(describeString(nullString))
}

fun usesafecalls() {
    fun lengthString(maybeString: String?): Int? = maybeString?.length

    var nullString: String? = null
    println(lengthString(nullString))

    println(nullString?.uppercase())
}

fun useelvisoperator() {
    var nullString: String? = null
    println(nullString?.length ?: 0)
}

fun practice7() {
    data class Employee (val name: String, var salary: Int)

    fun employeeById(id: Int) = when(id) {
        1 -> Employee("Mary", 20)
        2 -> null
        3 -> Employee("John", 21)
        4 -> Employee("Ann", 23)
        else -> null
    }

    fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

    println((1..5).sumOf { id -> salaryById(id) })
}