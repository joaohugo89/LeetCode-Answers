class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> mergedList = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedList.add(currentInterval);
        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];
            int[] lastMerged = mergedList.get(mergedList.size() - 1);
            int currentStart = lastMerged[0];
            int currentEnd = lastMerged[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];
            if (nextStart <= currentEnd) {
                lastMerged[1] = Math.max(currentEnd, nextEnd);
            } else {
                mergedList.add(nextInterval);
            }
        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}