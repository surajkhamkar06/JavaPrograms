import java.util.Scanner;

class IncreasePay
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee's monthly target score:");
		double targetScore = sc.nextDouble();

		System.out.println("Enter Employee's Current pay:");
		double currentPay = sc.nextDouble();

		double payIncreasePerccentage;

		if(targetScore>90){
			 payIncreasePerccentage = 0.03;
		}
		else{
			payIncreasePerccentage = 0.01;
		}
		double payIncreaseAmount = currentPay*payIncreasePerccentage;

		double newPay = currentPay + payIncreaseAmount;
20
		System.out.println("New Pay after increse:" + newPay);
	}
}