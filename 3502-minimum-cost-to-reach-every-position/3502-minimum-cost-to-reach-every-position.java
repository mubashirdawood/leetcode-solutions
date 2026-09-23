class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int[] answer = new int[n];
        int minSoFar = cost[0];
        
        for (int i = 0; i < n; i++) {
            minSoFar = Math.min(minSoFar, cost[i]);
            answer[i] = minSoFar;
        }
        
        return answer;
    }
}