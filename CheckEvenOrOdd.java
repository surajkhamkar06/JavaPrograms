import java.util.Scanner;

class CheckEvenOrOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();

		if(num%2==0){
			System.out.println("It is a Even number");
		}
		else{
			System.out.println("It is Odd number");
		}
	}
}