fun solution(A: IntArray): Int {
    val countSet = mutableSetOf<Int>()
    A.forEach {
        countSet.add(it)
    }
    return countSet.size
}
