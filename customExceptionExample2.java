import java.util.*;
class underAgeException extends Exception
{
	
	public String getMessage()
	{
		return "You are too Young , have patience...";
	}
}
class overAgeException extends Exception
{
	public String getMessage()
	{
		return "You are too Old , cool down...";
	}
}
class Applicant 
{
	private int age;
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age =scan.nextInt();
		
	}
	public void validateAge() throws underAgeException,overAgeException
	{
		if(age>=18 && age<=60)
		{
			System.out.println("Collect Your License");
		}
		else if(age<18)
		{
			underAgeException uge=new underAgeException();
			System.out.println(uge.getMessage());
			throw uge;
		}
		else 
		{
			overAgeException oae =new overAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
	}
}
class RTO
{
	public void initiate()
	{
		Applicant a = new Applicant();
		try 
		{
			a.acceptInput();
			a.validateAge();
		}
		catch(Exception e)
		{
			System.out.println("Thanking for Applying... ");
		}
	}
}
public class customExceptionExample2 {

	public static void main(String[] args) {
		RTO rto = new RTO();
		rto.initiate();

	}

}
