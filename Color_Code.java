import java.util.*;
public class ColorCode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a;
        a=sc.nextLine().charAt(0);
        if(a=='v'||a=='V')
        {
            System.out.printf("Violet");
        }
        else if(a=='i'||a=='I')
        {
            System.out.printf("Indigo");
        }
        else if(a=='b'||a=='B')
        {
            System.out.printf("Blue");
        }
        else if(a=='g'||a=='G')
        {
            System.out.printf("Green");
        }
        else if(a=='Y'||a=='y')
        {
            System.out.printf("Yellow");
        }
        else if(a=='o'||a=='O')
        {
            System.out.printf("Orange");
        }
        else if(a=='r'||a=='R')
        {
            System.out.printf("Red");
        }
        else 
        {
            System.out.printf("-1");
        }
    }
}