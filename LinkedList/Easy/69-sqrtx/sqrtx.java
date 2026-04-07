class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x < 2) return 1;
        int i = 0;
        while ((long) i * i <= x) {
            i++;
        }
        return i-1;
    }
}