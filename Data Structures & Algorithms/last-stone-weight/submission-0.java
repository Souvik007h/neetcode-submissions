class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            queue.add(i);
        }

        while(queue.size() > 1){
            int x = queue.poll();
            int y = queue.poll();
            if(x >= y){
                queue.add(x-y);
            }
        }

        return (queue.size() == 0)? 0 : queue.poll();
    }
}
