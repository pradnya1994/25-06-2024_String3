package javaStringAssignments;

public class Example10 
{

	public static void main(String[] args) 
	{

		String text = " my name is James Bond 007, my name is monark ";

		System.out.println(text.replace(' ', '-'));
		
		System.out.println(text.replace("my name is monark", "your not a monark"));

		System.out.println(text.trim());
		
	}

}
