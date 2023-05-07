import java.util.*;
public class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char x;
        x=sc.nextLine().charAt(0);
        if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
        {
            System.out.printf("Vowel");
            
        }
        else
        {
            System.out.printf("Consonant");
            
        }
        
    }
}