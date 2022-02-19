class User(var firstName: String, var lastName: String, var selection: Int)  {

    /*It gets the user's first name from user's input*/
    fun askFirstName(){
        println("Please enter your first name: ")
        firstName = readLine().toString()
    }
    /*It gets the user's last name from user's input*/
    fun askLastName(){
        println("Please enter your last name: ")
        lastName = readLine().toString()
    }
    /*It inputs three possible options for the user to choose*/
    fun selectOption(){
        println("What would you like to get today?")
        println("1. Work Affirmation.")
        println("2. Relationship Affirmation.")
        println("3. Daily Advice.")
        selection = readLine()!!.toInt()



    }

}