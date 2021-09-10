package ch07;

public class FibonacciTest {

	public static void main(String[] args) {
		
		/*
		 * 피보나치 수열
		 */
		Fibonacci fibonacci = new Fibonacci(40);
		
		//직관적이나 수행속도나쁨
		int result = fibonacci.fibonacciRecur(10);
		System.out.println(result);
		
		//수행속도는 원활
		result = fibonacci.fibonacciIter(10);
		System.out.println(result);
		
		//수행속도 원활 및 이전 값 배열에 저장
		result = fibonacci.fibonacciMem(10);
		System.out.println(result);
		
		//앞에서 수행한 메서드를 이용하여 배열에서 꺼냄
		result = fibonacci.getValue()[9];
		System.out.println(result);
		result = fibonacci.getValue()[8];
		System.out.println(result);
		
	}

}
