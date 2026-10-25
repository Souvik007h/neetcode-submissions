class Solution {
    public int solve(int[] nums, int val, int i, int j) {
        if (i > j) {
            return -1;
        }

        int mid = i + (j - i) / 2;

        if (nums[mid] == val) {
            return mid;
        } else if (nums[mid] > val) {
            return solve(nums, val, i, mid - 1);
        } else {
            return solve(nums, val, mid + 1, j);
        }
    }
    public int search(int[] nums, int target) {
        return solve(nums, target, 0, nums.length - 1);
    }
}
