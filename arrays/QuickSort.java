/**
 * 
 */
package arrays;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class QuickSort {

	public void quickSort(int a[], int start, int end){
		if(start < end){
			int index = partition(a, start, end);
			quickSort(a, start, index-1);
			quickSort(a, index+1, end);
		}
		System.out.println("done");
	}
	
	public int partition(int a[], int start, int end){
		int pivot = a[end];
		int index = start;
		for(int i=start; i<end; i++){
			if(a[i] <= pivot)
			{
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
				index = index + 1;
			}
		}
		int temp = a[end];
		a[end] = a[index];
		a[index] = temp;
		return index;
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,1,4,9,2,6,4,8};
		QuickSort obj = new QuickSort();
		obj.quickSort(a, 0, a.length-1);
	}

}
