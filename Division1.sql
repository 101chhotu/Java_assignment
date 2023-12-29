set serveroutput on;

Declare
   num1 number(2);
   num2 number(2);
   div1 number(4);
Begin
   num1:=&num1;
   num2:=&num2;
   div1:=num1/num2;

   dbms_output.put_line('division  of two number:'||div1);
End;
/
