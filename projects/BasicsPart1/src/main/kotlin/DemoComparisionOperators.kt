class DemoComparisionOperators {

    init { initiate() }

    private fun initiate() {

        var tonyStarckAge : Int = 25

        var isTonyAnAdult = tonyStarckAge >21
        println(isTonyAnAdult)

        var firstValue = Any()
        var secondValue = Any()

        // We use double equal operator to check if two variables are equal by value
        val resultValueOne =  firstValue==secondValue
        println(resultValueOne)
        // We use triple equal operator to check if two variables are equal by reference
        val resultValueTwo =  firstValue==secondValue
        println(resultValueTwo)
    }

}