package pojo

class Person(var firstName:String , var lastName:String){
    var fullName : String
        get() {
            // Custom implementation while getting value
            return "$firstName $lastName"
        }
        set(value) {
            // Custom implementation while setting value
            firstName = value
        }
}
