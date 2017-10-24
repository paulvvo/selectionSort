package selectionSort;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = new int[] {1,4,7,2};
		sort(testArray);
	}
	public static void sort(int[] unsorted) {
		for(int i=0; i<unsorted.length; i++) {
			int minStartPosition = i;
			for(int j=i+1; j<unsorted.length;j++) {
				if(unsorted[j]<unsorted[minStartPosition]) {
					minStartPosition = j;
				}
			}
			int temp = unsorted[i];
			unsorted[i] = unsorted[minStartPosition];
			unsorted[minStartPosition] = temp;
			
		}
		for(int k=0; k<unsorted.length; k++) {
			System.out.println(unsorted[k]);
		}

	}
	}
