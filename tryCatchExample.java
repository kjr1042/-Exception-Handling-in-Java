import java.util.Scanner;

public class tryCatchExample {

	public static void main(String[] args) {
		System.out.println("connection is Established");
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
			System.out.println("Enter Non-Zero value");
		}
		System.out.println("connection is terminated");

	}

}
