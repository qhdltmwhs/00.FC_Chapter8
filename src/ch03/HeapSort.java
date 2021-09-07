package ch03;

public class HeapSort {

	private int size;
	private int heapArr[];

	public HeapSort() {
		size = 0;
		heapArr = new int[50];
	}

	public void insertHeap(int input) {

		int i = ++size;

		// while ((i != 1) && (input > heapArr[i / 2])) { // max heap
		while ((i != 1) && (input < heapArr[i / 2])) { // min heap
			heapArr[i] = heapArr[i / 2];
			i = i / 2;
		}
		heapArr[i] = input;

	}

	public int getHeapSize() {
		return size;
	}

	public int deleteHeap() {

		int parent, child;
		int data, temp;
		data = heapArr[1];

		temp = heapArr[size];
		size -= 1;
		parent = 1;
		child = 2;

		while (child <= size) {

			if ((child < size) && (heapArr[child] > heapArr[child + 1])) child++;// min heap
			if (temp <= heapArr[child]) break; // min heap
			
			//if ((child < size) && (heapArr[child] < heapArr[child + 1])) child++; // max heap
			//if(temp >= heapArr[child]) break; //max heap
			 
			heapArr[parent] = heapArr[child];
			parent = child;
			child *= 2;
			
		}

		heapArr[parent] = temp;
		return data;

	}

	public void printHeap() {
		// System.out.printf("\n Max Heap : ");
		System.out.printf("\n Min Heap : ");
		for (int i = 1; i <= size; i++)
			System.out.printf("[%d] ", heapArr[i]);
	}

	public static void main(String[] args) {

		HeapSort h = new HeapSort();

		h.insertHeap(80);
		h.insertHeap(50);
		h.insertHeap(70);
		h.insertHeap(10);
		h.insertHeap(60);
		h.insertHeap(20);

		h.printHeap();

		int n, data;
		n = h.getHeapSize();

		for (int i = 1; i <= n; i++) {
			data = h.deleteHeap();
			System.out.printf("\n 출력 : [%d]", data);
		}

	}

}