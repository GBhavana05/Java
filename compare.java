import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		System.out.println("Enter first number");
		int a = sc. nextInt();
		System.out.println("Enter second number");
		int b= sc.nextInt();
		if(a==b){
		    System.out.println("Both are same");
		}
		else if(a>b)
		{
		    System.out.println("First number is greater");
		}
		else{
		    System.out.println("Second number is greater");
		}
	}
}
        
