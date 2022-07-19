import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Arithmetic Calculator");
		System.out.println("Enter Number1: ");
		num1 = sc.nextDouble();
		System.out.println("Enter Number2: ");
		num2 = sc.nextDouble();
		System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Remainder \n6. Exit");
		while(true) {
			System.out.println("Enter number according to your operation: ");
			a = sc.nextInt();
			if(a==1) 
			{
				System.out.println("Addition is" + (num1+num2));
			}
			else if(a==2)
			{
				System.out.println("Subtraction is" + (num1-num2));
			}
			else if(a==3)
			{
				System.out.println("Multiplication is" + (num1*num2));
			}
			else if(a==4)
			{
				System.out.println("Division is" + (num1/num2));
			}
			else if(a==5)
			{
				System.out.println("Remainder is" + (num1%num2));
			}
			else if(a==6)
			{
				break;
			}
			else
			{
				System.out.println("Invalid option! Choose option from 1 to 6 only");
			}
		}
	}

}
