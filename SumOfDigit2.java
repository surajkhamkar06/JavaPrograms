import java.util.Scanner;

class SumOfDigit2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value between 0 to 999 :");

		int num = sc.nextInt();

		System.out.println("Enter the values:");
		int a = num%10;
		int b = (num/10)%10;
		int c = (num/100)%10;

		int sum = a+b+c;
		System.out.println("Enter the sum of digits:" + sum);
	}
}