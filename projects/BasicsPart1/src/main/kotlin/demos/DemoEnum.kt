package demos

enum class DaysOfTheWeek(val isWeekend: Boolean = false) {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY(isWeekend = true), SUNDAY(isWeekend = true);

    fun isCurrentDayWeekend(daysOfTheWeek : DaysOfTheWeek): Boolean {
        if(this.ordinal<daysOfTheWeek.ordinal){
            return true
        }else{
            return false
        }
    }
}

class DemoEnum {
    init { initiate() }

    private fun initiate() {
        // Iterate the list of possibilities in ENUM class
        iterateValues()
        // Checking if it is a weekend
        isCurrentDayWeekend(DaysOfTheWeek.SUNDAY)
        // Checking the possible cases
        checkPossibleCases()
    }

    private fun checkPossibleCases() {

        when(DaysOfTheWeek.THURSDAY) {
            DaysOfTheWeek.MONDAY -> println("Today is Monday")
            DaysOfTheWeek.TUESDAY -> TODO()
            DaysOfTheWeek.WEDNESDAY -> TODO()
            DaysOfTheWeek.THURSDAY -> TODO()
            DaysOfTheWeek.FRIDAY -> TODO()
            DaysOfTheWeek.SATURDAY -> TODO()
            DaysOfTheWeek.SUNDAY -> TODO()
        }
    }

    private fun isCurrentDayWeekend(currentDay: DaysOfTheWeek) {
        if(currentDay.isCurrentDayWeekend(currentDay)){
            println("It is a weekend")
        } else {
            println("It is a weekday")
        }
    }

    private fun iterateValues() {
        for (week in DaysOfTheWeek.values()){
            // Ordinal helps in printing the position of the current enum class
            println("Week-Name: $week -- at position -- ${week.ordinal} -- is weekend ${week.isWeekend}")
        }
    }
}