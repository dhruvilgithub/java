import java.util.Scanner;
public class pr_2_2{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count=0; 
		System.out.print("Enter array Size :");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n ; i++)
		{
			System.out.print("Enter array "+(i+1)+"digit:");
			arr[i] = scan.nextInt();
		}
		
		for(int i =0; i<4 ; i++)
		{
			if(arr[i]==9)
			{	
				count=1;
				break;
			}
		}
			
		if(count==1)
		{
			System.out.print("True");
		}
		else{
			System.out.print("False");
		}
        System.out.println("\n This Practical is made by 23CS061- Dhruvil Patel ");
	}
}