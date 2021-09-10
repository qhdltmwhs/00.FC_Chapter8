package ch07;

public class Fibonacci {

	private int[] value; // 계산된 수열을 정렬할 배열변수

	public Fibonacci(int number) {
		value = new int[number];
	}
	
	public int fibonacciRecur(int n) { 
		// 재귀함수 사용
		if (n == 0) return 0;
		if (n == 1) return 1;

		return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);

	}

	public int fibonacciIter(int n) { 
		// 반복문 사용
		int ppre = 0;
		int pre = 1;
		int current = 0;

		if (n == 0) return 0;
		if (n == 1) return 1;

		for (int i = 2; i <= n; i++) {

			current = ppre + pre;
			ppre = pre;
			pre = current;

		}
		return current;

	}

	public int fibonacciMem(int n) {
		// 메모이제이션 사용
		int result = 0;
		
		value[0] = 0;
		value[1] = 1;
	
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		for (int i = 2; i <= n; i++) {

			value[i] = value[i - 2] + value[i - 1];
			result = value[i];

		}
		return result;

	}

	public int[] getValue() {
		return value;
	}
	
}
