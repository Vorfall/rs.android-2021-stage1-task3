package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val result = ArrayList<String>()
        if (number.contains("-")) {
            return null
        }
        val telephone = ArrayList<Array<Int>>()
        telephone.add(arrayOf(8))
        telephone.add(arrayOf(2, 4))
        telephone.add(arrayOf(1, 3, 5))
        telephone.add(arrayOf(2, 6))
        telephone.add(arrayOf(1, 5, 7))
        telephone.add(arrayOf(2, 4, 6, 8))
        telephone.add(arrayOf(3, 5, 9))
        telephone.add(arrayOf(4, 8))
        telephone.add(arrayOf(0, 5, 7, 9))
        telephone.add(arrayOf(6, 8))
        for (i in 0 until telephone.size) {
            if (number.contains(i.toString())) {
                telephone[i].forEach {
                    val index = number.indexOf(i.toString())
                    result.add(number.substring(0, index) + it + number.substring(index + 1))
                }
            }
        }
        return result.toTypedArray()

    }
}
