package subtask2

import java.lang.Math.sqrt

class SquareDecomposer {


    fun decomposeNumber(number: Int): Array<Int>? {
        return decompose(number * number, number - 1)
    }
    fun decompose(number: Int, size: Int): Array<Int>? {
        for( x in size downTo 1 ) {
            val square = x * x
            val newNumber = number - square
            if(newNumber == 0) {
                return arrayOf(x)
            }
            if(newNumber < 0) {
                return null
            }
            var sqrt = sqrt(newNumber.toDouble()).toInt()
            if(sqrt >= x) {
                sqrt = x - 1
            }
            val res = decompose(newNumber, sqrt)
            if( res != null) {
                return res + arrayOf(x)
            }
        }
        return null
    }
}
