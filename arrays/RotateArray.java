/**
 * 
 */
package arrays;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class RotateArray {

	public int[] rotate(int[] a, int n){
		int len = a.length;
		
		//normalize
		n = n % len;
		
		//for negative n, calculate +ve rotations needed
		if(n < 0)
			n = n + len;
		
		reverse(a, 0, len-1);
		reverse(a, 0, n-1);
		reverse(a, n, len-1);
		return a;
	}
	
	private void reverse(int[] a, int start, int end){
		while(start < end){
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray obj = new RotateArray();
		int[] out = obj.rotate(new int[]{1,2,3,4,5,6,7}, 60);
		
		for(int i:out)
			System.out.println(i);
	}

}
