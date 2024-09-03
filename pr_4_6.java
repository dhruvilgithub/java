public class pr_4_6 {
    public static void main(String[] args) {
        Q q1 = new Q();
        q1.p1();
        q1.p2();
        System.out.println("This practical is made by 23CS061-Dhruvil Patel");
    }

}

interface P1 {
    int a = 1;

    public void p1();
}

interface P2 {
    int b = 2;

    public void p2();
}

interface P12 extends P1, P2 {

}

class Q implements P12
{
    public void p1()
    {
        System.out.println("Value of P1 element :"+a);
    }
    public void p2()
    {
        System.out.println("Value of P2 element :"+b);
    }
   

}