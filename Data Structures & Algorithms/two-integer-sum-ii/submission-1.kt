class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1
        val temp = mutableListOf<Int>()
        while (left < right) {
            val sum: Int = numbers[left] + numbers[right]
            if (sum == target) {
                temp.add(left + 1)
                temp.add(right + 1)
                return temp.toIntArray()
            }

            if (sum > target) {
                right--
            } else {
                left++
            }
        }
        return temp.toIntArray()
    }
}
