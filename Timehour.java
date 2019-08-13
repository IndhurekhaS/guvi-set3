import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int sub=Math.abs(n-n2);
        int sub1=Math.abs(n1-n3);
        System.out.println(sub+" "+sub1);
    }
}
