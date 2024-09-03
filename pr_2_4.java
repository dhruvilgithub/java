import java.util.*;
public class pr_2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] str2 = str1.split("\\s+");
        
        for(int i = 0 ; i <str2.length;i++)
        {
                String temp =str2[i];
                for(int j= temp.length()-1;j>=0;j--)
                {
                    char a = temp.charAt(j);
                    System.out.print(a);
                }
                System.out.print(" ");

        }
        System.out.println(" \nThis Practical is made by 23CS061- Dhruvil Patel ");
        scan.close();
    }
   

}
