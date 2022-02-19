fun main() {
    val user = User(firstName = "", lastName = "", selection= 0)
    println(
        "  / \\   / \\   / \\   / \\   / \\   / \\   / \\   / \\ \n" +
                " ( P ) ( o ) ( s ) ( i ) ( t ) ( i ) ( v ) ( e )\n" +
                "  \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/ "
    )
    println(
        "  _     _     _     _     _     _     _     _     _     _     _     _  \n" +
                "  / \\   / \\   / \\   / \\   / \\   / \\   / \\   / \\   / \\   / \\   / \\   / \\ \n" +
                " ( A ) ( f ) ( f ) ( i ) ( r ) ( m ) ( a ) ( t ) ( i ) ( o ) ( n ) ( s )\n" +
                "  \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/ "
    )


    println(
        "  / \\   / \\   / \\   / \\   / \\   / \\   / \\   / \\   / \\ \n" +
                " ( G ) ( e ) ( n ) ( e ) ( r ) ( a ) ( t ) ( o ) ( r )\n" +
                "  \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/   \\_/"
    )

    print("______________________________________________________________________________________________________________")
    println("")

    user.askLastName()
    user.askFirstName()
    println("Welcome ${user.firstName}  ${user.lastName}")
    user.selectOption()


    val workAffirmations = arrayOf(
        "I’m doing a really good job today",
        "I’m capable of overcoming any hurdles that come at me",
        "I am excellent at my job",
        "I’ve got this",
        "I am successful in everything I do",
        "I am a valuable asset to my company",
        "I’m attracting new opportunities",
        "The universe has my back",
        "My emotions regarding work situation are valid",
        "I further my career every day",
        "I’m one step closer to my dream job with every action I take"
    )

    val relationshipAffirmations = arrayOf(
        "My love for my partner grows stronger each passing day",
        "My partner and I accept each other’s strengths and weaknesses",
        "My partner and I give our relationship the time and attention it deserves",
        "My partner and I look forward to some quality time together",
        "I love spending intimate moments with my partner",
        "I am happy and content with the relationship I have with my partner",
        "I feel grateful for all the things that my partner does for me",
        "My partner accepts my flaws and helps me to become a better version of myself",
        "My partner and I feel comfortable sharing our thoughts and problems with each other."
    )

    val dailyAdvices = arrayOf(
        "Take time to know yourself",
        "A narrow focus brings big results",
        "Show up fully",
        "Don't make assumptions",
        "Be patient and persistent",
        "Luck comes from hard work",
        "Be your best at all times",
        "Don't try to impress everyone",
        "Don't be afraid of being afraid",
        "Listen to learn",
        " Life's good, but it's not fair",
        "No task is beneath you",
        "You can't always get what you want",
        "Don't make decisions when you are angry or ecstatic",
        "Learn something new every day",
        "Make what is valuable important",
        "Believe in yourself",
        "Dreams remain dreams until you take action"
    )


    fun generateAffirmation(): String {

        var sentence = ""
        when (user.selection) {
            1 -> {
                sentence = workAffirmations.random()
            }
            2 -> {
                sentence = relationshipAffirmations.random()
            }
            3 -> {
                sentence = dailyAdvices.random()
            }
        }
        return sentence
    }

    var affirmations = generateAffirmation()
    println(affirmations)


}
