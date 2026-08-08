class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n==0){
            return 0;
        }
        int i=0,j=n-1,total =0;
        int leftmax = height[0],rightmax = height[n-1];

        while(i<j){
            if(height[i] <= height[j]){
                if(leftmax<=height[i]){
                    leftmax = height[i];
                }else{
                    total += leftmax - height[i];
                }
                i++;
            }else{
                if(rightmax<=height[j]){
                    rightmax = height[j];
                }else{
                    total += rightmax - height[j];
                    }
                    j--;
                }
            
        }
        return total;
    }
}