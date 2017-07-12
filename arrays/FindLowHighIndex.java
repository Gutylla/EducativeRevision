/**
 * 
 */
package arrays;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class FindLowHighIndex {
	
	public void find(int[] a, int key){
		System.out.println("low index: " + lowIndex(a, key, 0, a.length-1));
		System.out.println("high index: " + highIndex(a, key, 0, a.length-1));
	}

	public int lowIndex(int[] a, int key, int start, int end){
		int mid = 0;
		while(start <= end){
			mid = start + (end - start) / 2;
			if(a[mid] >= key)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return start;
	}
	
	public int highIndex(int[] a, int key, int start, int end){
		int mid = 0;
		while(start <= end){
			mid = start + (end - start) / 2;
			if(a[mid] <= key)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return end;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLowHighIndex obj = new FindLowHighIndex();
		obj.find(new int[]{1,2,3,4,5,5,5,6,7,8}, 5);
	}

}
