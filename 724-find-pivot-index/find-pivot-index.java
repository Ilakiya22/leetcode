class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int x:nums){
            rightSum+=x;
        }
        for(int i=0;i<nums.length;i++){
            if(leftSum==rightSum-leftSum-nums[i]){
                return i;
            }else{
                leftSum+=nums[i];
            }
        }
        return -1;
        
    }
}