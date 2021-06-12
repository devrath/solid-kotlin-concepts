package demos

class DemoSet {

    init { initiate() }

    private fun initiate() {
        var students = setOf("Mahesh","Suresh","Venkatesh","Mahesh")
        println(students)
        println(students.contains("Suresh"))
    }

}