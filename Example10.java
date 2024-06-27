package javaStringAssignments;

public class Example10 
{

	public static void main(String[] args) 
	{

		String text = " my name is Pradnya Varade, my name is Pradnya ";

		System.out.println(text.replace(' ', '-'));  //replacing space by -
		
		System.out.println(text.replace("my name is mukund", "your not a mukund"));

		System.out.println(text.trim());
		
	}

}
