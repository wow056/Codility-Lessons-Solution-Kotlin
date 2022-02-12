fun solution(X: Int, A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    val isLeafAppears = MutableList(X) {
        false
    }
    var lastIsLeafAppearsIndex = 0
    A.forEachIndexed { index, item ->
        isLeafAppears[item - 1] = true
        val updatedIndex = updateIndex(lastIsLeafAppearsIndex, isLeafAppears)
        if (updatedIndex == isLeafAppears.lastIndex) {
            return index
        }
    }
    return -1
}

fun updateIndex(prevIndex: Int, isLeafAppears: List<Boolean>): Int {
    for (i in prevIndex..(isLeafAppears.lastIndex)) {
        if (!isLeafAppears[i]) {
            return i - 1
        }
    }
    return isLeafAppears.lastIndex
}
