import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class FizzBuzzTest {

    @Test
    fun checkFizzBuzz_ReturnStringValue() {
        val value = FizzBuzz().checkFizzBuzz(2)
        assertThat(value).isEqualTo("2")
    }

    @Test
    fun checkFizzBuzz_ReturnFizz() {
        val value = FizzBuzz().checkFizzBuzz(3)
        assertThat(value).isEqualTo("Fizz")
    }

    @Test
    fun checkFizzBuzz_ReturnBuzz() {
        val value = FizzBuzz().checkFizzBuzz(5)
        assertThat(value).isEqualTo("Buzz")
    }

    @Test
    fun checkFizzBuzz_ReturnFizzBuzz() {
        val value = FizzBuzz().checkFizzBuzz(15)
        assertThat(value).isEqualTo("FizzBuzz")
    }
}