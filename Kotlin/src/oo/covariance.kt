package oo

open class Being

open class Person : Being()

class Student : Person()

fun main(args: Array<String>) {
    val people: MutableList<Person> = mutableListOf(Person(), Person())


    //Covariance = we can use a "more derived" type (a subtype)

    people.add(Student()) // covariance

    // Being does not fulfill the contract of class Person
    //  people.add(Being())

    val p: Person = Student()

    // Read-only collections are covariant
    val students :List<Person> = listOf<Student>()

    //val students2: MutableList<Person> = mutableListOf<Student>()
    //students2.add(Person)

    //people[0].speakEnglish
}