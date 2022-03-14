package week3.day2;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Set<Integer> set = new HashSet<Integer>(Arrays.asList(3,2,11,4,6,7));
		
		List<Integer> sortedList = new ArrayList<Integer>(set);
		Collections.sort(sortedList);
		System.out.println(sortedList);
		System.out.println("second last element in the list is "+sortedList.get(sortedList.size()-2));

		
	}

}
