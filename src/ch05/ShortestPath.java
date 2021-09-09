package ch05;

public class ShortestPath {

	private int count;
	private int[][] matrix; 
	private int[] distance; // 특정노드에서 각 노드의 최단거리
	private boolean[] visited; // 체크
	private static int UNLIMIT = Integer.MAX_VALUE; // 인티저 최대값

	public ShortestPath(int count) {
		this.count = count;
		visited = new boolean[count];
		distance = new int[count];
	}

	public void calcShotestPath(int from) {

		// 모든 노드 distance 초기화
		for (int i = 0; i < count; i++) {
			distance[i] = UNLIMIT;
		}

		// 시작점 제외를 위한 true값 과 시작점 ==> 시작점 distance값 0 설정
		visited[from] = true;
		distance[from] = 0;

		// 특정(인자) 노드와 인접노드(연결가능) distance 갱신
		for (int i = 0; i < count; i++) {
			if (visited[from] && matrix[from][i] != 0) {
				distance[i] = matrix[from][i];
				System.out.println("타겟노드에서 연결가능노드 " + i + " 최단거리 " + distance[i]);
				
			}
		}
		System.out.println();
		
		for (int j = 0; j < count - 1; j++) { // 시작노드 를 제외한 모든 노드 반복

			int min = UNLIMIT;
			int minIndex = -1;
	
			for (int i = 0; i < count; i++) {
				if (!visited[i] && distance[i] != UNLIMIT) {
					if (distance[i] < min) {
						min = distance[i];
						minIndex = i;
						System.out.println("타겟노드에서 노드: " + minIndex + "까지\t 최단거리: " + min);
					}
				}
			}
			System.out.println();
			// 지나쳐갈 노드
			visited[minIndex] = true;
			
			//인자 노드부터 지나쳐갈 노드까지의 최단거리 갱신
			for (int i = 0; i < count; i++) {
				if (!visited[i] && matrix[minIndex][i] != 0) {
					if (distance[i] > distance[minIndex] + matrix[minIndex][i]) {
						distance[i] = distance[minIndex] + matrix[minIndex][i];
					}
				}
			}
		}

	}

	public void showDistance(int from) {
		for (int i = 0; i < count; i++) {
			System.out.println(from + " 노드로부터 " + i + " 노드의 최단 거리는 : " + distance[i]);
		}

	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

}
