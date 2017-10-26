import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on


object MyTestSpeck : Spek({
    given("a calculator") {
        val calculator = SampleCalculator()
        on("addition") {
            val sum = calculator.sum(2, 4)
            it("should return the result of adding the first number to the second number") {
                assert(6 == sum)
            }
        }
        on("subtraction") {
            val subtract = calculator.subtract(4, 2)
            it("should return the result of subtracting the second number from the first number") {
                assert(6 == subtract)
            }
        }
    }
})

class SampleCalculator {
    fun sum(i: Int, i1: Int): Int {
        return i + i1
    }

    fun subtract(i: Int, i1: Int): Int {
        return i - i1
    }

}
