class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val counts = HashMap<Char, Int>()

        for (c in s) counts[c] = counts.getOrDefault(c, 0) + 1
        for (c in t) counts[c] = counts.getOrDefault(c, 0) - 1

        return counts.values.all { it == 0 }
    }
}
