
public class SelectionSort {
	public static void main (String args[]) {
		selectionSort();
	}
	
	public static void selectionSort() {
		int[] oriArray = new int[] {1,4,3,6,2,8};
		int arrayLength = oriArray.length;
		for(int i = 0; i < arrayLength; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arrayLength; j++) {
				if(oriArray[minIndex] > oriArray[j]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = oriArray[minIndex];
				oriArray[minIndex] = oriArray[i];
				oriArray[i] = temp;
			}
			System.out.print(i + 1 + " th time ordering: ");
			for(int k = 0; k < oriArray.length; k++) {
				System.out.print(oriArray[k] + " ");
			}
			System.out.println();
		}
	}

}
