import java.util.Scanner;

class FeetIntoMeters
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value for feet:");
		double feet = sc.nextDouble();

		double meter = feet*0.305;
		System.out.println(feet + "The feet is :"+ meter + "meters");

	}
}