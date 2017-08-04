/**
 * 
 */
package arrays;

import java.util.ArrayList;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class MergeOverlappingInterval {

	public void merge(ArrayList<Interval> a, ArrayList<Interval> out){
		int index = -1;
		for(Interval in : a){
			if(!out.isEmpty() && overlaps(out.get(index), in)){
				Interval temp = new Interval(out.get(index).start, Math.max(out.get(index).end, in.end));
				out.remove(index);
				out.add(index, temp);
			}
			else{
				out.add(in);
				index++;
			}
		}
		System.out.println("done");
	}
	
	public boolean overlaps(Interval o, Interval i){
		return (i.start <= o.end);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeOverlappingInterval obj = new MergeOverlappingInterval();
		ArrayList<Interval> a = new ArrayList<>();
		a.add(new Interval(1,5));
		a.add(new Interval(3,7));
		a.add(new Interval(4,6));
		a.add(new Interval(6,8));
		a.add(new Interval(10,12));
		a.add(new Interval(11,15));
		ArrayList<Interval> out = new ArrayList<>();
		obj.merge(a, out);
	}

}

class Interval{
	int start;
	int end;
	
	public Interval(int s, int e){
		start = s;
		end = e;
	}
}
