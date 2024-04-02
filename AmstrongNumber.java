class AmstrongNumber
{
	public static void main(String[] args) {
		
		int num = 153;
		int dup = num;
		int dup1= num;
		int length = 0;
		int sum = 0;

		while(num>0)
		{
			length++;
			num = num/10;
		}
		while(dup>0)
		{
			int rem = dup%10;
			int power =1;

			for(int i=1; i<=length; i++)
			{
				power = power*rem;
			}

			sum = sum+power;
			dup = dup/10;

			if(sum==dup1)
			{
				System.out.println("Amstrong");
			}
		else{
			System.out.println("Not Amstrong");
		}
		}

	}
