import java.util.Scanner;

class complex{  //create class
    float r, i;
    Scanner sc = new Scanner(System.in);

    void getdata()   //getting data of real & imaginary nos.
    {
        System.out.println("Enter real number: ");
        r = sc.nextFloat();
        System.out.println("Enter imaginary number: ");
        i = sc.nextFloat();
    }
    //create constructor for sum
    complex sum(complex c1 , complex c2)
    {
        complex temp = new complex();
        temp.r = c1.r + c2.r;
        temp.i = c1.i + c2.i;
        return temp;
    }
    //create constructor for subtraction
    complex sub(complex c1 , complex c2)
    {
        complex temp = new complex();
        temp.r = c1.r - c2.r;
        temp.i = c1.i - c2.i;
        return temp;
    }
    //create constructor for product
    complex product(complex c1 , complex c2)
    {
        complex temp = new complex();
        temp.r = (c1.r * c2.r) - (c1.i*c2.i);
        temp.i = (c1.r * c2.i) + (c2.r * c1.i);
        return temp;
    }
    //method which give answer
    void ans()
    {
        if(i<0)
            System.out.println(r+" - "+i+"i");
        else
            System.out.println(r+" + "+i+"i");
    }
}

public class pr_3_6{
    public static void main(String[] args) { //main calss
        complex c1 = new complex();  // creating two objects
        complex c2 = new complex();
        c1.getdata();                 // calling objects
        c2.getdata();

        complex c3 = new complex();
        complex c4 = new complex();
        c4 = c3.sum(c1, c2);//object c3 is used to call the method & c1,c2 is passed as argument and c4 is used to store the values returned by the method
        c4.ans();       //Displaying data         
        c4 = c3.sub(c1, c2);
        c4.ans();
        c4 = c3.product(c1, c2);
        c4.ans();
        System.out.println(" \nThis Practical is made by 23CS061- Dhruvil Patel ");
    }
}
