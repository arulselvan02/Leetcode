class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums)
            pq.add(i);

        int max = 1, count = 1;
        int prev = pq.poll();

        while (!pq.isEmpty()) {
            int curr = pq.poll();

            if (curr == prev) {
                continue;
            } 
            else if (curr == prev + 1) {
                count++;
            } 
            else {
                count = 1;
            }

            max = Math.max(max, count);
            prev = curr;
        }
        return max;
    }
}
