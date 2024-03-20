import java.util.Scanner;

class VowelOrConsonent
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Vowels: ");

		char ch = sc.next().charAt(0);

		System.out.println((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "It is Vowel" : "It is Consonent");
	}
}