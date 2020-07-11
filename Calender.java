package Computer;
import java.io.*;
class Calender
{
    static int i;
    static void Jan()throws Exception
    {
        System.out.println("\t\t\t\tJanuary 2017");
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        for(i=1;i<=7;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=8;i<=14;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=15;i<=21;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=22;i<=28;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=29;i<=31;i++)
        {System.out.print(i+"\t");}
        System.out.println();
    }
    static void Feb()throws Exception
    {
        System.out.println("\t\t\t\tFebruary 2017");
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        System.out.print("\t\t\t");
        for(i=1;i<=4;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=5;i<=11;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=12;i<=18;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=19;i<=25;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=26;i<=28;i++)
        {System.out.print(i+"\t");}
        System.out.println();
    }
    static void Mar()throws Exception
    {
        System.out.println("\t\t\t\tMarch 2017");
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        System.out.print("\t\t\t");
        for(i=1;i<=4;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=5;i<=11;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=12;i<=18;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=19;i<=25;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=26;i<=31;i++)
        {System.out.print(i+"\t");}
        System.out.println();
    }
    static void Apr()throws Exception
    {
        System.out.println("\t\t\t\tApril 2017");
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        System.out.print("\t\t\t\t\t\t");
        for(i=1;i<=1;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=2;i<=8;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=9;i<=15;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=16;i<=22;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=23;i<=29;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        System.out.print("30");
    }
    static void May()throws Exception
    {
        System.out.println("\t\t\t\tMay 2017");
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        System.out.print("\t");
        for(i=1;i<=6;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=7;i<=13;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=14;i<=20;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=21;i<=27;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=28;i<=31;i++)
        {System.out.print(i+"\t");}
        System.out.println();
    }
    static void  June()throws Exception
    {
        System.out.println("\t\t\t\tJune 2017");
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        System.out.print("\t\t\t\t");
        for(i=1;i<=3;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=4;i<=10;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=11;i<=17;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=18;i<=24;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=25;i<=30;i++)
        {System.out.print(i+"\t");}
        System.out.println();
    }
    static void July()throws Exception
    {
        System.out.println("\t\t\t\tJuly 2017");
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        System.out.print("\t\t\t\t\t\t");
        for(i=1;i<=1;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=2;i<=8;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=9;i<=15;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=16;i<=22;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=23;i<=29;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        for(i=30;i<=31;i++)
        {System.out.print(i+"\t");}
        System.out.println();
        
    }
    static void DCALENDER()throws Exception
    {
        System.out.println("\u000C");
        if(DD_RD.date[1]==1)
        {Jan();}
        else if(DD_RD.date[1]==2)
        {Feb();}
        else if(DD_RD.date[1]==3)
        {Mar();}
        else if(DD_RD.date[1]==4)
        {Apr();}
        else if(DD_RD.date[1]==5)
        {May();}
        else if(DD_RD.date[1]==6)
        {June();}
        else if(DD_RD.date[1]==7)
        {July();}
        else
        {System.out.println("Facilities are available only upto June 2017");System.out.print("\u000C");}
    }
    static void RCALENDER()throws Exception
    {
        if(DD_RD.date[1]==DD_RD.rdate[1])
        {}
        else if(DD_RD.rdate[1]==1)
        {Jan();}
        else if(DD_RD.rdate[1]==2)
        {Feb();}
        else if(DD_RD.rdate[1]==3)
        {Mar();}
        else if(DD_RD.rdate[1]==4)
        {Apr();}
        else if(DD_RD.rdate[1]==5)
        {May();}
        else if(DD_RD.rdate[1]==6)
        {June();}
        else if(DD_RD.rdate[1]==7)
        {July();}
        else
        {System.out.println("Facilities are available only upto June 2017");System.out.print("\u000C");}
      }
    }