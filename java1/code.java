// Step 1 (class declaration)
public class JavaCodeTester1
{
	// Step 2 (main method)
	public static void main (String [] args)
	{		
		// Step 4 (storing a Boolean value)
		boolean isJavaFun = true;
		// Step 5 (displaying the boolean value)
		System.out.print("Step 5 Output (boolean): ");	
		System.out.println(isJavaFun + "\n");		
		// Step 6 (storing a character)
		char nameinitial = 'S';
		// Step 7 (displaying the character)
		System.out.print("Step 7 Output (character): ");
		System.out.println(nameinitial + "\n");
		// Step 8 (storing two string values)
		String str1 = "Hello", str2 = "World";
		// Step 9 (displaying the concatenated value)
		System.out.print("Step 9 (String Concatenation): ");
		System.out.println(str1 + str2 + "\n");
		// Step 10 (storing an integer)
		int age = 18;
		// Step 11 (displaying the integer)
		System.out.print("Step 11 Output (integer): ");
		System.out.println(age + "\n");
		// Step 12 (storing a double value)
		double height = 165.7;
		// Step 13 (displaying the double value)
		System.out.print("Step 13 Output (double): ");
		System.out.println(height + "\n");
	}
}

           Challenge 2
# CODE #
// Step 1 (class declaration)
public class JavaCodeTester2
{
	// Step 2 (main method)
	public static void main (String [] args)
	{
		// Step 4 (storing three string values)
		String str1 = "Professor", str2 = "Albus", str3 = "Dumbledore";
		// Step 5 (storing concatenated string in a new variable)
		String newstr = str1 + str2 + str3;
		// Step 6 (displaying the 3rd and 5th and 7th character of the concatenated string)
		char result1 = newstr.charAt(3);
		char result2 = newstr.charAt(5);
		char result3 = newstr.charAt(7);
System.out.print("Step 6 : ");
System.out.println("3rd character of concatenated string(newstr):" + result1 + “  5th character of concatenated string(newstr):" + result2 + "  7th character of concatenated string(newstr):" + result3 + "\n");
		// Step 7 (checks if concatenated string starts with ‘test’)
		System.out.print("Step 7: ");
		System.out.println(newstr.startsWith("test") + "\n");
		// Step 8 (display the concatenated string in all uppercase letters)
		System.out.print("Step 8 : ");
		System.out.println(newstr.toUpperCase() + "\n");
		// Step 9 (storing an integer)
		int age = 18;
		// Step 10 (placing increment operator before the variable)
		System.out.print("Step 10 : ");
		System.out.println(++age + "\n");
		// Step 11 (placing increment operator after the variable)
		System.out.print("Step 11 : ");
		System.out.println(age++);
 	}
}

      Challenge 3
# CODE #

public class JavaCodeTester2
{

	public static void main (String [] args)
	{

		// Step 1 (storing an integer value)

		int age = 18;

		// Step 2 (checks whether the number is odd or even)

		if (age % 2 == 0)
		{
			System.out.println(age + "is n even number");
		}

		else 
		{
			System.out.println(age + "is n even number");
		}
	
	}
