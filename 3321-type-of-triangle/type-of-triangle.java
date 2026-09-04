class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
       Set<Integer> set=new HashSet<>();
       if(nums[0]+nums[1]<=nums[2]){
        return "none";
       }
       for(int x:nums){
        set.add(x);
       }
       if(set.size()==1){
        return "equilateral";
       }
       else if(set.size()==2){
        return "isosceles";
       }
       return "scalene";
        
        
    }
}