/* Given positive integer n implement afunction which
calculates sum of all numbers from 1 up to (and including) number n. */
private object addUp {
    private fun addUpTo(n: Int): Int {
        if (n == 1) {
            return 1
        }

        return n + addUpTo(n - 1)
    }
}