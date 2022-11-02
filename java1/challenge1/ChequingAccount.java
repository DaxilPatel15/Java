
//   This class contains the required state and behavior of the object
public class ChequingAccount   
{       //   Create a class attribute
	private String fname, lname; //   private = restricted access
	private double balance;
	private int accno;
//   Create a class constructor for the ChequingAccount class
	public ChequingAccount (String fname, String lname, double balance, int accno)
	{
		this.fname = fname;
		this.lname = lname;
		this.balance = balance;
		this.accno = accno;
	}
	//   Getter: gets first name
	public String getFname() 
	{
		return this.fname;
	}
	//   Setter
	public void setFname (String fname)
	{
		this.fname = fname;
	}
	//   Getter: gets last name
public String getLname () 
	{
		return this.lname;
	}

	//   Setter
	public void setLname (String lname)
	{
		this.lname = lname;
	}
	//   Getter: gets balance
	public double getbal () 
	{
		return this.balance;
	}
	//   Setter
	public void setbal (double balance)
	{
		this.balance = balance;
	}
	//   Getter: gets account number
	public int getAccNo () 
	{
		return this.accno;
	}
	//   Setter
	public void setAccNo (int accno)
	{
		this.accno = accno;
	}
}
