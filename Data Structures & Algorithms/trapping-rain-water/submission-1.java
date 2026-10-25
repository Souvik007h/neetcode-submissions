// Most Optimal Approch using two pointer

class Solution {
    public int trap(int[] height) {
        int lMax = 0, rMax = 0, l = 0, r = height.length - 1, total = 0;

        while(l < r){
            int left = height[l];
            int right = height[r];
            if(left <= right){
                if(lMax > left){
                    total += lMax-left;
                }

                lMax = Math.max(lMax, left);
                l++;
            }
            else {
                if(rMax > right){
                    total += rMax - right;
                }

                rMax = Math.max(rMax , right);
                r--;
            }
        }

        return total;
    }
}
