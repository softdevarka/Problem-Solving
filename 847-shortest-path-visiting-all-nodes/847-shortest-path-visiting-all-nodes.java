class Solution {
    
    
    public int shortestPathLength(int[][] graph) {
        Set<Integer>visited=new HashSet<>();
        Queue<Integer>queue=new ArrayDeque<>();
        for(int i=0;i<graph.length;i++)queue.add(i<<16|1<<i);
        for(int level=0;!queue.isEmpty();level++){
            for(int i=queue.size();i>0;i--){
                int state = queue.poll();
                if(!visited.add(state))continue;
                int mask = state&0xFFFF;
                if(mask==(1<<graph.length)-1) return level;
                for(int sibl:graph[state>>16])queue.add(sibl<<16|(mask|(1<<sibl)));
            }
        }
        throw new Error("can't visit all");
    }
    
}