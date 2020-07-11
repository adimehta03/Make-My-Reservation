package Computer;
import java.io.*;
class No_Days
{
    static int count_d,count_m,count; 
    static void day()throws Exception
    {
        int a,b,c,d;
        if((Shimla.ch[0]==6)||(Manali.ch[0]==6)||(Udaipur.ch[0]==6)||(Kanyakumari.ch[0]==6)||(Varanasi.ch[0]==6)||(Darjeeling.ch[0]==6)||(Hyderabad.ch[0]==6)||(Ooty.ch[0]==6)
         ||(Shimla.ch[0]==7)||(Manali.ch[0]==7)||(Udaipur.ch[0]==7)||(Kanyakumari.ch[0]==7)||(Varanasi.ch[0]==7)||(Darjeeling.ch[0]==7)||(Hyderabad.ch[0]==7)||(Ooty.ch[0]==7))
        {
           a=DD_RD.date[0];
           b=DD_RD.rdate[0];
           c=DD_RD.date[1];
           d=DD_RD.rdate[1];
           if(a==b)
           {
               if(c>d)
               {count_m=c-d;}
               else if(c<d)
               {count_m=d-c;}
            }
           else if(a>b)
           {
               count_d=a-b;
               if(c>d)
               {count_m=c-d;}
               else if(c<d)
               {count_m=d-c;}
           }
           else
           {
               count_d=b-a;
               if(c>d)
               {count_m=c-d;}
               else if(c<d)
               {count_m=d-c;}
           }
        }
        System.out.println("You are staying here for "+count_d+" days and "+count_m+" months");
        count=count_d+(count_m*30);
        System.out.println("If we consider a month has 30 days then, you are staying here for around "+count+" days");
    }
}