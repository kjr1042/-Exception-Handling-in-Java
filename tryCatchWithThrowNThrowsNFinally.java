import java.util.Scanner;
class demo
{
	void fun() throws ArithmeticException
	{
		System.out.println("connection 2 is Established");
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("Enter the numerator: ");
			int a = scan.nextInt();
			System.out.println("Enter the denominator: ");
			int b = scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Handled inside fun()");
			throw e;
		}
		finally 
		{
			System.out.println("connection 2 is terminated");
		}
	}
}

public class tryCatchWithThrowNThrowsNFinally {

	public static void main(String[] args) {
		System.out.println("connection 1 is Established");
		try 
		{
			demo d = new demo();
			d.fun();
		}
		catch(Exception e)
		{
			System.out.println("Handled inside main()");
		}
		System.out.println("connection 1 is terminated");

	}

}
