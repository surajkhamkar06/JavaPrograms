import java.util.Scanner;

class JoinArmyOrNot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
        int age = sc.nextInt();

        System.out.println("Enter the Height in cm :");
		double height = sc.nextDouble();

		if(age>18 && height>=162)
		{
            System.out.println("Enter the Weight in kg:");
			double weight = sc.nextDouble();
			if(weight>56)
			{
			   System.out.println("You are Eligible for join the Army");
			}
			else{
				System.out.println("Go and have some food and increase some Weight");
			}
			
		}
		else{
			System.out.println("You are not Eligible for join the Army");
		}
	}
}