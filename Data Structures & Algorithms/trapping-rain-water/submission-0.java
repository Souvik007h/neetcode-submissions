// Suffix and Prefix approch

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        int leftMax = 0, rightMax = 0;
        prefixMax[0] = 0;
        suffixMax[n-1] = 0;
        for(int i = 1; i < n; i++){
            prefixMax[i] = Math.max(prefixMax[i-1] , height[i-1]);
            // System.out.println( prefixMax[i]);
        }

        // System.out.println("HJ");
        for(int i = n-2; i >= 0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1] , height[i+1]);
            // System.out.println(suffixMax[i]);
        }
        int result = 0;
        for(int i = 0; i < n; i++){
            int tem = height[i];
            if(tem < prefixMax[i] && tem <suffixMax[i]){
                result += Math.min( prefixMax[i] ,suffixMax[i]) - tem;
            }
        }
        return result;
    }
}
