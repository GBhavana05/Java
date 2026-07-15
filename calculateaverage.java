import java.util.*;
    public class calculateaverage
    {
        public static void main(String args[])
        {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter the number of elements: ");
             int n=sc.nextInt();
             int sum =0;
             for(int i=0;i<n;i++)
             {
                System.out.print("Enter a number:");
                int num=sc.nextInt();
                sum+=num;
             }
             double average=(double)sum/n;
                System.out.println(average);
                sc.close();
        }
    }