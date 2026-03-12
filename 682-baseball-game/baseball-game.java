class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(String s:operations){
            if(!st.isEmpty() && s.equals("C")){
                st.pop();
            }
            else if(!st.isEmpty() && s.equals("D")){
                st.push(2*st.peek());
            }
            else if(s.equals("+")){
                int first=st.pop();
                int sec=st.peek();
                int sum=first+sec;
                st.push(first);
                st.push(sum);
            }
            else{
                st.push(Integer.valueOf(s));
            }
        }
        int result=0;
        for(int i:st){
            result+=i;
        }
        return result;
        
    }
}