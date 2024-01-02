import java.util.*;

public sunday 
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter your choice 1 to 7:");

   char ch=obj.next().chatAt(0);
   String answer;
   switch (ch)
     {
       case '1':
         answer ="monday";
         break;
      case '2':
         answer ="tuesday";
         break;
      case '3':
         answer ="wednesday";
         break;
      case '4':
         answer ="thursday";
         break;
       case '5':
         answer ="friday";
         break;
      case '6':
         answer ="saturday ";
         break;
       case '7':
         answer =" sunday";
         break;
     }
  System.out.println("today is:"+answer) ;
  }
