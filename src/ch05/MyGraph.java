package ch05;

public class MyGraph {

	private int count;
	private int[][] vertexMatrix;
	

	public MyGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
	}

	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}

	public int[][] getVertexMatrix() {
		return vertexMatrix;
	}

}
