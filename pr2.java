public class pr2 {
    public static void main (String arg [])
    {
        double var1 = 1234.5678;
        long y = (long)var1;
        int x = (int)y;
        int z = (int)((var1-(double)x)*10000);
        System.out.println(x);
        System.out.println(z);
        System.out.println(y);



    }
}
