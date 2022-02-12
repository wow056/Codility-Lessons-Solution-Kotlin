fun solution(A: IntArray): Int {
    val unPairedSet = mutableMapOf<Int, Boolean>()
    A.forEach {
        if(unPairedSet.contains(it)) {
            unPairedSet.remove(it)
        } else {
            unPairedSet[it] = true
        }
    }
    return unPairedSet.keys.first()
}
