import java.util.Scanner;

class SumOfDigit
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number between 0 and 1000:");
        int num = sc.nextInt();

		System.out.println("Extract individual digits:");
        
        int dup = num;
		int a = num % 10;
        int b = (num / 10) % 10;
        int c = (num / 100) % 10;
        

        System.out.println("Calculate the sum of all digits:");
        int sum = a + b + c;

        System.out.println("The sum of the digits is: "+ sum + " and the number is " + dup);
	}
}