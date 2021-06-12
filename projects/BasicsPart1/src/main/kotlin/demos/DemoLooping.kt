package demos

class DemoLooping {

    init { initiate() }

    private fun initiate() {
        // List of cities
        var cityList = listOf("Bangalore","Delhi","Chennai","Calcutta")
        executeForLoop(cityList)
    }

    private fun usingLabel(cityList: List<String>) {
        myLabel@for (city: String in cityList){
            if (city == "Calcutta"){
               break@myLabel
            }else{
                println(city)
            }
        }
    }

    private fun executeForLoop(cityList: List<String>) {
      for (city: String in cityList){
          println(city)
      }
    }

    private fun executeDoWhileLoop(cityList: List<String>) {
        var i=0
        do {
            println(cityList[i])
            i++
        }while (i<cityList.size-1)
    }

    private fun executeWhileLoop(cityList: List<String>) {
        var i=0
        while (i<cityList.size-1){
            println(cityList[i])
            i++
        }
    }

}