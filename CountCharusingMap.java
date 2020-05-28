package collection;

import java.util.HashMap;
import java.util.Map;

public class CountCharusingMap 
{
	public static void main(String[] args) 
	{
		String str = "Karma is powerful than God";
		char[] ch1 = str.toCharArray();
		int val = 0;
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for (char c : ch1) 
		{
			if(map.containsKey(c))
			{
				val = map.get(c);
				map.put(c, val+1);
				
			}
			else 
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
