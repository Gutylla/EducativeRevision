/**
 * 
 */
package arrays;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class BinarySearch {

	public int methodIterative(int[] a, int item){
		int start = 0;
		int end = a.length-1;
		int mid;
		while(start <= end){
			mid = start + ((end - start) / 2);
			if(item == a[mid])
				return mid;
			else{
				if(item < a[mid])
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return -1;
	}

	public int methodRecursive(int[] a, int item, int start, int end){
		if(start > end)
			return -1;
		int mid = start + ((end - start) / 2);
		if(item == a[mid])
			return mid;
		else{
			if(item < a[mid])
				return methodRecursive(a, item, start, mid - 1);
			else
				return methodRecursive(a, item, mid + 1, end);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearch obj = new BinarySearch();
		System.out.println(obj.methodIterative(new int[]{1,4,5,7,8,9,10}, 0));
		System.out.println(obj.methodRecursive(new int[]{1,4,5,7,8,9,10}, 5, 0, 6));
	}

}
