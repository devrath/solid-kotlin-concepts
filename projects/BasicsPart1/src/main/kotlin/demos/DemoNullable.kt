package demos

class DemoNullable {

    init { initiate() }

    private fun initiate() {
        var valueOne : String  = "FirstName"
        var valueTwo : String?  = null
        println(valueTwo)


        var valueThree : String  = "FirstName"
        var valueFour : String?  = null
        if(valueFour!!.length==2){
            println("Success")
        }
    }

}