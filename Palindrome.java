package javapractice;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String str ="TestLeaf";
		String Rev ="";
		
		for(int i = str.length()-1;i>=0;i--)
		
			Rev= Rev+str.charAt(i);
		if(str.equals(Rev))
			System.out.println(str  + "Is Polindrome");
		else 
			System.out.println(str + "Is not Palindrome");
		
	}

}
