import java.util.*;
public class oper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,f,g;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        g=a%b;
        System.out.println("Sum:"+c);
        System.out.println("Difference:"+ d);
        System.out.println("Product:"+e );
        System.out.println("Quotient:"+ f);
        System.out.print("Remainder:"+ g);
    }
}