package Computer;
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class paymentmethod
{
    static String pay[]={"Credit Card","Debit Card","Internet Banking"};
    static String pw;static long ccn,accno;static int payment,cvv;
    static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    public static void pay()throws Exception
    {
        System.out.println("\u000C\t\t\t/*INSTRUCTIONS-1)Only 16 digits for credit card and debit card number.");
        System.out.println("\t\t\t               2)Verification value should be of only 4 digits.");
        System.out.println("\t\t\t               3)THE ACCOUNT NUMBER SHOULD BE 14 DIGITS.");
        System.out.println("\t\t\t          NOTE:ALL THESE VALUES ARE INTEGERS ONLY*/"); 
        Thread.sleep(1000);
        System.out.print("\t\t\t");
        Time();
        Thread.sleep(500);
        System.out.println();
        System.out.print("\t\t\t");
        System.out.println("1.Credit Card\n\t\t\t2.Debit Card\n\t\t\t3.Internet Banking");
        System.out.println("YOUR TOTAL BILL IS-"+AccessoryList.price);
        System.out.println("Please enter the number corresponding the mode of payment you would like to use");
        System.out.print("\t\t\t");
        try
        {payment=Integer.parseInt(obj.readLine());}
        catch(Exception t)
        {System.out.print("\t\t\tONLY NUMBERS\n\t\t\tTry Again");
            Thread.sleep(5000);
            pay();}
                if(payment==1)
                {System.out.print("\t\t\t");
                    Cred();}
                    else  if(payment==2)
                {System.out.print("\t\t\t");
                    Debit();
                }
                else if(payment==3)
                {System.out.print("\t\t\t");
                    InT();}
                else
                {System.out.print("\u000C");System.out.println("YOU TYPED WRONG SO TRY AGAIN");pay();}
                System.out.print("\t\t\t");
                System.out.println("Congratulations! The transaction was successful");
                System.out.print("\t\t\t");
                Thread.sleep(900);
                Tagline_Credits.review();
        }
     static void Cred()throws Exception
     {
                System.out.print("\t\t\t");
                System.out.print("Please enter your credit card number\n\t\t\t");
                try{ccn=Long.parseLong(obj.readLine());}catch(Exception t)
                {
                    System.out.print("\t\t\tONLY NUMBERS\nTRY AGAIN\n\t\t\t");
                    ccn=Long.parseLong(obj.readLine());
                }
                int length = (int) Math.log10(ccn) + 1;
                {   if(length==16)
                    {
                        System.out.print("\t\t\t");
                        System.out.println("The credit card number you entered is correct.");
                    }
                    else
                    {
                        System.out.print("\t\t\t");
                        System.out.print("\u000C");
                        System.out.println("The account number you entered is incorrect. Please re-enter it.");
                        Cred1();}
                }
                System.out.print("\t\t\t");
                System.out.println("Please enter your card verification value");
                System.out.print("\t\t\t");
                try{cvv=Integer.parseInt(obj.readLine());}catch(Exception t)
                {
                    System.out.println("\t\t\tONLY NUMBERS\nTRY AGAIN");
                    cvv=Integer.parseInt(obj.readLine());
                }
                int length1= (int) Math.log10(cvv) + 1;
                for(int i=0;i==0;i++)
                {
                    if(i==0)
                    {
                        if(length1==4)
                    {
                        System.out.print("\t\t\t");
                        System.out.println("The card verification value you entered is correct.");
                        System.out.print("\t\t\t");
                        Thread.sleep(500);break;
                    }
                    else
                    {
                        System.out.print("\t\t\t");
                        System.out.println("The account number you entered is incorrect. Please re-enter all the details.");
                        Cred1();
                    }
                }
                }
                }
            static void Cred1()throws Exception
            {Cred();}
            static void Debit()throws Exception
            {
                System.out.print("\t\t\t");
                System.out.println("Please enter your debit card number");
                System.out.print("\t\t\t");
                        try{ccn=Long.parseLong(obj.readLine());}catch(Exception t)
                        {
                            System.out.println("\t\t\tONLY NUMBERS\nTRY AGAIN");
                            ccn=Long.parseLong(obj.readLine());
                        }
                int length2 = (int) Math.log10(ccn) + 1;
                 {  if(length2==16)
                    {
                        System.out.print("\t\t\t");
                        System.out.println("The debit card number you entered is correct.");
                    }
                    else
                    {
                            System.out.print("\t\t\t");
                            System.out.println("The account number you entered is incorrect. Please re-enter it.");
                            System.out.print("\t\t\t");Debit1();}
                }
                System.out.print("\t\t\t");
                System.out.println("Please enter your card verification value");
                System.out.print("\t\t\t");
                try{cvv=Integer.parseInt(obj.readLine());}catch(Exception t)
                {
                    System.out.println("\t\t\tONLY NUMBERS\nTRY AGAIN");
                    cvv=Integer.parseInt(obj.readLine());
            }
            int length3 = (int) Math.log10(cvv) + 1;
           {   if(length3==4)
           {
               System.out.print("\t\t\t");
               System.out.println("The card verification value you entered is correct.");
               System.out.print("\t\t\t");
           }
           else
           {System.out.print("\t\t\t");
               System.out.println("The card verification value you entered is incorrect. Please re-enter all the details.");
               System.out.print("\t\t\t");
            Debit1();}
     }
    }
            static void Debit1()throws Exception
    {Debit();}
        static void InT()throws Exception
       {
        System.out.print("\t\t\t");
        System.out.println("Please enter your account number.");
       System.out.print("\t\t\t");
       try{accno=Long.parseLong(obj.readLine());}
       catch(Exception t)
       {System.out.println("\t\t\tONLY NUMBERS\nTRY AGAIN");
           accno=Long.parseLong(obj.readLine());}
       int length4 = (int) Math.log10(accno) + 1;
       {       if(length4==14)
       {
           System.out.print("\t\t\t");
           System.out.println("The account number you entered is correct.");
       }
       else
       {
           System.out.print("\t\t\t");
           System.out.println("\t\t\tThe account number you entered is incorrect.\n Please re-enter it.");
           InT1();
      }
        for(int p=0;p==0;p++)
        {
            System.out.print("\t\t\t");
            System.out.println("Please enter your password");
            System.out.print("\t\t\t");
            pw=obj.readLine();
            Thread.sleep(500);
        }
    }
    }
            static void InT1()throws Exception
    {InT();}
    static void Time()throws Exception
    {
      Calendar cal = Calendar.getInstance();   
      Date today = cal.getTime();
      System.out.print(today);
    }
}