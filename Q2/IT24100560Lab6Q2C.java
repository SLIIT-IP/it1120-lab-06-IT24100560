import java.util.Scanner;
public class IT24100560Lab6Q2C
{
    public static void main(String[] args)
    {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 10 numbers ");
		
		System.out.print("Enter number 1: ");
		int num1=input.nextInt();
		
		System.out.print("Enter number 2: ");
		int num2=input.nextInt();
		
		System.out.print("Enter number 3: ");
		int num3=input.nextInt();

		System.out.print("Enter number 4: ");
		int num4=input.nextInt();

		System.out.print("Enter number 5: ");
		int	num5=input.nextInt();

		System.out.print("Enter number 6: ");
		int num6=input.nextInt();

		System.out.print("Enter number 7: ");
		int	num7=input.nextInt();

		System.out.print("Enter number 8: ");
		int num8=input.nextInt();

		System.out.print("Enter number 9: ");
		int num9=input.nextInt();

		System.out.print("Enter number 10: ");
		int num10=input.nextInt();

        System.out.print('\n');
		System.out.println("The numbers you entered are : ");
		System.out.println(num1 +" " + num2 +" " + num3 +" " + num4 +" " + num5 +" " + num6 +" " + num7 +" " + num8 +" "+ num9 +" " + num10);

		double sum = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10);
		double average = (sum/10);

		System.out.print('\n');
		System.out.println("Sum of the numbers: " +sum);
		System.out.println("Average of the numbers: " +average);
	}
}