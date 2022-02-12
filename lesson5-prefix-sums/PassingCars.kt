fun solution(A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    var pairCount = 0
    for(zeroCandidateIndex in 0..(A.lastIndex)) {
        if(A[zeroCandidateIndex] == 0) {
            for (oneCandidateIndex in (zeroCandidateIndex + 1)..(A.lastIndex)) {
                if (A[oneCandidateIndex] == 1) {
                    pairCount += 1
                }
            }
        }
    }
    return pairCount
}
