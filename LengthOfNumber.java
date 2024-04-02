class LengthOfNumber
{
	public static void main(String[] args) {
		
		int num = 123;
		int length = 0;
		
		for(int i=num; i>0; i/=10)
		{
			length++;
		}
		System.out.println(length);
	}
}