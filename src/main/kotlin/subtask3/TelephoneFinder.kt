package subtask3

class TelephoneFinder {

    val arrayMapNumbers: Map<Char, Array<Char>> = mapOf(
        '0' to arrayOf('8'),
        '1' to arrayOf('2','4'),
        '2' to arrayOf('1','3','5'),
        '3' to arrayOf('2','6'),
        '4' to arrayOf('1','5','7'),
        '5' to arrayOf('2','4','6', '8'),
        '6' to arrayOf('3','5','9'),
        '7' to arrayOf('4','8'),
        '8' to arrayOf('5','7','9','0'),
        '9' to arrayOf('6','8')
    )
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (number.isEmpty() || number.toInt() < 0) return null
        val result = mutableListOf<String>()
        number.forEachIndexed { index, symbol ->
            arrayMapNumbers[symbol]?.forEach { charNearest: Char ->
                result.add(number.replace(number.elementAt(index), charNearest))
            }
        }
        return result.toTypedArray()
    }
}
