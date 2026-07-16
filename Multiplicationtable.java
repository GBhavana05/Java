import java.util.*;
public class Multiplicationtable {
    		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range (Tables will be printed from 1 to n)");
		int n = sc. nextInt();
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=10;j++)
		    {
		        System.out.println(i+"*"+j+"="+i*j);
		    }
		    System.out.println("==========================");
		}
	}
}
	


