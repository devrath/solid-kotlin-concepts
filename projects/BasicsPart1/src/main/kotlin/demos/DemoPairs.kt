package demos

import pojo.Address
import pojo.Student

class DemoPairs {

    init { initiate() }

    private fun initiate() {
        var fullName : Pair<String,String> = Pair("Tony","Stark")
        var (firstName,lastName) = fullName
        println("My name is $firstName $lastName")
    }

    private fun initiateSecond() {
        var fullName : Triple<String,String,String> = Triple("Tony","Stark","Bangalore")
        var (firstName,lastName,place) = fullName
        println("My name is $firstName $lastName from the place $place")
    }
}

