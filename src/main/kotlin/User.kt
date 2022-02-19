class User(var firstName: String, var lastName: String, var selection: Int)  {

    fun askFirstName(){
        println("Please enter your first name: ")
        firstName = readLine().toString()
    }

    fun askLastName(){
        println("Please enter your last name: ")
        lastName = readLine().toString()
    }

    fun selectOption(){
        println("What would you like to get today?")
        println("1. Work Affirmation.")
        println("2. Relationship Affirmation.")
        println("3. Daily Advice.")
        selection = readLine()!!.toInt()



    }

}