package Computer;
import java.io.*; 
class Account
{
    static String NAME[]=new String[2];
    static String ID[]=new String[1];
    static int date,month,year,Pincode;
    static String password;
    static String Location[]=new String[3];
    static char ch;
    static double pass;
    public static void Account_creation()throws Exception
    {
        System.out.print("\u000C");
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the following details in order to create your account to\n\t log into our website so as to reserve tickets,book hotels,etc.\n");
              System.out.print("FIRST NAME :");
              try
                {
                   NAME[0]=b.readLine();
                }
                   catch(Exception t)
                {
                       System.out.println("First Name Only No Integers");
                       NAME[0]=b.readLine();
                }// must have atleast 2 characters without any whitespace.
              First_Name_Checker1();
              System.out.print("LAST NAME  :");
              try
                {
                   NAME[1]=b.readLine();
                }
              catch(Exception t)
              {
                  System.out.println("Last Name Only No Integers");
                  NAME[1]=b.readLine();
              }
              Last_Name_Checker1();
              System.out.println();
        System.out.print("BIRTH-  DATE   :");
        try
        {
        date=Integer.parseInt(b.readLine());
        }catch(Exception t){System.out.println("1-31 only- ");date=Integer.parseInt(b.readLine());}
        Date_Checker();
        System.out.print("\tMONTH  :");
        try
        {
        month=Integer.parseInt(b.readLine());
        }catch(Exception t){System.out.println("1-12 only- ");month=Integer.parseInt(b.readLine());}
        Month_Checker();
        System.out.print("\tYear   :");
        try
        {
            year=Integer.parseInt(b.readLine());
        }catch(Exception t){System.out.println("Only Integers- ");year=Integer.parseInt(b.readLine());}
            Year_Checker();
        System.out.println();
        System.out.print("Email ID : ");// format of an email
        ID[0]=b.readLine();
        email();
        Password();
        System.out.print("\u000C");
        for(int i=0;i<2;i++)
        {
            if(i==0)
            {
                System.out.print("CITY :");
                try
                {
                    Location[i]=b.readLine();}catch(Exception t){System.out.println("City Name Only No Integers");
                    Location[i]=b.readLine();
                }C_Checker();
            }
            else if(i==1)
            {
                System.out.print("STATE :");
                try
                {
                    Location[i]=b.readLine();}catch(Exception t){System.out.println("Country Name Only No Integers");}
                  C_Checker3();
                System.out.println();
            }
        }
        System.out.print("Pincode :");
        try{Pincode=Integer.parseInt(b.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");Pincode=Integer.parseInt(b.readLine());}
        Pin_Check();
        System.out.println();
        Details();
    }
    public static void First_Name_Checker1()throws Exception
    {
        InputStreamReader b=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(b);int i;
        for(i=0;i<NAME[0].length();i++)
        {ch=NAME[0].charAt(i);
        if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
        {
                if(NAME[0].length()>=3)
                {}
                else
                {   System.out.println("TYPE A NAME OF AT LEAST 3 LETTERS- ");
                    NAME[0]=br.readLine();break;
                }
                for(int j=0;j<NAME[0].length();j++)
                {
                    ch=NAME[0].charAt(j);
                    if(ch!=' '){}
                    else
                    {  
                        System.out.println("There should be no whitespace in between.\nPlease re-enter it.");
                        NAME[0]=br.readLine();Name_Checker();break;
                    }
                }
        }
        else
        {
            System.out.println("\tInvalid.\n\tTry Again");NAME[0]=br.readLine();Name_Checker();break;}
      }
    }
    public static void Name_Checker()throws Exception
    {First_Name_Checker1();}
    public static void Last_Name_Checker1()throws Exception
    {
        InputStreamReader b=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(b);
        String count=NAME[1];
        int l=count.length(),i;
        for(i=0;i<NAME[1].length();i++)
        {ch=NAME[1].charAt(i);continue;}
        if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
        {}
        else
        {   System.out.println("\tInvalid\n\tTry Again");
            NAME[1]=br.readLine();
            Name_Checker1();
        }
                for(int j=0;j<NAME[1].length();j++)
                {
                    ch=NAME[1].charAt(j);
                    if(ch!=' '){}
                    else
                    {  
                        System.out.println("There should be no whitespace in between.\nPlease re-enter it.");
                        NAME[1]=br.readLine();break;
                    }
                }
    }
    public static void Name_Checker1()throws Exception
    {Last_Name_Checker1();}
    public static void Date_Checker()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            for(int i=1;;i++)
            {
                if(date>=1 && date<=31){break;}
                else
                {   System.out.println("Date is incorrect(only 1-31).\nPlease re-enter it.\n\t");
                    date=Integer.parseInt(br.readLine());
                }
            }
        }
   public static void Month_Checker()throws Exception
   {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(month>=1 && month<=12)
            {
            }
            else
            {
                System.out.println("Month is incorrect(1-12 only).\nPlease re-enter it.");
                month=Integer.parseInt(br.readLine());
                MonthCheck2();
            }
   }
   static void MonthCheck2()throws Exception
   {
       Month_Checker();
   }
   public static void Year_Checker()throws Exception
   {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int y=year;
        int a=0;
        int count=0;
        while(y>0)
        {
            a=y%10;
            y=y/10;
            count++;
        }
        if(count==4)
        {
           if(year<=1900)
            {  System.out.println("Year should be more than 1900 only.\nPlease re-enter it.");
               year=Integer.parseInt(br.readLine());
               YearCheck2();
            }
            else if(year>=2006)
            {
                System.out.println("Only below 10 years .\nPlease enter again.");
                year=Integer.parseInt(br.readLine());
                YearCheck2();
           }
        }
        if(count!=4)
        {
            System.out.println("Year is incorrect.\nPlease re-enter it.");
               year=Integer.parseInt(br.readLine());
               YearCheck2();
        }
   }
   static void YearCheck2()throws Exception
   {
       Year_Checker();
   }
   public static void email()throws Exception
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s=ID[0];
       int l=s.length();
       int b=0;
       String a="@gmail.";
       String y="@yahoo.";
       String k="@hotmail.";
       String x="@rediff.";
       String s1="";
       char n='@';
       char p=' ';
       for(int i=0;i<=l-1;i++)
        {
            char ch=s.charAt(i);
            if(ch=='@')
            {
              b=i;ch=p;
              continue;
            }
        }
       for(int i=b;i<l;i++)
        {   
            char c=s.charAt(i);
            if(c!='.')
              s1=s1+c;
            else
            {  s1=s1+c;
              break;
            }
        }
       if(s1.equals(a))
                {
                   System.out.println("Checking.....");
                   Thread.sleep(1000);
                   System.out.println("Valid");
                   s1="";
                }
                else if(s1.equals(y))
                {
                    System.out.println("Checking.....");
                   Thread.sleep(1000);
                   System.out.println("Valid");
                   s1="";
                }
                else if(s1.equals(k))
                {
                    System.out.println("Checking.....");
                   Thread.sleep(1000);
                   System.out.println("Valid");
                   s1="";
                }
                else if(s1.equals(x))
                {
                    System.out.println("Checking.....");
                   Thread.sleep(1000);
                   System.out.println("Valid");
                   s1="";
                }
                else
               {
                 System.out.println("The Email-ID that you have entered above is invalid.");
                 System.out.println("Please try another Email-ID.");
                 ID[0]=br.readLine();
                 EmailCheck2();
                 System.out.println();
               }
   }
   static void EmailCheck2()throws Exception
   {
       email();
    }
    public static void Pin_Check()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int pin=Pincode;
        int b=0;int y=Pincode;int count=0;
        while(y>0)
        {
            b=y%10;
            y=y/10;
            count++;
        }
        if(count!=6)
        {
            System.out.println("Pincode is incorrect.\nPlease re-enter it.");
            Pincode=Integer.parseInt(br.readLine());Pin();}
    }
    static void Pin()throws Exception
    {Pin_Check();}
    public static void Password()throws Exception
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        pass=Math.random()*(11235-22513)+34556;
        password="MMR123671A"+(int)pass;
        for(int i=20;i>=1;i--)
        {
        System.out.print("\u000C");
        System.out.print("PLEASE COPY IT DOWN SOMEWHERE..");
        System.out.print("Password : ");
        System.out.println(password);
        System.out.println("\n");
        System.out.println("This Will Vanish In "+i+" seconds");Thread.sleep(1000);
        }
    }
    public static void C_Checker()throws Exception
    {
        InputStreamReader b=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(b);
        int i;char ch=' ';
        for(i=0;i<Location[0].length();i++){ch=Location[0].charAt(i);continue;}
        if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
        {}
        else{System.out.println("\tInvalid\n\tTry Again");Location[0]=br.readLine();C_Checker1();}
    }
    public static void C_Checker1()throws Exception
    {C_Checker();}
    public static void C_Checker2()throws Exception
    {
        InputStreamReader b=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(b);
        int i;char ch=' ';
        for(i=0;i<Location[1].length();i++){ch=Location[1].charAt(i);continue;}
        if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
        {}
        else{System.out.println("\tInvalid\n\tTry Again");Location[1]=br.readLine();C_Checker3();}
    }
    public static void C_Checker3()throws Exception
    {C_Checker2();}
    static void Details()throws Exception
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        String PASSWORD;
        String s[]=new String[3];
        String ID="";
        String name="",name2="";
        for(int i=0;i<3;i++)
        {
            if(i==0 || i==1)
          {  name=NAME[0];
             name2=NAME[1];
          }
          s[i]=Location[i];
          ID=Account.ID[0];
        }
          int d,m,y=0;
          d=date;
          m=month;
          y=year;
          System.out.print("\u000C");
        System.out.println("\tYour account has been created in our website\n\tThese are the details given by you.");
        System.out.println("\t\tYour Details");
        for(int i=1;i<=150;i++)
        {
            System.out.print("_");
        }
        System.out.println();
        for(int i=1;i<=150;i++)
        {
            System.out.print("=");
        }
        System.out.println();
        for(int i=1;i<2;i++)
         System.out.println();
         System.out.println();
         System.out.println("\t\tFirst Name         | "+name.toUpperCase());
         System.out.println("\t\tLast Name          | "+name2.toUpperCase());
         System.out.println("\t\tEmail - ID         | "+ID);
         System.out.println("\t\tCity               | "+s[0].toUpperCase());
         System.out.println("\t\tState              | "+s[1].toUpperCase());
         System.out.println("\t\tPincode            | "+Pincode);
         System.out.println("\t\t        Birth  Date| "+d);
         System.out.println("\t\t        Birth Month| "+m);
         System.out.println("\t\t        Birth  Year| "+y);
        for(int i=1;i<=150;i++)
        {
            System.out.print("_");
        }
        System.out.println();
         System.out.println("Weren't able to copy down the password?\nNo problem then..press PASSWORD to show you password again");
         System.out.println("Else type y");
         PASSWORD=obj.readLine();
         if(PASSWORD.equalsIgnoreCase("password"))
         {
             Account.Password();
             System.out.print("\u000C");
            Login.Intro();
        }
        else if(PASSWORD.equalsIgnoreCase("y"))
             {
             System.out.print("\u000C");
             Login.Intro();
            }
    }
}