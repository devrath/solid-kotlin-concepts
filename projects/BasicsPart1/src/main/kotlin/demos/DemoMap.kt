package demos

class DemoMap {

    init { initiate() }

    private fun initiate() {

        val listOfCities = mapOf(
            1 to "Bangalore",
            2 to "Mumbai",
            3 to "Chennai",
        )

        println(listOfCities[1])


        val listOfNames = mutableMapOf(
            1 to "Manish",
            2 to "John",
            3 to "Sam",
        )
        listOfNames[4] = "Anudeep"

        println(listOfNames[4])

    }

}