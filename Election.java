import java.util.Scanner;

class Election
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);0

		System.out.println("Enter the age:");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.println("Do you have a Voter ID  (yes/no) :");
			String voterId = sc.next().toLowerCase();
			if(voterId.equals("yes"))
			{
				System.out.println("********Welcome********");
				System.out.println("1. BJP");
				System.out.println("2. Congress");
				System.out.println("3. AAP");
				System.out.println("4. MNS");
				System.out.println("5. ShivSena");
				System.out.println("6. NCP");
				System.out.println("7. NOTA");

				System.out.println("Enter the option to vote your fav party:");
				String vote = sc.next().toUpperCase();
				if(vote.equals("BJP"))
				{
					System.out.println("You have voted for BJP");
				}
				else if(vote.equals("Congress"))
				{
					System.out.println("You hava voted for Congress");
				}
				else if(vote.equals("AAP"))
				{
					System.out.println("You hava voted for AAP");
				}
				else if(vote.equals("MNS"))
				{
					System.out.println("You have voted for MNS");
				}
				else if(vote.equals("ShivSena"))
				{
					System.out.println("You have voted for ShivSena");
				}
				else if(vote.equals("NCP"))
				{
					System.out.println("You have voted for NCP");
				}
				else if(vote.equals("NOTA"))
				{
					System.out.println("Thanku for westing your Vote");
				}
				else{
					System.out.println("Invalid Input");
				}
			}
			else{
				System.out.println("Jaldi yaha se hato");
			}
		}
		else {
			System.out.println("You are not mature to vote try after" + (18-age) + "years.");
		}


	}
}