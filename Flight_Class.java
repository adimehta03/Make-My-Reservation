package Computer;
import java.io.*;
class Flight_Class
{
    static String a;static double i,bill=0;static int travelers;
    static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    static void Shimla()throws Exception
    {
        System.out.println("Choose either Economy or Business Class.");
        try{a=obj.readLine();}
        catch(Exception t)
        {System.out.println("INVALID\nTRY AGAIN");a=obj.readLine();}
        System.out.print("Please enter the number of travelers-");
        try{travelers=Integer.parseInt(obj.readLine());}
        catch(Exception t)
        {System.out.println("ONLY NUMBERS\nTRY AGAIN");travelers=Integer.parseInt(obj.readLine());}
        System.out.println();
        if(a.equalsIgnoreCase("Economy"))
        {
            if((Shimla.ch[0]==1)||(Shimla.ch[0]==3)||(Shimla.ch[0]==7))
            {
                i=(int)Math.ceil(Math.random()*10000+1000);
                System.out.println("Price of one person(double trip)-"+i+" .");
                bill=i*travelers*2;
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            else if((Shimla.ch[0]==2)||(Shimla.ch[0]==4))
            {
                i=Math.ceil(Math.random()*5000);
                System.out.println("Price of one person(Single Trip)-"+i);
                bill=i*travelers;
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else if(a.equalsIgnoreCase("Business"))
        {
            if((Shimla.ch[0]==1)||(Shimla.ch[0]==3)||(Shimla.ch[0]==7))
            {
                i=Math.ceil(Math.random()*13000);
                bill=i*travelers*2;
                System.out.println("Price of one person(Double Trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            if((Shimla.ch[0]==2)||(Shimla.ch[0]==4))
            {
                i=Math.ceil(Math.random()*6500);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else
        {System.out.println("It looks like you have entered something wrong\nTry Again.");Shimla();}
    }
    static void Manali()throws Exception
    {
        System.out.println("Choose either Economy or Business Class.");
        try{a=obj.readLine();}
        catch(Exception t)
        {System.out.println("INVALID\nTRY AGAIN");a=obj.readLine();}
        System.out.print("Please enter the number of travelers-");
        try{travelers=Integer.parseInt(obj.readLine());}
        catch(Exception t)
        {System.out.println("ONLY NUMBERS\nTRY AGAIN");travelers=Integer.parseInt(obj.readLine());}
        if(a.equalsIgnoreCase("Economy"))
        {
            if((Manali.ch[0]==1)||(Manali.ch[0]==3)||(Manali.ch[0]==7))
            {
                i=Math.ceil(Math.random()*12000);
                bill=i*travelers*2;
                System.out.println("Price of one person(Double Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            if((Manali.ch[0]==2)||(Manali.ch[0]==4))
            {
                i=Math.ceil(Math.random()*6000);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else    if(a.equalsIgnoreCase("Business"))
        {
            if((Manali.ch[0]==1)||(Manali.ch[0]==3)||(Manali.ch[0]==7))
            {
                i=Math.ceil(Math.random()*15500);
                System.out.println("Price of one person(Double Trip)-"+i);
                bill=i*travelers*2;
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            if((Manali.ch[0]==2)||(Manali.ch[0]==4))
            {
                i=Math.ceil(Math.random()*7250);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else
        {System.out.println("It looks like you have entered something wrong\nTry Again.");Manali();}
    }
    static void Hyderabad()throws Exception
    {
        System.out.println("Choose either Economy or Business Class.");
        try{a=obj.readLine();}
        catch(Exception t)
        {System.out.println("INVALID\nTRY AGAIN");a=obj.readLine();}
        System.out.print("Please enter the number of travelers-");
        try{travelers=Integer.parseInt(obj.readLine());}
        catch(Exception t)
        {System.out.println("ONLY NUMBERS\nTRY AGAIN");travelers=Integer.parseInt(obj.readLine());}
        if(a.equalsIgnoreCase("Economy"))
        {
            if((Hyderabad.ch[0]==1)||(Hyderabad.ch[0]==3)||(Hyderabad.ch[0]==7))
            {
                i=Math.ceil(Math.random()*12000);
                bill=i*travelers*2;
                System.out.println("Price of one person(Double Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            if((Hyderabad.ch[0]==2)||(Hyderabad.ch[0]==4))
            {
                i=Math.ceil(Math.random()*6000);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else    if(a.equalsIgnoreCase("Business"))
        {
            if((Hyderabad.ch[0]==1)||(Hyderabad.ch[0]==3)||(Hyderabad.ch[0]==7))
            {
                i=Math.ceil(Math.random()*15500);
                bill=i*travelers*2;
                System.out.println("Price of one person(Double Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            if((Hyderabad.ch[0]==2)||(Hyderabad.ch[0]==4))
            {
                i=Math.ceil(Math.random()*7250);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else
        {System.out.println("It looks like you have entered something wrong\nTry Again.");Hyderabad();}
    }
    static void Varanasi()throws Exception
    {
        System.out.println("Choose either Economy or Business Class.");
        try{a=obj.readLine();}
        catch(Exception t)
        {System.out.println("INVALID\nTRY AGAIN");a=obj.readLine();}
        System.out.print("Please enter the number of travelers-");
        try{travelers=Integer.parseInt(obj.readLine());}
        catch(Exception t)
        {System.out.println("ONLY NUMBERS\nTRY AGAIN");travelers=Integer.parseInt(obj.readLine());}
        System.out.println();
        if(a.equalsIgnoreCase("Economy"))
        {
            if((Varanasi.ch[0]==1)||(Varanasi.ch[0]==3)||(Varanasi.ch[0]==7))
            {
                i=(int)Math.ceil(Math.random()*10000+1000);
                bill=i*travelers*2;
                System.out.println("Price of one person(double trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            else if((Varanasi.ch[0]==2)||(Varanasi.ch[0]==4))
            {
                i=Math.ceil(Math.random()*5000);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else if(a.equalsIgnoreCase("Business"))
        {
            if((Varanasi.ch[0]==1)||(Varanasi.ch[0]==3)||(Varanasi.ch[0]==7))
            {
                i=Math.ceil(Math.random()*13000);
                bill=i*travelers*2;
                System.out.println("Price of one person(Double Trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            if((Varanasi.ch[0]==2)||(Varanasi.ch[0]==4))
            {
                i=Math.ceil(Math.random()*6500);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else
        {System.out.println("It looks like you have entered something wrong\nTry Again.");Varanasi();}
    }
    static void Udaipur()throws Exception
    {
        System.out.println("Choose either Economy or Business Class.");
        try{a=obj.readLine();}
        catch(Exception t)
        {System.out.println("INVALID\nTRY AGAIN");a=obj.readLine();}
        System.out.print("Please enter the number of travelers-");
        try{travelers=Integer.parseInt(obj.readLine());}
        catch(Exception t)
        {System.out.println("ONLY NUMBERS\nTRY AGAIN");travelers=Integer.parseInt(obj.readLine());}
        System.out.println();
        if(a.equalsIgnoreCase("Economy"))
        {
            if((Udaipur.ch[0]==1)||(Udaipur.ch[0]==3)||(Udaipur.ch[0]==7))
            {
                i=(int)Math.ceil(Math.random()*10000+1000);
                bill=i*travelers*2;
                System.out.println("Price of one person(double trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            else if((Udaipur.ch[0]==2)||(Udaipur.ch[0]==4))
            {
                i=Math.ceil(Math.random()*5300);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else if(a.equalsIgnoreCase("Business"))
        {
            if((Udaipur.ch[0]==1)||(Udaipur.ch[0]==3)||(Udaipur.ch[0]==7))
            {
                i=Math.ceil(Math.random()*12100);
                bill=i*travelers*2;
                System.out.println("Price of one person(Double Trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            if((Udaipur.ch[0]==2)||(Udaipur.ch[0]==4))
            {
                i=Math.ceil(Math.random()*7520);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else
        {System.out.println("It looks like you have entered something wrong\nTry Again.");Udaipur();}
    }
    static void ooty()throws Exception
    {
        System.out.println("Choose either Economy or Business Class.");
        try{a=obj.readLine();}
        catch(Exception t)
        {System.out.println("INVALID\nTRY AGAIN");a=obj.readLine();}
        System.out.print("Please enter the number of travelers-");
        try{travelers=Integer.parseInt(obj.readLine());}
        catch(Exception t)
        {System.out.println("ONLY NUMBERS\nTRY AGAIN");travelers=Integer.parseInt(obj.readLine());}
        System.out.println();
        if(a.equalsIgnoreCase("Economy"))
        {
            if((Ooty.ch[0]==1)||(Ooty.ch[0]==3)||(Ooty.ch[0]==7))
            {
                i=(int)Math.ceil(Math.random()*10000+1000);
                bill=i*travelers*2;
                System.out.println("Price of one person(double trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            else if((Ooty.ch[0]==2)||(Ooty.ch[0]==4))
            {
                i=Math.ceil(Math.random()*5000);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else if(a.equalsIgnoreCase("Business"))
        {
            if((Ooty.ch[0]==1)||(Ooty.ch[0]==3)||(Ooty.ch[0]==7))
            {
                i=Math.ceil(Math.random()*13050);
                bill=i*travelers*2;
                System.out.println("Price of one person(Double Trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            if((Ooty.ch[0]==2)||(Ooty.ch[0]==4))
            {
                i=Math.ceil(Math.random()*6550);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else
        {System.out.println("It looks like you have entered something wrong\nTry Again.");ooty();}
    }
    static void Kanyakumari()throws Exception
    {
        System.out.println("Choose either Economy or Business Class.");
        try{a=obj.readLine();}
        catch(Exception t)
        {System.out.println("INVALID\nTRY AGAIN");a=obj.readLine();}
        System.out.print("Please enter the number of travelers-");
        try{travelers=Integer.parseInt(obj.readLine());}
        catch(Exception t)
        {System.out.println("ONLY NUMBERS\nTRY AGAIN");travelers=Integer.parseInt(obj.readLine());}
        System.out.println();
        if(a.equalsIgnoreCase("Economy"))
        {
            if((Kanyakumari.ch[0]==1)||(Kanyakumari.ch[0]==3)||(Kanyakumari.ch[0]==7))
            {
                i=(int)Math.ceil(Math.random()*10000+1000);
                bill=i*travelers*2;
                System.out.println("Price of one person(double trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            else if((Kanyakumari.ch[0]==2)||(Kanyakumari.ch[0]==4))
            {
                i=Math.ceil(Math.random()*5000);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else if(a.equalsIgnoreCase("Business"))
        {
            if((Kanyakumari.ch[0]==1)||(Kanyakumari.ch[0]==3)||(Kanyakumari.ch[0]==7))
            {
                i=Math.ceil(Math.random()*11000);
                bill=i*travelers*2;
                System.out.println("Price of one person(Double Trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            if((Kanyakumari.ch[0]==2)||(Kanyakumari.ch[0]==4))
            {
                i=Math.ceil(Math.random()*8500);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else
        {System.out.println("It looks like you have entered something wrong\nTry Again.");Kanyakumari();}
    }
    static void Darjeeling()throws Exception
    {
        System.out.println("Choose either Economy or Business Class.");
        try{a=obj.readLine();}
        catch(Exception t)
        {System.out.println("INVALID\nTRY AGAIN");a=obj.readLine();}
        System.out.print("Please enter the number of travelers-");
        try{travelers=Integer.parseInt(obj.readLine());}
        catch(Exception t)
        {System.out.println("ONLY NUMBERS\nTRY AGAIN");travelers=Integer.parseInt(obj.readLine());}
        System.out.println();
        if(a.equalsIgnoreCase("Economy"))
        {
            if((Darjeeling.ch[0]==1)||(Darjeeling.ch[0]==3)||(Darjeeling.ch[0]==7))
            {
                i=(int)Math.ceil(Math.random()*10000+1000);
                bill=i*travelers*2;
                System.out.println("Price of one person(double trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            else if((Darjeeling.ch[0]==2)||(Darjeeling.ch[0]==4))
            {
                i=Math.ceil(Math.random()*5000);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else if(a.equalsIgnoreCase("Business"))
        {
            if((Darjeeling.ch[0]==1)||(Darjeeling.ch[0]==3)||(Darjeeling.ch[0]==7))
            {
                i=Math.ceil(Math.random()*13000);
                bill=i*travelers*2;
                System.out.println("Price of one person(Double Trip)-"+i+" .");
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
            if((Darjeeling.ch[0]==2)||(Darjeeling.ch[0]==4))
            {
                i=Math.ceil(Math.random()*6500);
                bill=i*travelers;
                System.out.println("Price of one person(Single Trip)-"+i);
                System.out.println("And as there are "+travelers+" it will cost you "+bill);
            }
        }
        else
        {System.out.println("It looks like you have entered something wrong\nTry Again.");Darjeeling();}
    }
}