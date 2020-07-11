package Computer;
import java.io.*;
public class MakeMyReservation
{
    static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    static double bill=0,yes;static String place;
    static int travelers,rooms;
    static void intro()throws Exception
    {
        System.out.println("\n\tAs the name suggests you this is a website which enables you to book tickets, reserve hotels,\n\t provides holiday packages,etc..");
        System.out.println("\tThis can be used anywhere and everywhere..");
        System.out.println("\tWe provide the cheapest prices.");
        System.out.println("\tReserve tickets in a blink of an eye");
        System.out.println("\tPlease download our free app-MakeMyReservation ");
        System.out.println("\tAvailable on AppStore and PlayStor only");
        System.out.println("\t\t\tHOPE YOU LIKE US");
        System.out.println("\nThis is our Tagline-");
    }
    public static void MAIN()throws Exception
    {   
        String a;int i;
        DesignClass.MMR();
        Thread.sleep(1000);
        DesignClass.pckge();
        intro();
        Thread.sleep(5000);
        Tagline_Credits.Tagline();
        Thread.sleep(10000);
        System.out.println("Press done to open.");
        try{a=obj.readLine();}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");a=obj.readLine();}
        for(i=0;i<1;i++){
        if(a.equalsIgnoreCase("done")){continue;}
        else{System.out.println("Try Again");try{a=obj.readLine();}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");a=obj.readLine();}}}
        System.out.print("\u000C");
        DesignClass.MMR();
        System.out.print("\n\n\n\t\t\t");
        System.out.print("1.Create New Account\n\t\t\t");
        System.out.print("2.Login\t\t\t\n\t\t\t");
        int go;
        try{go=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.print("\t\t\t1 and 2 only\n\t\t\tTRY AGAIN\n\t\t\t");go=Integer.parseInt(obj.readLine());}
        if(go==1)
        {Account.Account_creation();}
        else if(go==2)
        {Login.Intro();
        System.out.print("\u000C");
        Account.Details();
        System.out.print("\u000C");
        Login.Intro();
        intr();}
        else
        {
            for(i=0;;i++)
            {
                System.out.println("\t\t\tTRY Again"); 
                try{go=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.print("\t\t\t1 and 2 only\n\t\t\tTRY AGAIN\n\t\t\t");go=Integer.parseInt(obj.readLine());}
                if(go==1)
                {Account.Account_creation();break;}
                else if(go==2)
                {
                        Login.Intro();
                        System.out.print("\u000C");
                        Account.Details();
                        System.out.print("\u000C");
                        Login.Intro();
                        intr();
                        break;
                }
                else
                {continue;}
            }
        }
    }
    public static void intr()throws Exception
    {
        System.out.print("\u000C");
        System.out.println("\t\tHELLO "+Account.NAME[0]);
        System.out.println("Already reached your destination? Waiting for a taxi?\nIf yes press 1..");
        System.out.println("Yet to book, buy or reserve tickets? Then press 2...");
        try{yes=Integer.parseInt(obj.readLine());}
        catch(Exception a)
        {System.out.println("ONLY NUMBERS\nTRY AGAIN");yes=Integer.parseInt(obj.readLine());}
        if(yes==1)
        {TaxiBook.TAXI();}
        else if(yes==2)
        {System.out.print("\u000C");
        DesignClass.load();
        int l,i;char ch;
        String s[]={"","Shimla","Manali","Udaipur","Varanasi","Hyderabad","Ooty","Kanyakumari","Darjeeling"};
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String home="HOMEPAGE";
        int l2=home.length();
        System.out.print("\t\t             ");
        for(i=0;i<l2;i++)
         {
             ch=home.charAt(i);
             for(int j=0;j<1;j++)
             {
                 System.out.print(ch);
                 Thread.sleep(100);
                }
        }
        Thread.sleep(500);
      System.out.println("\nThese are the places for which you can reserve tickets\n and book hotels too ^_^");
      System.out.println("To go through the journey of reserving and booking your requirments\n type the name of the place in the list and it will show you the\n details");
      System.out.println("NOTE:TICKETS ARE AVAILABLE ONLY FROM JANUARY 2017");
      Thread.sleep(1000);
      for(int k=1;k<=500;k++)
      {System.out.print("_");}
          for(i=0;i<9;i++)
          {
          System.out.println(i+")"+s[i]);
          }
        Thread.sleep(1000);
      System.out.println("Please enter the place you would like to go to.");
      try{place=br.readLine();}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");place=obj.readLine();}
      System.out.print("\u000C");
      DesignClass.Loading();
      if(place.equalsIgnoreCase(s[1])||place.equalsIgnoreCase("1"))
      {
          System.out.print("\u000C");
          DesignClass.Loading();
          Shimla.shimla();}
      else if(place.equalsIgnoreCase(s[2])||place.equalsIgnoreCase("2"))
      {
           System.out.print("\u000C");
           DesignClass.Loading();
           Manali.Manali();}
      else if(place.equalsIgnoreCase(s[3])||place.equalsIgnoreCase("3"))
      {
           System.out.print("\u000C");
           DesignClass.Loading();
           Udaipur.udaipur();}
      else if(place.equalsIgnoreCase(s[4])||place.equalsIgnoreCase("4"))
      {
           System.out.print("\u000C");           
           DesignClass.Loading();
           Varanasi.Varanasi();}
      else if(place.equalsIgnoreCase(s[5])||place.equalsIgnoreCase("5"))
      {
           System.out.print("\u000C");
           DesignClass.Loading(); 
           Hyderabad.hyderabad();
        }
      else if(place.equalsIgnoreCase(s[6])||place.equalsIgnoreCase("6"))
      {
           System.out.print("\u000C");
           DesignClass.Loading();    
           Ooty.ooty();
      }
      else if(place.equalsIgnoreCase(s[6])||place.equalsIgnoreCase("7"))
      {
           System.out.print("\u000C");
           DesignClass.Loading();    
           Kanyakumari.Kanyakumari();
      }
      else if(place.equalsIgnoreCase(s[6])||place.equalsIgnoreCase("8"))
      {
           System.out.print("\u000C");
           DesignClass.Loading();    
           Darjeeling.Darjeeling();
      }
      else
      {
          System.out.println("Looks like you have typed it wrong.So try again");Thread.sleep(5000);
          intr();
      }
    }
    else
    {
        System.out.println("ONLY 1 and 2");
        try{yes=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");}
        System.out.print("\u000C");
        intr();
    }
}
}