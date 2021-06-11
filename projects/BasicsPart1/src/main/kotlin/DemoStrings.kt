class DemoStrings {

    init { initiate() }

    private fun initiate() {
        // Assigning explicitly the data type and then setting a value to it
        // This will always accept only the integer
        var age : Int = 21
        var firstName : String = "Tony"
        // Kotlin can infer the values so that we need not have to explicitly mention them, Meaning datatype , we need not have to add
        var lastName : String = "Stark"
        println("My name is $firstName $lastName and I am $age years old scientist")
        // Appending the variables in the string is reformatting it is called string interpolation

    }

}