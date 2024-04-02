import java.util.*;

class LengthOfNumber1
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number:");

	int num = sc.nextInt();
	int dup = num;
	int power = 1;
	int length =0;

	while(num>0)
	{
		length++;
		num/=10;
	}

	for(int i=1; i<=length; i++)
	{
		power = power*dup;
	}
	System.out.println(power);
}
}