package collection;

import java.util.HashMap;
import java.util.Map;

public class PrintvalueusingMap1 
{
	public static void main(String[] args) 
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("A","1");
		map.put("B","2");
		map.put("C","3");
		map.put("D","4");
		map.put("E","5");
		
		for ( Map.Entry<String,String> entry : map.entrySet()) 
		{
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}

}
