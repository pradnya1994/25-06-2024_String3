package javaStringAssignments;

public class Example6 
{

	public static void main(String[] args) 
	{

		String text1 = "my name is Geetanjali";
		
		byte[] byteValues = text1.getBytes(); //giving ASCII values of each character with space
		
		for(byte byteValue: byteValues)
		{
			System.out.println(byteValue);
		}

	}

}
