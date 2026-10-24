class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int tem = target - nums[i];
            if(map.get(tem) !=  null){
                int[] res = {map.get(tem), i};
                return res;
            }

            map.put(nums[i], i);
        }

        return new int[2];

    }
}
