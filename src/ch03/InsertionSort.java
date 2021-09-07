package ch03;

public class InsertionSort {

	public static void main(String[] args) throws InterruptedException {

		int[] arr = { 80, 50, 70, 10, 60, 20, 40, 30 };

		for (int temp = 0, i = 1, j = 1; i < arr.length; i++) {

			temp = arr[i];
			j = i;
			// Thread.sleep(1000);
			while ((j > 0) && arr[j - 1] > temp) { // asc
			// while ((j > 0) && arr[j - 1] < temp) { // des
				arr[j] = arr[j - 1];
				j = j - 1;
			}

			arr[j] = temp;

			System.out.println("반복 #" + i + " insertNum : " + temp);
			printSort(arr);

		}

	}

	public static void printSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

	}

}