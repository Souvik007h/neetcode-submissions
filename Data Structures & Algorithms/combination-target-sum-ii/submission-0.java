
class Solution {
    List<List<Integer>> result;

    public void solve(int arr[], int n, int start, int target,
                      List<Integer> list) {

        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < n; i++) {

            // Skip duplicates at the same recursion level
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }

            // Since array is sorted
            if (arr[i] > target) {
                break;
            }

            // Pick
            list.add(arr[i]);

            solve(arr, n, i + 1, target - arr[i], list);

            // Backtrack
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates,
                                                int target) {
        Arrays.sort(candidates);

        result = new ArrayList<>();

        solve(candidates, candidates.length, 0,
              target, new ArrayList<>());

        return result;
    }
}
