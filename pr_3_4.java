import java.util.Scanner;

class Date{  //declare class
    int month , day , year;
    Scanner sc = new Scanner(System.in);

    void getdate(){   //getting data
        System.out.println("Enter Day: ");
        day = sc.nextInt();
        System.out.println("Enter Month: ");
        month = sc.nextInt();
        System.out.println("Enter Year: ");
        year = sc.nextInt();
    }

    void dispdate(){  //print data
        System.out.println("Date: " + day+ "/" + month + "/" + year);
    }
}
public class pr_3_4{
    public static void main(String[] args) {
    Date D = new Date();  //create object of class
    D.getdate();    //call method
    D.dispdate();
    System.out.println(" \nThis Practical is made by 23CS061- Dhruvil Patel ");
}
}