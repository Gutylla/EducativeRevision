/**
 * 
 */
package arrays;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class SmallestCommonNumber {

	public int find(int[] a1, int[] a2, int[] a3){
		int i=0, j=0, k=0;
		
		while(i<a1.length && j<a2.length && k<a3.length){
			if(a1[i] == a2[j] && a1[i] == a3[k])
				return a1[i];
			
			if(a1[i] <= a2[j] && a1[i] <= a3[k])
				i++;
			else if(a2[j] <= a1[i] && a2[j] <= a3[k])
				j++;
			else if(a3[k] <= a1[i] && a3[k] <= a2[j])
				k++;
		}
		
		return -1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestCommonNumber obj = new SmallestCommonNumber();
		System.out.println(obj.find(new int[]{7,10,25,30,63,64}, new int[]{-1,4,5,6,7,8,50}, new int[]{1,6,10,14}));
	}

}
