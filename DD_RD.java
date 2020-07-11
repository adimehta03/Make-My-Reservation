package Computer;
import java.io.*;
public class DD_RD
{
    static int rdate[]=new int[3];
    static int date[]=new int[3];
    static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    static int i;
    static void DepartureDate()throws Exception
    {
        int cont;
         System.out.println("Please enter the date you would like to go and coming back date(format-dd/mm/yyyy)");
            try{date[0]=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");date[0]=Integer.parseInt(obj.readLine());}
            try{date[1]=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");date[1]=Integer.parseInt(obj.readLine());}
            try{date[2]=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");date[2]=Integer.parseInt(obj.readLine());}
            System.out.print("\u000C");
            Date_Checker();
            System.out.print(date[0]+"/"+date[1]+"/"+date[2]);
            System.out.println();
            System.out.println("Returning date-");
            try{rdate[0]=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");rdate[0]=Integer.parseInt(obj.readLine());}
            try{rdate[1]=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");rdate[1]=Integer.parseInt(obj.readLine());}
            try{rdate[2]=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");rdate[2]=Integer.parseInt(obj.readLine());}
            System.out.print(rdate[0]+"/"+rdate[1]+"/"+rdate[2]);
            System.out.print("\u000C");
            RDate_Checker();
            Date_Checker1();
            System.out.print("\u000C");
            Calender.DCALENDER();
            Calender.RCALENDER();
    }
    static void Date_Checker()throws Exception
    {
        for(i=1;;i++)
        {
         if(date[0]>=1 && date[0]<=31)
        {break;}
        else
        {
            System.out.println("Date is incorrect.");
            System.out.println("Please re-enter it.");
            try{date[0]=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");date[0]=Integer.parseInt(obj.readLine());}
            continue;
        }
        }
        for(i=1;;i++)
        {
        if(date[1]>=1 && date[1]<=7)
            {
                break;
            }
            else
            {System.out.println("Month is incorrect.\nPlease re-enter it.");
             try{date[1]=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");date[1]=Integer.parseInt(obj.readLine());}}
             continue;
            }
             for(i=1;;i++)
        {
             if(date[2]==2017)
             {
                 break;
             }
             else
             {
                 System.out.println("Year is incorrect.\nPlease re-enter it.");
                 try
                 {date[2]=Integer.parseInt(obj.readLine());}
                 catch(Exception t)
                 {
                     System.out.println("INVALID\nTRY AGAIN");date[2]=Integer.parseInt(obj.readLine());
                 }
                 continue;
             }
        }
    }
    static void RDate_Checker()throws Exception
        {
         if(rdate[0]>=1 && rdate[0]<=31)
        {}
        else
        {
            System.out.println("Returning Date is incorrect.");
            System.out.println("Please re-enter it.");
            try{rdate[0]=Integer.parseInt(obj.readLine());}
            catch(Exception t)
            {
                System.out.println("INVALID\nTRY AGAIN");
                rdate[0]=Integer.parseInt(obj.readLine());
            }
            RDate_Checker();
        }
        if(date[1]<=rdate[1])
        {
            if(rdate[1]>=1 && rdate[1]<=7)
            {
            }
            else
            {
              System.out.println("Returning Month is incorrect.\nPlease re-enter it.");
             try{rdate[1]=Integer.parseInt(obj.readLine());}
             catch(Exception t)
             {
                 System.out.println("INVALID\nTRY AGAIN");
                 rdate[1]=Integer.parseInt(obj.readLine());
             }RDate_Checker();
            }
        }
        else
        {
              System.out.println("Returning Month is incorrect.\nPlease re-enter it.");
             try{rdate[1]=Integer.parseInt(obj.readLine());}
             catch(Exception t)
             {
                 System.out.println("INVALID\nTRY AGAIN");
                 rdate[1]=Integer.parseInt(obj.readLine());
             }RDate_Checker();
        }
            if(rdate[2]==2017)
            {
            }
            else
            {
                 System.out.println("Year is incorrect.\nPlease re-enter it.");
                 try
                 {rdate[2]=Integer.parseInt(obj.readLine());}
                 catch(Exception t)
                 {
                     System.out.println("INVALID\nTRY AGAIN");rdate[2]=Integer.parseInt(obj.readLine());
                 }
                 RDate_Checker();
            }
        if(date[1]==rdate[1])
        {
            if(date[0]>rdate[0])
            {
                System.out.println("DATE INVALID");
                DepartureDate();
            }
        }
    }
    static void Date_Checker1()throws Exception
    {
        if((date[0]==rdate[0])&&(date[1]==rdate[1])&&date[2]==rdate[2])
        {
            System.out.println("Dates Cannot Be Same.\nUse The Same Format And Same Ordateer And Type Again(dd/mm/yy)");
            DepartureDate();
        }
    }
}