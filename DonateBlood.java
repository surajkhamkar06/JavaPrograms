import java.util.Scanner;

class DonateBlood
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age:");
		int age = sc.nextInt();

		if(age>20)
		{
            System.out.println("have you consumed Cigarette or Alchohol(yes/no):" );
            String nasha = sc.next().toLowerCase();

            if(nasha.equals("Yes"))
            {
            	System.out.println("You can not donate blood because you are in nasha");
            }
            else{
            	System.out.println("Enter your weight:");
                double weight = sc.nextDouble();

                if(weight>= 50)
                {
                	System.out.println("We can pump your Blood:");
                }
                else{
                	System.out.println("Go and have some food and increase your weight:");
                }
            }

		}
		else{
			System.out.println("You are kid. Try after " + (20-age) + " years ");
		}

	}
}