class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : prerequisites){
            adj.get(edge[1]).add(edge[0]);
        }
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int n:adj.get(i)){
                indegree[n]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
       int[] res=new int[numCourses];
       int index=0;
        
        while(!q.isEmpty()){
            int vertex=q.poll();
            res[index++]=vertex;
            for(int neighbour : adj.get(vertex)){
             indegree[neighbour]--;
             if(indegree[neighbour]==0){
                 q.add(neighbour);
             }
         }

        }
         if (index != numCourses) {
            return new int[0];
        }
        return res;
    }
}