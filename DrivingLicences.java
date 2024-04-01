import java.util.Scanner;

class DrivingLicences
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age");

		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.println("You are elibile for Driving licences");

			System.out.println("Enter the Marks:");
			int marks = sc.nextInt();
			if(marks>60)
			{
				System.out.println("Congratulations ! you have passed the RTO test:");
			}
			else{
				System.out.println("You haven't passed the RTO test, Please re-appear for the test.");

				System.out.println("Can i Re-appeared for the RTO test again: (yes/no");
				String test = sc.next().toLowerCase();
				if(test.equals("yes"))
				{
					System.out.println("Yes ! you can apper for the RTO test again ");
				}
				else{
					System.out.println("you can't apper for the RTO test again");
				}
			}

		}
		else{
			System.out.println("You are not eligible for Driving liceence, you can apply again afetr :" + (18-age) + " years ");
		}
	}
}