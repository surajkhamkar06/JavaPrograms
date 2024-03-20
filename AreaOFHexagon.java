import java.util.Scanner;

class AreaOfHexagon
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the side of length:");

		double s = sc.nextDouble();

		System.out.println("Find the Area of Hexagon is:");

		 double area = (3 * Math.sqrt(2) * side * side) / 2;

		System.out.println("The Area of Hexagon is: " + area);
	}
}