import java.util.Scanner;
class ScannerExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Name:");
		String name = sc.next();
		char ch = name.charAt(0);
		System.out.println("Hi my name is :" + name + "and my name first character is:" + ch);

		if(ch == "a" || ch == "e" || ch ==  "i" || ch== "o" || ch == "u" )
		{
            System.out.println("Character" + ch + "is a vowel.");

		}
		 else
		 {
			System.out.println("Character" + ch + "is a consonent.");
		}
	}	
}