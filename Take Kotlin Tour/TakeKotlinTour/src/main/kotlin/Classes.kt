import kotlin.random.Random

fun main() {
    classes()
    properties()
    createinstance()
    accessproperties()
    memberfunctions()
    dataclasses()
    practice6()
}

fun classes() {
    class Customer
}

fun properties() {
    class Contact(val id: Int, var email: String = "example@gmail.com") {
        val category: String = "work"
    }
}

fun createinstance() {
    class Contact(val id: Int, var email: String)

    val contact = Contact(1, "mary@gmail.com")
}

fun accessproperties() {
    class Contact(val id: Int, var email: String)

    val contact = Contact(1, "mary@gmail.com")
    println(contact.email)

    contact.email = "jane@gmail.com"
    println(contact.email)
}

fun memberfunctions() {
    class Contact(val id: Int, var email: String) {
        fun printId() {
            println(id)
        }
    }

    val contact = Contact(1, "mary@gmail.com")
    contact.printId()
}

fun dataclasses() {
    data class User(val name: String, val id: Int)

    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    println("user == secondUser: ${user == secondUser}")

    val thirdUser = User("Max", 2)
    println("user == thirdUser: ${user == thirdUser}")

    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))
}

fun practice6() {
    data class Employee(val name: String, var salary: Int)

    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)

    data class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
        val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")
        fun generateEmployee() = Employee(names.random(), Random.nextInt(from = minSalary, until = maxSalary))
    }

    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}