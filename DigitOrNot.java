import java.util.Scanner;

class DigitOrNot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the number :");

	    int a = sc.nextInt();

	    System.out.println((a >=0 && a <= 9) ? "It is a Digit" : "It is not Digit");
	}
}