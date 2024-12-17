class Solution {
    public long pickGifts(int[] gifts, int k) {
        long result = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);

        for (int gift: gifts) {
            maxHeap.offer(gift);
        }

        int index = 0;
        while (index < k) {
            int maxElement = maxHeap.poll();
            int squared = (int) Math.sqrt(maxElement);
            maxHeap.offer(squared);
            index++;
        }

        while (!maxHeap.isEmpty()) {
            result += maxHeap.poll();
        }

        return result;       
    }
}