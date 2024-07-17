package DSA;
import java.util.*;

public class DFS {

	

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
	        
	    /*  public void DFS(int startVertex) {
	            boolean[] visited = new boolean[size];
	            dfsRecursive(startVertex, visited);
	        }
	        
	        private void dfsRecursive(int vertex, boolean[] visited) {
	            visited[vertex] = true;
	            System.out.print(vertexData[vertex] + " ");
	            
	            for(int i = 0; i < size; i++) {
	                if(adjMatrix[vertex][i] == 1 && !visited[i]) {
	                    dfsRecursive(i, visited);
	                }
	            }
	        }
	    }*/
	        public void DFS(int index) {
	        	boolean[] visited = new boolean[size];
	        	dfs(index,visited);
	        }
	        private void dfs(int index,boolean[] visited) {
	        	visited[index] = true;
	        	System.out.print(vertexData[index] + " " );
	        	for(int i=0;i<size;i++) {
	        		if(adjMatrix[index][i] == 1 && !visited[i]) {
	        			dfs(i,visited);
	        		}
	        	}
	        }
	    }
	    
	    public static void main(String[] args) {
	        Graph g = new Graph(7);
	        g.addVertex(0, 'A');
	        g.addVertex(1, 'B');
	        g.addVertex(2, 'C');
	        g.addVertex(3, 'D');
	        g.addVertex(4, 'E');
	        g.addVertex(5, 'F');
	        g.addVertex(6, 'G');
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 3);
	        g.addEdge(1, 4);
	        g.displayGraph();
	        
	        System.out.println("DFS traversal starting from vertex 0:");
	        g.DFS(0);
	    }
	}


}
