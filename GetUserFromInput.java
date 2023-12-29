import java.util.*;

class GetUserFromInput
{
   public static void main (String argd[])
  {
      Scanner obj=new Scanner (System.in);
      System.out.println("enter your name:");
      String str=obj.nextLine();
      System.out.println("enter your name:"+str);
    
      System.out.println("enter your age:");
      int age=obj.nextInt();
      System.out.println("enter your age:"+age);
    
      System.out.println("enter your per:");
      Float per=obj.nextFloat();
      System.out.println("enter your per:"+per);
    
  }
}
