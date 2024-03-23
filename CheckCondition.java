import java.util.Scanner;

class CheckCondition
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
		int age = sc.nextInt();

		System.out.println("Enter the Property:");
		long property = sc.nextLong();

		//sc.nextLine();
		//Scanner sc1 = new Scanner(System.in);
		//scc.reset();

		System.out.println("Enter the Surname:");
        String surname = sc.next().toUpperCase();

		if((age>=21 &&  property >= 10000000l )|| (surname.equals("Ambani"))){
			System.out.println(" You are eligible");
		} 
		else{
			System.out.println("you are not eligible");
		}
	}
}
