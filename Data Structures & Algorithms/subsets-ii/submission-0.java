class Solution {
    List<List<Integer>> result;
    public void solve(int[] nums, int n, int start, List<Integer> list){
        result.add(new ArrayList<>(list));

        for(int i = start; i < n; i++){
            if(i >  start && nums[i] == nums[i-1]){
                continue;
            }

            list.add(nums[i]);
            solve(nums, n, i+1, list);
            list.remove(list.size() - 1);

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        result = new ArrayList<>();

        Arrays.sort(nums);
        solve(nums, nums.length, 0, new ArrayList<>());
        return result;
    }
}
