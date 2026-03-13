class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        for(int i=0;i<students.length;i++){
            q.offer(students[i]);
        }
        int i=0;
        while(!q.isEmpty() && i<q.size()){
            if(st.peek().equals(q.peek())){
                st.pop();
                q.poll();
                i=0;
            }
            else{
                q.offer(q.poll());
                i++;
            }
        }
        return q.size();
        
    }
}