class FizzBuzz {
    fun checkFizzBuzz (value: Int) : String{
        var modThree = false
        if (value%3 == 0) { modThree =true}
        if (modThree){
            return "Fizz"
        }
        return value.toString()
    }
}