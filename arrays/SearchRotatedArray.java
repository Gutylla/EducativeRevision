/**
 * 
 */
package arrays;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class SearchRotatedArray {

	public int search(int[] a, int key, int start, int end){
		if(start > end)
			return -1;

		int mid = start + (end-start)/2;

		if(a[mid] == key)
			return mid;
		else if(a[start] < a[mid] && key < a[mid] && key >= a[start])
			return search(a, key, start, mid-1);
		else if(a[end] > a[mid] && key > a[mid] && key<= a[end])
			return search(a, key, mid+1, end);
		else if(a[start] > a[mid])
			return search(a, key, start, mid-1);
		else if(a[end] < a[mid])
			return search(a, key, mid+1, end);
		
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchRotatedArray obj = new SearchRotatedArray();
		System.out.println(obj.search(new int[]{10,11,12,13,14,15,1,2,3,4,5,6,7,8,9}, 11, 0, 14));
	}

}
