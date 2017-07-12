/**
 * 
 */
package arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class MaxInSlidingWindow {

	public ArrayList<Integer> max(int[] a, int window){
		if(a.length < window)
			return null;

		ArrayList<Integer> outList = new ArrayList<>();
		int len = a.length;
		ArrayDeque<Integer> queue = new ArrayDeque<>();

		for(int i=0; i<window; i++){
			while(!queue.isEmpty() && a[i] >= a[queue.peekLast()])
				queue.removeLast();
			queue.add(i);
		}

		outList.add(a[queue.peekFirst()]);

		for(int i=window; i<len; i++){
			while(!queue.isEmpty() && a[i] >= a[queue.peekLast()])
				queue.removeLast();
			while(!queue.isEmpty() && queue.peekFirst() >= i - window)
				queue.removeFirst();
			queue.add(i);
			outList.add(a[queue.peekFirst()]);
		}

		return outList;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxInSlidingWindow obj = new MaxInSlidingWindow();
		ArrayList<Integer> out = obj.max(new int[]{-4,2,-5,3,6}, 3);
		for(int i:out)
			System.out.println(i);
	}

}