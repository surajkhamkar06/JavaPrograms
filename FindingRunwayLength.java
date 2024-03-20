import java.util.Scanner;

class FindingRunwayLength
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Speed is:");
		double v = sc.nextDouble();

		System.out.println("Enter the Acceleration is:");
		double a = sc.nextDouble();

		double length = (v*v)/(2*a);
		System.out.println("The minimum runway length for this airplane is:" + length +" m/s ");
	}
}