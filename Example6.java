package javaStringAssignments;

public class Example6 
{

	public static void main(String[] args) 
	{

		String text1 = "my name is don";
		
		byte[] byteValues = text1.getBytes();
		
		for(byte byteValue: byteValues)
		{
			System.out.println(byteValue);
		}

	}

}
