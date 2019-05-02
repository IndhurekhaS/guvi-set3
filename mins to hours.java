import java.util.*;
public class minutes{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int min=sc.nextInt();
    int hours=min/60;
    int mins=min%60;
    System.out.println(hours+" "+mins);
    
}
}
