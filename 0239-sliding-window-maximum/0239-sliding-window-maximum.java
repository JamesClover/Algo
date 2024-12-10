class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();
        
        // iterate over input array
        for (int i = 0; i < nums.length; i++) {
            // iterate over input
            // check to see if you have appropriate q window
            // if not, remove head of queue (window moves from left to right)
            while (!q.isEmpty() && q.peekFirst() < i -k + 1) {
                q.pollFirst();
            }

            // check to see if element we want to add is greater than current elements in queue
            // if so, pop them off
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            // add index to q
            q.offer(i);

            if (i >= k - 1) {
                result.add(nums[q.peekFirst()]);
            }
        }
         // Convert ArrayList<Integer> to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}