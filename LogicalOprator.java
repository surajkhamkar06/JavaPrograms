import java.util.Scanner;

class LogicalOprator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num:");
		int num = sc.nextInt();

		System.out.println((num%2==0) ? "Number is even" :   "Number is ODD ");
	}
}
