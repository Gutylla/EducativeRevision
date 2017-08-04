/**
 * 
 */
package arrays;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class MoveZerosToLeft {

	public void method(int[] a){
		int len = a.length;
		int read = len-1;
		int write = read;
		
		while(read >= 0){
			if(a[read] == 0)
				read--;
			else{
				a[write] = a[read];
				read--;
				write--;
			}
		}
		
		while(write >= 0){
			a[write] = 0;
			write--;
		}
		System.out.println("done");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZerosToLeft obj = new MoveZerosToLeft();
		obj.method(new int[]{0,2,3,5,1,0,4,0,7,0,0,0,0,0,9});
	}

}
