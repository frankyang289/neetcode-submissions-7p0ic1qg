class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.size - 1
        var area: Int = 0

        while (left < right) {
            val width = right - left
            val height = minOf(heights[left], heights[right])
            val areaBetweenBars = width * height

            area = maxOf(area, areaBetweenBars)

            if (heights[left] < heights[right]) left++ else right--
        }

        return area

    }
}
