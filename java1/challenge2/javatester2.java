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
