class Solution {
    public int maxArea(int[] height) {
        int ans =0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int wight = j-i;
            int hight = Math.min(height[i],height[j]);
            ans = Math.max(ans,wight*hight);

            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}