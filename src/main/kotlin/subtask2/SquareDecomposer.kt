package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val number1 = square(number) - square(number - 1)
        val koren = sqrt(number1.toDouble()).toInt()
        return if ((number1 - square(koren)).toInt() == 0) {
            arrayOf(koren, number - 1)
        } else {
            recurs(koren + 1, number1)?.plus(number - 1)
        }
    }

    private fun recurs(number: Int, work: Long): Array<Int>? {
        for (i in number - 1 downTo 1) {
            if (square(i) != work) {
                val result = work - square(i)
                if (result > 0) {
                    val resultArray = recurs(i, result)
                    if (resultArray != null) {
                        return resultArray.plus(i)
                    }
                }
            } else return arrayOf(i)
        }
        return null
    }

    private fun square(x: Int): Long {
        return x.toLong() * x.toLong()
    }
}
