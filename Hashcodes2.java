import java.util.*;
class Bank
{
 int savingBalance;
 int accno,amt; 
 String name;

  public void info()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the account holder name:");
  name=sc.nextLine();
  System.out.println("Enter the account number:");
  accno=sc.nextInt();
 }
 public void withdraw()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the amount to be withdrawn:");
  amt=sc.nextInt();
  if(amt>savingBalance)
  {
   System.out.println("Dont having enough balance in your account...");
   return;
  }
 else{
  savingBalance=savingBalance-amt;
  System.out.println("Remaining balance in your account is:"+savingBalance);
 }
}

 public void deposit()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the amount to be deposited:\n");
  amt=sc.nextInt();
  savingBalance=savingBalance+amt;
  System.out.println("Total balance in your account is:"+savingBalance);
 }
 public void Bal_Equ()
 {
  System.out.println("Total balance in your account is:"+savingBalance);
 } 
}

class atm
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  Bank s1=new Bank();
  int ch1;
  s1.info();                       
       do{
          System.out.println("****************************************************************");
          System.out.println("\n1.Withdraw amount\n2.Deposit amount\n3.Balance Enquiry\n4.Exit");
          System.out.println("****************************************************************");
          System.out.println("Enter your choice:");
          ch1=sc.nextInt();
          switch(ch1)
          {
          case 1:
               s1.withdraw();
          break;
          case 2:  
               s1.deposit();
          break;
          case 3:
               s1.Bal_Equ();
          break;
          case 4:
               System.exit(0);		
          } 
     }while(ch1!=5);
 }
} 