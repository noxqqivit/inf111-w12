
public class binarySearchOnArrays {

	/**
	 * @param args
	 */
	
	/*
	 * ==READ ME==
	 * You are given a sorted array of integers (in increasing order) and
	 * a target. Your task is to find the index of the target in the given
	 * array in O(lgn). A function prototype has been provided, just fill
	 * out the body.
	 * 
	 * howdy from noxqqivit
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int x = 5;
		int y = 2;
		int z = 10;
	
		int indexOfX = searchViaBinary(a, 0, a.length, x);
		System.out.println("binary search finds target " + x + " at index " + indexOfX + " which should equal 4 ");

		int indexOfY = searchViaBinary(a, 0, a.length, y);
		System.out.println("binary search finds target " + y + " at index " + indexOfY + " which should equal 1 ");
		
		int indexOfZ = searchViaBinary(a, 0, a.length, z);
		System.out.println("binary search finds target " + z + " at index " + indexOfZ + " which should equal -1 ");

	}

	
	
	public static int searchViaBinary(int[] arr, int lowerBound, int upperBound, int target){
		if (arr.length == 0 || lowerBound > upperBound){
			return -1;
		}
		
		/*
		 * Work with your partner and add code here! This is a sample interview question
		 * that Google, Facebook, etc. will ask
		 */
		
		return -1;
	}
}
