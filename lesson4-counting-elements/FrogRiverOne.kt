fun solution(X: Int, A: IntArray): Int {
    val countSet = mutableSetOf<Int>()
    A.forEachIndexed { index, item ->
        countSet.add(item)
        if (countSet.size == X) {
            return index
        }
    }
    return -1
}
