import java.util.*;
public class cross
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=(a*b)/a;
        d=(a*b)/b;
        System.out.println(c);
        System.out.print(d);
    }
}