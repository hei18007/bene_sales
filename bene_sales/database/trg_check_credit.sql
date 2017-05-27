create or replace trigger trg_check_credit
before insert or update 
on CUSTOMER
referencing new as new old as old
for each row
declare
begin
   if (:new.balance < 0) then
     raise_application_error(-20000, 'account past due.');
   end if; 
  
   if (updating) then
    if (:new.balance < 0) then
       raise_application_error(-20000, 'account past due.');
    end if;
   end if;
   
end trg_check_credit;