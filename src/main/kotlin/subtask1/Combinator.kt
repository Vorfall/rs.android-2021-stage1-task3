package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        for (x in 1 until array[0]) {
            if ((factorial(array[1]) / (factorial(x) * factorial(array[1] - x))).toInt() == array[0]) {
                return x
            }
        }
        return null
    }

    private fun factorial(num: Int): Long {
        var result = 1L
        for (i in 2..num) result *= i
        return result
    }
}
