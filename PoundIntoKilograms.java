import java.util.Scanner;

class PoundIntoKilograms
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Pound value is ");
		double pound=  sc.nextDouble();

		System.out.println("Pound converts in Kilograms:");

		double kilograms = pound*0.454;

		System.out.println( pound + " Pounds is " + kilograms + " kilograms ");

	}
}
	
