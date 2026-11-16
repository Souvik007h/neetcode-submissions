class Solution {
    List<List<Integer>> result;
    public void solve(int[] arr, int n, int i, int target, List<Integer> list){
        
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        if(i >= n || target < 0){
            return;   
        }


        list.add(arr[i]);
        solve(arr, n, i, target-arr[i],list);

        list.remove(list.size() - 1);
        solve(arr, n, i+1, target, list);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<>();

        solve(nums, nums.length, 0, target, new ArrayList<>());
        return result;
    }
}
