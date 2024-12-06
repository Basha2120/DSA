class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        long sum = 0;
        int count = 0;
        HashSet<Integer> hash = new HashSet<>();
        for (int val : banned) {
            hash.add(val);
        }
        for (int i = 1; i <= n; i++) {
            if (!hash.contains(i)) {
                sum = sum + i;
                if (sum > maxSum) {
                    break;
                }
                count++;
            }

        }
        return count;
    }
}