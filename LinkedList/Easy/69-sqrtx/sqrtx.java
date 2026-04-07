class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x < 2) return 1;
        int ret = 0;
        int i = 0;
        while (i <= x / 2) {
            if ((long) i * i <= x){
                ret = i;
            } else {
                break;
            }
            i++;
        }
        return ret;
    }
}