
import java.util.*;
public class pr_3_5 {  
    public static void main(String[] args) {

    Area obj1 = new Area();
    System.out.println("Area of given perameter is : "+obj1.returnArea());
    System.out.println(" \nThis Practical is made by 23CS061- Dhruvil Patel ");

}
}
class Area {
Scanner scan = new Scanner(System.in);

int height,length;
public
Area()
{    System.out.print("Enter height :");
    height = scan.nextInt();
     System.out.print("Enter length :");
    length  = scan.nextInt();
}
int returnArea ()
{
    return height*length;
}
}
