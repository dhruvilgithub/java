import java.util.Scanner;
public class pr_1_6 {
    public static void main (String arg[])
    {
        System.out.print("Enter the number :");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp=0,num1=0;

        while(num!=0)
        {
                temp=num%10;
                num1=temp+(num1*10);
                num/=10;
        }
        System.out.println("revers number is "+num1);
        System.out.println(" This Practical is made by 23CS061- Dhruvil Patel ");
        

    }
    
}
