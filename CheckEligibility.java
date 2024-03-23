import java.util.Scanner;

class CheckEligibility
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the Pecentage:");

	    double percentage = sc.nextDouble();

	    if(percentage>=60 && percentage<=100){
	    	System.out.println("Student is eligible for interview");
	    }
	    else{
	    	System.out.println("Student is not eligible for interview");
	    }
	}
}
