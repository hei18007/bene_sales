create sequence seq_cust
 start with     1000
 increment by   1
 nocache
 nocycle;
 
CREATE or replace
PROCEDURE proc_new_cust (CUSTOMER_ID out number,FIRST_NAME in varchar2,BALANCE in out number) IS
BEGIN
  select seq_cust.nextval into CUSTOMER_ID
  from dual;
  
  
  if (BALANCE is null) then
    select 100 into BALANCE
    from dual;
  end if;
    
  insert into CUSTOMER values (CUSTOMER_ID,FIRST_NAME,BALANCE);
END proc_new_cust;