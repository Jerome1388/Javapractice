package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintvalueusingMap2 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		
		Iterator<Map.Entry<String, Integer>> entry = map.entrySet().iterator();
		while(entry.hasNext()) 
		{
			Map.Entry<String,Integer> entries = entry.next();
			System.out.println(entries.getKey()+"-->"+entries.getValue());
		}
			
		}

}
