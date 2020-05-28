package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RetrivevaluefromSet 
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		
		int i = new ArrayList<>(set).indexOf(8);
		System.out.println(i);
	}

}
