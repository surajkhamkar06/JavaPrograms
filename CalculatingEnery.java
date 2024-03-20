import java.util.Scanner;

class CalculatingEnery
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount of water in kilogrmas:");
		double m = sc.nextDouble();

		System.out.println("Enter the initial temperature:");
		double initialTemperature = sc.nextDouble();

		System.out.println("Enter the final temperature:");
		double finalTemperture = sc.nextDouble();

		double q = m*(finalTemperture - initialTemperature)*4184;
		System.out.println("The enery needed is : " + q);
	}
}