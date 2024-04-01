import java.util.Scanner;

class IfElseIfExample
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the Percentage:");
		double percentage = sc.nextDouble();

		if(percentage<=35){
			System.out.println("Gali");
		}
		else if(percentage>35 && percentage<=60){
			System.out.println("Second class with B grade");
		}
		else if(percentage>60 && percentage<=75){
			System.out.println("First class with A grade");
	}   
	else if(percentage>75 && percentage<=90){
			System.out.println(" Distination with A+ grade");
}   else if(percentage>90 && percentage<=100){
			System.out.println("First class with destination with B grade");

}

}
}

