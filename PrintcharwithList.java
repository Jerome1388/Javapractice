package collection;

import java.util.Arrays;
import java.util.List;

public class PrintcharwithList 
{
	public static void main(String[] args) 
	{
		List<Character> li = Arrays.asList('B','u','g','a','t','t','i','C','h','i','r','o','n');
		StringBuilder str = new StringBuilder();
		for (Character character : li) 
		{
			str.append(character);	
		}
		String str1 = str.toString();
		System.out.println(str1);
	}

}
