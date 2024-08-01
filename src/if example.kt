import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)


    println("Enter first number: ")
    val num1 = scanner.nextInt()

    println("Enter second number: ")
    val num2 = scanner.nextInt()

    println("Enter third number: ")
    val num3 = scanner.nextInt()

    val max = if(num1 > num2){
        if(num1 > num3)
            num1
        else
            num3
    }
    else if(num2 > num3)
        num2
    else num3

    println("Maximum number is: $max")
}

