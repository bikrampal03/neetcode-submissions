class Solution {
    public int findMin(int[] nums) {
        int i = nums[0];
        for(int num: nums){
            i = Math.min(i,num);
        }
        return i ;
    }
}
