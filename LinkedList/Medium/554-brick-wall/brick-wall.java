class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> edgeCount = new HashMap<>();
        int maxEdges = 0;

        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) { // ignora a última borda
                sum += row.get(i);
                edgeCount.put(sum, edgeCount.getOrDefault(sum, 0) + 1);
                maxEdges = Math.max(maxEdges, edgeCount.get(sum));
            }
        }

        return wall.size() - maxEdges;
    }
}