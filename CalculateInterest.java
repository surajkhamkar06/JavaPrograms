import java.util.Scanner;

class CalculateInterest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Balance is:");
		double balance = sc.nextDouble();

		System.out.println("Enter the Interest: ");
		double annualInterestRate = sc.nextDouble();

        double interest = balance*(annualInterestRate/1200);
		System.out.println("The interest is " + interest );
	}
}