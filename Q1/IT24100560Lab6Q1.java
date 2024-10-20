import java.util.Scanner;
public class IT24100560Lab6Q1 
{
    public static void main(String[] args) 
    {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num = input.nextDouble();
		
		double square = Math.pow(num,2);
		System.out.print('\n');
		System.out.println("The square of" + num + "is :" + square);
		
		double squareRoot = Math.sqrt(num);
		System.out.println("The square root of" + num +"is :" + squareRoot);
	}
}