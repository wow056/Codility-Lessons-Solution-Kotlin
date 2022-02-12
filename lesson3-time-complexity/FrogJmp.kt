fun solution(X: Int, Y: Int, D: Int): Int {
    val targetDistance = Y - X
    if (targetDistance % D == 0) {
        return targetDistance / D
    } else {
        return (targetDistance / D) + 1
    }
}
