class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0;
        int digitSum=0;
        for(int x:nums){
            eleSum+=x;

            int n=x;
            while(n>0){
                int digit=n%10;
                digitSum+=digit;
                n=n/10;
            }
        }
       
        int result=Math.abs(eleSum-digitSum);
        return result;
        
    }
}