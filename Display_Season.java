import java.util.*;
public class season
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a;
  a=sc.nextInt();
  switch(a)
   {
    case 11:
    case 12:
    case 1:
     { 
      System.out.println("Winter");
      break;
     } 
    case 6:
    case 4:
    case 5:
     { 
      System.out.println("Summer");
      break;
     } 
    case 10:
    case 7:
    case 8:
    case 9:
     { 
      System.out.println("Rainy");
      break;
     } 
    case 2:
    case 3:
     { 
      System.out.println("Spring");
      break;
     } 
    default:
    {
       System.out.println("-1");  
    }
   }
  }
}