package datastructure;

public class Graphimp {
	
	static class Graph{
		int size;
		int[][] adjustmat;
		char[] vertixdata;
		
		Graph(int size){
			this.size = size;
			this.adjustmat = new int[size][size];
			this.vertixdata = new char[size];
		}
		
		public void addvertex(int vertix,char data) {
			if(vertix>=0 && vertix<size) {
				vertixdata[vertix] = data;
			}
		}
		public void addedges(int u,int v) {
			if(u>=0 && u<size && v>=0 && v<size) {
				adjustmat[u][v] = 1;
				adjustmat[v][u] = 1;
			}
		}
		public void remove(int vertix) {
			if(vertix>=0 && vertix<size) {
				for(int i=0;i<size;i++) {
					adjustmat[vertix][i]=0;
					adjustmat[i][vertix]=0;
				}
				 vertixdata[vertix] = '0';
			}
		}
		
		public void displaygraph() {
			System.out.println("The graph : ");
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					System.out.print(adjustmat[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("Vertex value : ");
			for(int i=0;i<size;i++) {
				System.out.println("vertex of " + i + " having value of " + vertixdata[i]);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4);
	   g.addvertex(0,'A');
	   g.addvertex(1,'B');
	   g.addvertex(2,'C');
	   g.addvertex(3,'F');
	   g.addedges(0,1);
	   g.addedges(0,2);
	   g.displaygraph();
	   g.remove(3);
	   g.displaygraph();

	}

}
