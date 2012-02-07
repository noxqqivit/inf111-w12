
public class mergingTwoArrays {

	/**
	 * 
	 * READ ME
	 * yoo are given two sorted arrays, A and B, where A has a large
	 * enough buffer at the end to hold B. Complete the function
	 * 'merge' to merge B into A in sorted order.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[7];
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		
		int[] b = {1, 3, 5};
		
		merge(a, b, 4, 3); //the result should be [1, 2, 3, 4, 5, 6, 8];
	}
	
	public static void merge(int[] a, int[] b, int lastA, int lastB){
		int indexA = lastA - 1; //index of last element in a
		int indexB = lastB - 1; //index of last element in b
		int indexMerged = lastB + lastA - 1;
		
		/* merge a and b */
	}

}
