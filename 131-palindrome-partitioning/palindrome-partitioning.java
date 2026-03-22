class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> list=new ArrayList<>();
        backtrack(0,s,res,list);
        return res;  
    }
    public void backtrack(int index,String s,List<List<String>> res,List<String> list){
        if(index==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                list.add(s.substring(index,i+1));
                backtrack(i+1,s,res,list);
                list.remove(list.size() -1);
            }
        }
    }
    public boolean isPalindrome(String s, int start, int end){ 
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}