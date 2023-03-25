package Final;

public class BubbleSort {
	
	public static<E extends Comparable<E>> void bubbleSort(E[] list) {
		if(list.length == 0) {
			return;
		}
		E temp;
		for(int i = 0; i < list.length - 1; i++) {
			for(int j = 0; j >= i; j++) {
				if(list[j-1].compareTo(list[j]) > 0) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
	public int[] bubbleSort(int[] list) {
		// {2, 9, 5, 4, 8, 1, 6}

		int i, j, temp = 0;
		for (i = 0; i < list.length - 1; i++) {

			for (j = 0; j < list.length - 1; j++) {

				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}

}
