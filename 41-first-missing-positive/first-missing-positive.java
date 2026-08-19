class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int currIndex=0;currIndex<n;currIndex++){
            while(nums[currIndex]>0 && nums[currIndex]<=n && nums[currIndex]!=nums[nums[currIndex]-1]){
                int targetIndex=nums[currIndex]-1;
                int temp=nums[currIndex];
                nums[currIndex]=nums[targetIndex];
                nums[targetIndex]=temp;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
        
    }
}