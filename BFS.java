package DSA;
import java.util.*;
public class BFS {
static class Graphimp {
	    
	    static class Graph {
	        int size;
	        int[][] adjMatrix;
	        char[] vertexData;
	        
	        Graph(int size) {
	            this.size = size;
	            this.adjMatrix = new int[size][size];
	            this.vertexData = new char[size];
	        }
	        
	        public void addVertex(int vertex, char data) {
	            if(vertex >= 0 && vertex < size) {
	                vertexData[vertex] = data;
	            }
	        }
	        
	        public void addEdge(int u, int v) {
	            if(u >= 0 && u < size && v >= 0 && v < size) {
	                adjMatrix[u][v] = 1;
	                adjMatrix[v][u] = 1; // Assuming an undirected graph
	            }
	        }
	        
	        public void removeVertex(int vertex) {
	            if(vertex >= 0 && vertex < size) {
	                for(int i = 0; i < size; i++) {
	                    adjMatrix[vertex][i] = 0;
	                    adjMatrix[i][vertex] = 0;
	                }
	                vertexData[vertex] = '0';
	            }
	        }
	   public void BFS(int val) {
		   boolean[] visited = new boolean[size];
		   Queue<Integer> obj = new LinkedList<>();
		   visited[val] = true;
		   obj.offer(val);
		   
		   while(!obj.isEmpty()) {
			   int cur = obj.poll(); //poll head of queue
			   System.out.print(vertexData[cur] + " ");
			   
			   for(int i=0;i<size;i++) {
				   if(adjMatrix[cur][i] == 1 && !visited[i]) {
					   visited[i] = true;
					   obj.offer(i);
				   }
			   }
		   }
		   System.out.println();
	   }
	        
	        public void displayGraph() {
	            System.out.println("The graph:");
	            for(int i = 0; i < size; i++) {
	                for(int j = 0; j < size; j++) {
	                    System.out.print(adjMatrix[i][j] + " ");
	                }
	                System.out.println();
	            }
	            
	            System.out.println("Vertex values:");
	            for(int i = 0; i < size; i++) {
	                System.out.println("Vertex " + i + " has value " + vertexData[i]);
	            }
	        }
	        
	 
	    }
	    
	    public static void main(String[] args) {
	        Graph g = new Graph(4);
	        g.addVertex(0, 'A');
	        g.addVertex(1, 'B');
	        g.addVertex(2, 'C');
	        g.addVertex(3, 'F');
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.displayGraph();
	        
	        System.out.println("BFS traversal starting from vertex 0:");
	        g.BFS(0);
	    }
	}

}
