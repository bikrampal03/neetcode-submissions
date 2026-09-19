class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int l =0;
        int minlen = Integer.MAX_VALUE;
        int total =0;

        for(int r =0;r<nums.length;r++){
            total +=nums[r];
            while(total>=target){
                minlen = Math.min(minlen,r-l+1);
                total -=nums[l];
                l++;
                
            }
        }
        if(minlen == Integer.MAX_VALUE){
            return 0;
        }
        return minlen;
    }
}