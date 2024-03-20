import java.util.Scanner;

class ChackeAlphabate
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Character:");

        char ch = sc.next().charAt(0);
        
       // boolean isItAlphabate = (ch>= 'a' && ch<='z')|| (ch>='A' && ch<='Z');
       // boolean isItLowercase = isItAlphabate && (ch>= 'a' && ch<='z');
       // boolean isItUppercase = isItAlphabate && (ch>='A' && ch<='Z');String result = isItAlphabate ? (isItLowercase ? "It is Lowercase" : "It is Uppercase") : "It is not Alphabate" ;
       //System.out.println(result);

        System.out.println(((ch>= 'a' && ch<='z')|| (ch>='A' && ch<='Z'))? ((ch>='A' && ch<='Z')? "It is Uppercase Alphabet" : "It is Lowercase Alphabet"): "In is not Alphabet");

	}
}