/**
 * 
 */
package arrays;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class SumOfTwoValues {

	public void sum(int[] a, int target){
		int start = 0;
		int end = a.length-1;
		while(start < end){
			int add = a[start] + a[end];
			if(add == target){
				System.out.println(a[start] + ", " + a[end]);
				break;
			}
			else{
				if(add < target)
					start++;
				else
					end--;
			}
		}
		System.out.println("done");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7};
		int target = 10;
		SumOfTwoValues obj = new SumOfTwoValues();
		obj.sum(a, target);
	}

}
