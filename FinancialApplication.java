import java.util.Scanner;

class FinancialApplication
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Subtotal Bill:");
		double subTotal = sc.nextDouble();

		System.out.println("Enter the tip rate:");
		double tipRate = sc.nextDouble();

		double total = subTotal + tipRate*(subTotal/100);

		System.out.println("Subtotal is :"+subTotal+ "and the total is:" + total + tipRate);
		System.out.println("Thanks visit again");
		
	}
}