package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]

        for (num in 1..n) {
            if (m <= fariant(n, num)) {
                return num
            }
        }
        return null
    }
    fun fariant(n: Int, num: Int): Int {
        return (factorial(n) / (factorial(num) * factorial(n - num))).toInt()
    }
    fun factorial(factorialNumber: Int): Long {
        var result = 1L
        if (factorialNumber >= 2) for (i in 2..factorialNumber) result *= i
        return result
    }
}
