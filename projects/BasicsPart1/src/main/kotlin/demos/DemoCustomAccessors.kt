package demos

import pojo.Person

class DemoCustomAccessors {

    init { initiate() }

    private fun initiate() {
        var person = Person("Tony","Stark")
        println(person.fullName)
        person.firstName = "Frank"
        println(person.fullName)
    }

}