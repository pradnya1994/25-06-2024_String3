package javaStringAssignments;

public class Example12 
{

	public static void main(String[] args) 
	{

		String text = "my name is Pradnya Varade, my name is Pradnya";

		char[] charValues = text.toCharArray();  //converting character values to array

		for(char charValue: charValues)
		{
			System.out.println(charValue);
		};

	}

}
