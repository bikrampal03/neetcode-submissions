class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        for(int weight : weights ){
            l = Math.max(l,weight);
            r +=weight;
        }
        while(l<=r){
            int mid = l + (r-l)/2;
            int day = NoofDay(weights,mid);
            if(day<=days){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l ;
    }
    public int NoofDay(int[] weights , int capacity){
        int day = 1;
        int sum = 0;
        for(int weight:weights){
            if(sum+weight > capacity){
                day++;
                sum = weight;
            }else{
                sum += weight;
            }
        }
        return day;
    }
}