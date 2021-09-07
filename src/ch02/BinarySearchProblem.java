package ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {

		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

		int target = 83;
		
		int left = 0;
		int right = numbers.length - 1;
		int mid = (left + right) / 2;
		int temp = numbers[mid];
		
		int count = 0;
		boolean find = false;
		
		System.out.println("target:" + target);
		
		while (left <= right) {
			
			System.out.println("반복문 횟수 : " + ++count);
			
			if (target == temp) {
				find = true;
				break;
			} else if (target < temp) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

			mid = (left + right) / 2;
			temp = numbers[mid];
			System.out.println("LP:" + left + " MP:" + mid + " RP:" + right + " temp:" + temp);
			System.out.println();
			
		}
		
		if(find == true) {
			mid++;
	        System.out.println("찾는 수는 " + mid + "번째 있습니다.");
			System.out.println("target:" + target + " = temp:" + temp);
			System.out.println(find);
		} else {
			System.out.println("찾는 수가 없습니다.");
		}
		
	}

}
