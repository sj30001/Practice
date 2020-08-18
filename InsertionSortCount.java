
public class InsertionSortCount {
	
	public static void main(String args[]) {
		int[] A = new int[] {20,40,30,10};
		System.out.println(countMoves(A));
		
	}
	
	public static int countMoves(int[] A) {
		int moveCount = 0;
		
		for(int i = 0; i < A.length - 1; i++) {
			for(int j = i + 1; j < A.length; j++) {
				if(A[j] < A[i]) {
					moveCount++;
				}
			}
		}
		return moveCount;
	}

}
