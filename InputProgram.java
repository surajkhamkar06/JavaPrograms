import java.util.Scanner;
class InputProgram
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number:");
  int num1 = sc.nextInt();
  
  System.out.println("Enter the second number:");
  int num2 = sc.nextInt();
  
  int add = num1 + num2;
  System.out.println("Addition of two numbers:" + add);
  }
}s
  