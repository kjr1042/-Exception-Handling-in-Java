import java.util.*;

public class tryWithMultiCatchExample {

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
			
			System.out.println("Enter the Array Size: ");
			int size =scan.nextInt();
			int arr[] =new int[size];
			System.out.println("Enter the Array Elements: ");
			int ele =scan.nextInt();
			System.out.println("Enter the Array Index: ");
			int index =scan.nextInt();
			arr[index] =ele;
			arr =null;
			System.out.println(arr[index]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Provide Non-Zero denominator ");
		}
		catch( NegativeArraySizeException ne)
		{
			System.out.println("Provide Postive Array size ");
		}
		catch( InputMismatchException ie)
		{
			System.out.println("Provide only integers ");
		}
		catch( ArrayIndexOutOfBoundsException arre)
		{
			System.out.println("Provide valid Index ");
		}
		catch( Exception e)
		{
			System.out.println("Invalid input try again... ");
		}
		System.out.println("connection is terminated");

	}

}
