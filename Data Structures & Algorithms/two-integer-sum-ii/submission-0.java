class Solution {
    public int[] twoSum(int[] numbers, int target) {

       int i =0;
        int j = numbers.length-1;
        while(i<j){
            int cu_sum = numbers[i]+numbers[j];
            if(cu_sum == target){
                return new int[]{i+1,j+1};
            }else if(cu_sum>target){
                j--;
            }else{
                i++;
            }

        }
        return new int[]{-1,-1};
    }
}
