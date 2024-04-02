import java.util.*;
class PrimeNumber
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		boolean flag = false;

	

		for(int i=1; i<=num/2; ++i)
		{
			if(num%i==0)
			{
               flag = true;
               break;
			}
				//flag = false;
				//break;
			
		}
		
		if (!flag && num > 1) {
                System.out.print(num + " ");
        }
	}
}
