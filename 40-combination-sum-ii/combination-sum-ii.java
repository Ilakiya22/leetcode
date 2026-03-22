class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtrack(candidates,target,0,0,res,list);
        return res; 
    }
    public void backtrack(int[] candidates, int target,int index,int total,
            List<List<Integer>> res,List<Integer> list){
                if(total==target){
                    res.add(new ArrayList<>(list));
                    return;
                }
                if (index >= candidates.length || total > target) {
            return;
        }

        list.add(candidates[index]);
        backtrack(candidates, target, index+ 1, total + candidates[index], res, list);
        list.remove(list.size() - 1);

        int next = index + 1;
        while (next < candidates.length && candidates[next] == candidates[index]) {
            next++;
        }

        backtrack(candidates, target, next, total,res,list);


    }
}