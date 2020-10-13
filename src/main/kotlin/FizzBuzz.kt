class FizzBuzz {
    fun checkFizzBuzz (value: Int) : String{
        var modThree = false
        var modFive = false
        if (value%3 == 0) { modThree =true}
        if (value%5 == 0) { modFive =true}
        if (modThree && modFive){
            return "FizzBuzz"
        }
        if (modThree){
            return "Fizz"
        }
        if (modFive){
            return "Buzz"
        }
        return value.toString()
    }
}