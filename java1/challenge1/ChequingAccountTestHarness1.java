public class ChequingAccountTestHarness 
{
	public static void main (String [] args) //   Main method
	{
	//   Create an object of class ChequingAccount (This will call the constructor)
			ChequingAccount ca = new 	 							                             ChequingAccount("Harry", "Potter", 50000.00, 987654321);

		//   Setter
			ca.setFname("Tom");         //   sets the fname value to Tom
			ca.setLname("Riddle");      //   sets the lname value to Riddle

		//   Print the values of fname, lname, balance & accno

		System.out.println("Changed First Name: " + ca.getFname());
		System.out.println("Changed Last Name: " + ca.getLname());
		System.out.println("Balance: " + ca.getbal());
		System.out.println("Account Number: "+ ca.getAccNo());	
}
}
