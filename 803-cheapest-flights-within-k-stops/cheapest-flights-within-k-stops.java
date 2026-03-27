class Solution {
    
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        List<int[]>[] graph = new List[n];
        
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] flight : flights){
            graph[flight[0]].add(new int[]{flight[1], flight[2]});
        }
        
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[src] = 0;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{src, 0, 0});
        
        while(!q.isEmpty()){
            
            int[] node = q.poll();
            
            int s = node[0];
            int dis = node[1];
            int stop = node[2];
            
            if(stop > k){
                continue;
            }
            else{
                for(int[] edge : graph[s]){
                    
                    int vertex = edge[0];
                    int weight = edge[1];
                    if(dist[vertex] > dis + weight){   
                        dist[vertex] = dis + weight;
                        q.add(new int[]{
                            vertex,
                            dist[vertex],
                            stop + 1
                        });
                    }
                }
            }
        }
        
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}