import java.util.Scanner;

class CheckPositiveOrNegative
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value:");

		int i = sc.nextInt();

		if(i>0)
		{
           System.out.println("The Number is Positive");
		}else if(i==0){
			System.out.println("The number is neither Positive nor Negative It is Zero ");
		}
		else{
			System.out.println("The Number is Negative");
		}
		
	}
}