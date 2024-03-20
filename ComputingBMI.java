import java.util.Scanner;

class ComputingBMI
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of Weight in pounds:");
		double weight = sc.nextDouble();

		System.out.println("Enter the value of height in inches:");
		double height = sc.nextDouble();

		System.out.println("Enter the BMI:");

		double bmi = (weight*0.45359237) / (height* 0.0254 * height* 0.0254);
		System.out.println("BMI is :" + bmi);
		
	}
}