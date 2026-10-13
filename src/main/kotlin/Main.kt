package org.example
fun sum(a: Int, b: Int): Int {
    return a + b
}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Harsha Hettiarachchi"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Welcome, " + name + "!")

    for (i in 1..11) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("StudentID = M25W7571")
    }
    print("sum of 3 and 5 is ")
    println(sum(3, 5))

    // Prints a message to request input
    println("Enter any word: ")

// Reads and stores the user input. For example: Happiness
    val yourWord = readln()

// Prints a message with the input
    print("You entered the word: ")
    print(yourWord)
// You entered the word: Happiness

}

