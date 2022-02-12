fun solution(A: IntArray): Int {
    var result = 0
    var countAdder = 0
    A.forEach {
        if (it == 0) {
            countAdder += 1
        }
        if (it == 1) {
            result += countAdder
        }
        if (result > 1_000_000_000) {
            return -1
        }
    }
    return result
}
