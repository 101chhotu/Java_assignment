set serveroutput on;

Declare
   age number(2);
  
Begin
  if age>=18
   dbms_output.put_line('this person is adult:'||age);
 else 
   dbms_output.put_line('this person is child:'||age);
 end if;

End;
/
