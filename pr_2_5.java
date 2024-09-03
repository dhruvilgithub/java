import java.util.Arrays;

public class pr_2_5 {
    public static void main(String[] args) {
        String s1 = "qwertyuioplkjhgfdsazxcvbnm";
        String s2 = "";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        for (int i = 0; i < s1.length(); i++) {
            s2 = s1.charAt(i) + s2;
            }
        System.out.println(s2);
            sortstring(s1);
            System.out.println("\n This Practical is made by 23CS061- Dhruvil Patel ");

        
}
 static void sortstring (String str)
    {
        char[] arr1 = str.toCharArray();
        Arrays.sort(arr1); 
        System.out.println(String.valueOf(arr1));
    }
}