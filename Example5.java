package javaStringAssignments;

public class Example5 
{

	public static void main(String[] args) 
	{

		String text1 = "my name is don";
		String text2 = "my name is don";
		String text3 = "my name is james bond 007";
		String text4 = "My name is Don";

		System.out.println(text1.equals(text2));
		
		System.out.println(text1.equals(text3));
		
		System.out.println(text1.equalsIgnoreCase(text4));  //ignoring uppercase lowercase letters

		String text5 = "my name is raghav";
		String text6 = "my name is pradnya";
		String text7 = "my name is raghav";
		String text8 = "My name is raghav";

		System.out.println(text5.equals(text6));
		
		System.out.println(text5.equals(text7));
		
		System.out.println(text5.equalsIgnoreCase(text8));

	}

}
