package collection;

import java.util.HashMap;
import java.util.Set;

public class FindtheDuplicateChar 
{
	public static void main(String[] args) 
	{
		String str ="When life gives you lemons, make lemonade";
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) 
		{
			if (map.containsKey(c)) 
			{
				map.put(c,map.get(c)+1);
			}
			else 
			{
				map.put(c,1);
				
			}
			Set<Character> set = map.keySet();
			for (char ch : set) 
			{
				if(map.get(ch)>1)
				{
					System.out.println(ch+ "is" +map.get(ch));
				}
			}
		}
		
	}

}
