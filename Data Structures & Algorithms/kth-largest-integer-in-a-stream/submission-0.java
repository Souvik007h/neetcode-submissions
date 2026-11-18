class KthLargest {
    int k;
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i : nums) {
            this.queue.add(i);
        }
    }

    public int add(int val) {
        List<Integer> arr = new ArrayList<>();
        this.queue.add(val);
        int element = 0;
        for (int i = 0; i < k; i++) {
            element = queue.poll();
            arr.add(element);
        }
        for (int i : arr) {
            queue.add(i);
        }

        return element;
    }
}
