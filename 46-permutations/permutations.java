class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtrack(result,list,nums);
        return result;
        
    }
    public void backtrack(List<List<Integer>> result,List<Integer> list,int[] nums){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                continue;
            }
            else{
                list.add(nums[i]);
            }
            backtrack(result,list,nums);
            list.remove(list.size()-1);

        }
    }
}