package demos

class DemoArray {

    init { initiate() }

    private fun initiate() {
        // Declaring the array
        var listOfCities = arrayOf("Mumbai","Bangalore","Delhi","Chennai")
        // This will print the address of the array
        println(listOfCities)
        // This will print the size of the array
        println(listOfCities.size)
        // This will access the element from a index
        println(listOfCities[1])
        // Check if the array has a particular element
        println(listOfCities.contains("Bangalore"))
        // Another way to check if the element is present in the arrays
        println("Bangalore" in listOfCities)
        // Getting the first element in the array
        println(listOfCities.first())
        // Getting the last element in the array
        println(listOfCities.last())
        // This will throw the error Index out of bound
        println(listOfCities[-1])
    }

}