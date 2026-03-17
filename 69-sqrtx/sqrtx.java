class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        int mid=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid==x){
                return mid;
            }
            else if((long)mid*mid>x){
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return end;
       
        
    }
}