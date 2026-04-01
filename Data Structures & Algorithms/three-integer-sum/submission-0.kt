class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        val output: MutableList<List<Int>> = mutableListOf<List<Int>>()
        val sorted: IntArray = nums.sortedArray()

        for (i in 0 until sorted.size - 2) {
            if (i > 0 && sorted[i] == sorted[i - 1]) continue
            var j = i + 1
            var k = sorted.size - 1
            while (j < k) {
                val sum = sorted[i] + sorted[j] + sorted[k]
                if (sum == 0) {
                    output.add(listOf(sorted[i], sorted[j], sorted[k]))
                    while (j < k && sorted[j] == sorted[j + 1]) j++
                    while (j < k && sorted[k] == sorted[k - 1]) k--
                    j++
                    k--
                } else if (sum > 0) {
                    k--
                } else {
                    j++
                }
            }
        }
        return output
    }
}
