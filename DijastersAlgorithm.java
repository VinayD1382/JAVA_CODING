package CODINGG;

public class DijastersAlgorithm {
	public static void main(String[] args){
        Graph g = new Graph(6);
        g.addvertex(0,"A");
        g.addvertex(1,"B");
        g.addvertex(2,"C");
        g.addvertex(3,"D");
        g.addvertex(4,"E");
        g.addvertex(5,"F");
        g.addEdge(0, 1, 5);  // A -> B (weight 5)
        g.addEdge(0, 2, 3);  // A -> C (weight 3)
        g.addEdge(1, 2, 1);  // B -> C (weight 1)
        g.addEdge(1, 3, 2);  // B -> D (weight 2)
        g.addEdge(2, 4, 4);  // C -> E (weight 4)
        g.addEdge(3, 4, 6);  // D -> E (weight 6)
        g.addEdge(3, 5, 7);  // D -> F (weight 7)
        g.addEdge(4, 5, 8);  // E -> F (weight 8)
        System.out.println("The Source is A with value 0");
        int[] res = g.dij("A");
        for(int i=0;i<res.length;i++){
        System.out.println("The source A have distance to " + g.vertexdata[i] + " have the result distance : " + res[i] );
        }
    }
    static class Graph{
        int[][] matrix;
        int size;
        String[] vertexdata;
        Graph(int size){
            this.size=size;
            this.matrix = new int[size][size];
            this.vertexdata = new String[size];
        }
        public void addvertex(int val,String chara){
            if(val>=0 && val<size){
                vertexdata[val] = chara;
            }
        }
        public void addEdge(int u,int v,int weight){
            if(u>=0 && u<size && v>=0 && v<size){
                matrix[u][v] = weight;
                matrix[u][v] = weight;
            }
        }
        public int[] dij(String source){
            int found = findindex(source);
            int[] distance = new int[size];
            boolean[] visited = new boolean[size];
            for(int i=0;i<size;i++){
                distance[i] = Integer.MAX_VALUE;
            }
            distance[found] = 0;
            for(int i=0;i<size;i++){
                int u = findmindist(distance,visited);
                if(u==-1) break;
                visited[u] = true;
                for(int v=0;v<size;v++){
                    if(!visited[v] && matrix[u][v]!=0 && distance[u]!=Integer.MAX_VALUE){
                        int newdist = distance[u] + matrix[u][v];
                        if(newdist<distance[v]){
                            distance[v] = newdist;
                        }
                    }
                }
            }
            return distance;
            
        }
        private int findmindist(int[] distance,boolean[] visited){
            int min = Integer.MAX_VALUE;
            int minindex = -1;
            for(int i=0;i<size;i++){
                if(!visited[i] && distance[i]!=Integer.MAX_VALUE){
                    min = distance[i];
                    minindex = i;
                }
            }
            return minindex;
        }
        private int findindex(String source){
            for(int i=0;i<size;i++){
                if(vertexdata[i].equals(source)){
                    return i;
                }
            }
            return -1;
        }
    }
}
