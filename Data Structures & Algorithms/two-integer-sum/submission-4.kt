class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = HashMap<Int, Int>()

        for((i, num) in nums.withIndex()) {
            val complement = target - num
            if (complement in seen) {
                val j = seen[complement]!!
                return if(j<i) intArrayOf(j,i) else intArrayOf(i,j)
            }
            seen[num] = i
        }
        throw IllegalArgumentException("No solution")
    }
}
