package ch05;

public class ShortestPathTest {

	public static void main(String[] args) {
		
		int count = 6;
		
		MyGraph graph = new MyGraph(count);
		ShortestPath sp = new ShortestPath(count);
		
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 4);
		graph.addEdges(1, 2, 2);
		graph.addEdges(2, 3, 1);
		graph.addEdges(3, 4, 8);
		graph.addEdges(3, 5, 3);
		graph.addEdges(4, 5, 4);

		sp.setMatrix(graph.getVertexMatrix());
		
		int startPoint = 3;
		sp.calcShotestPath(startPoint);
		sp.showDistance(startPoint);
		
	}

}
