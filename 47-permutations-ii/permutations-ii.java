class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean[] taken=new boolean[nums.length];
        backtrack(result,list,nums ,taken);
        return result;
        
    }
    public void backtrack(List<List<Integer>> result,List<Integer> list,int[] nums,boolean[] taken){
        if(list.size()==nums.length){
            if(!result.contains(list))
            
            result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(taken[i]==true){
                continue;
            }
            list.add(nums[i]);
            taken[i]=true;
            backtrack(result,list,nums,taken);
            list.remove(list.size()-1);
            taken[i]=false;

        }
    }
    
}

                    