package ch04.bsf;

import java.util.ArrayList;

import ch04.graph.UndirectedGraph;

public class BfsSearch {

	int count;
	boolean[] visited;
	ArrayList<Integer> queue;
	int[][] matrix;

	public BfsSearch(int count) {
		this.count = count;
		visited = new boolean[count];
		queue = new ArrayList<>();
	}

	public void bfsTraversal() {

		queue.add(0);
		visited[0] = true;
		System.out.println("queue " + queue);
		
		while (queue.isEmpty() == false) {

			int node = queue.remove(0);
			System.out.print("remove : " + node + "\t\t");
			System.out.print("add :");
			for (int j = 0; j < count; j++) {
				if (matrix[node][j] != 0 && !visited[j]) { // 멤버변수 초기값 false
					queue.add(j);
					visited[j] = true;
					System.out.print(" " + j);
				}
			}
			System.out.println();
			System.out.println();
			System.out.println("queue " + queue);
		}

	}

	public static void main(String[] args) {

		int count = 8;
		
		UndirectedGraph graph = new UndirectedGraph(count);
		BfsSearch bfs = new BfsSearch(count);
		
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);

		bfs.matrix = graph.getMatrix();
		bfs.bfsTraversal();

	}

}
