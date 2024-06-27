package javaStringAssignments;

public class Example12 
{

	public static void main(String[] args) 
	{

		String text = "my name is James Bond 007, my name is monark";

		char[] charValues = text.toCharArray();

		for(char charValue: charValues)
		{
			System.out.println(charValue);
		};

	}

}
