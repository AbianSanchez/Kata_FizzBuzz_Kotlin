fun main() {
    for(value in 1..100){
        println(FizzBuzz().checkFizzBuzz(value))
    }
}

class FizzBuzz {
    fun checkFizzBuzz (value: Int) : String{
        val modThree = (value%3) == 0
        val modFive = (value%5) == 0

        if(modThree && modFive) return "FizzBuzz"
        if(modThree) return "Fizz"
        if(modFive) return "Buzz"

        return value.toString()
    }
}