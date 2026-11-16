class Solution {
    List<List<Integer>> result;
    public void solve(int[] arr, int n, int i, List<Integer> list) {
        if (i == n) {
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[i]);
        solve(arr, n, i + 1, list);

        list.remove(list.size() - 1);
        solve(arr, n, i + 1, list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();

        solve(nums, nums.length, 0, new ArrayList<>());
        return result;
    }
}
