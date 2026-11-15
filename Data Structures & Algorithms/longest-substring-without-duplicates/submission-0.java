class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, n = s.length(), count = 0, result = 0;

        while(j < n){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                count++;
                j++;
            }
            else{
                result = Math.max(result, count);
                set.remove(s.charAt(i));
                i++;
                count--;
                
            }

        }
        result = Math.max(result, count);
        return result;
    }
}
