package demos

class DemoList {

    init { initiate() }

    private fun initiate() {
        // List of cities
        var cityList = listOf("Bangalore","Delhi","Chennai","Calcutta")
        // Not possible since its just a list and not a mutable list
        //cityList.add()
        // we can convert one list to another list
        var mutableCityList = cityList.toMutableList()
        // Since now its a mutable list, we can modify the list
        mutableCityList.add("Texas")
        // We can directly add a element at a position also
        mutableCityList.add(1,"Colombo")
        // We can remove a element at a position from th elist
        mutableCityList.removeAt(2)
    }

}