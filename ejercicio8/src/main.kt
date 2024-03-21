fun main(){
    fizzbuzz()
}

fun fizzbuzz(){
    for (n in 1..100){
        when {
            ((n % 3 == 0) && (n % 5 == 0)) -> print("FizzBuzz ")

            (n % 3 == 0) -> print("Fizz ")

            (n % 5 == 0) -> print("Buzz ")

            else -> print("$n ")
        }
    }
}
