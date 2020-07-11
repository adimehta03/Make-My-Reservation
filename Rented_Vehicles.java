package Computer;
import java.io.*;
public class Rented_Vehicles
{
    static int travelers,another,travelersp,no,rent,day,fare=50,dfare=70,check,bill=0,numberofv;
    static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
   static void RentedV()throws Exception
   {
             System.out.print("\u000C");
            System.out.print("\t\tRENTED VEHICLES\t");
            No_Days.day();
            System.out.println("SO KINDLY THINK AND TYPE THE NUMBER OF DAYS");
            Thread.sleep(1000);
            System.out.println("\n\nHow many days do you want it for?");
            try{day=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");day=Integer.parseInt(obj.readLine());}
            if(day>No_Days.count)
            {   RentedV();
                System.out.println("You cannot rent a vehicle more than the days you are staying.\nSo please re-enter it.");
                try{day=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");day=Integer.parseInt(obj.readLine());}
            }
            System.out.println("Enter the number of travelers-");
            try{travelers=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");travelers=Integer.parseInt(obj.readLine());}
            if(travelers==0)
                {
                    System.out.println("YOU HAVE ENTERED 0 travelers which means you cannot travel.\nIf you wish to change press 1");
                    try
                    {
                        travelersp=Integer.parseInt(obj.readLine());}
                    
                    catch(Exception t)
                    {
                        System.out.println("TRY AGAIN");
                        travelersp=Integer.parseInt(obj.readLine());
                    }
                    if(travelersp==1)
                    {RentedV();}
                    else
                    {
                        System.out.println("TRY AGAIN");
                        try{travelersp=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");travelersp=Integer.parseInt(obj.readLine());}
                   }
                }
            else if(travelers>=1)
            {
            System.out.println("You have to pay for the fuel charges");
            System.out.println("To rent a car type 1.\nTo rent a two-wheeler type 2");
            try{rent=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");rent=Integer.parseInt(obj.readLine());}
                if(rent==1)
                {rcar();}
                else if(rent==2)
                {rtwowheeler();}
                    Thread.sleep(1000);
                    if(Shimla.ch[0]==7||Manali.ch[0]==7||Varanasi.ch[0]==7||Udaipur.ch[0]==7||Ooty.ch[0]==7||Darjeeling.ch[0]==7||Kanyakumari.ch[0]==7||Hyderabad.ch[0]==7)
                    {}
                    else
                    {
                    System.out.println("Press 1 to return back to the homepage.");
                    System.out.println("Press 2 to rent this vehicle.");
                    System.out.println("Press 3 to return back to the homepage of this place.");
                    try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
                if(no==1){System.out.print("\u000C");MakeMyReservation.intr();}
                if(no==2){System.out.print("\u000C");BILL.bill();paymentmethod.pay();}
                if(no==3)
                {
                    if(Shimla.ch[0]==6)
                    {Shimla.shim();}
                    else if(Manali.ch[0]==6)
                    {Manali.mana();}
                    else if(Shimla.ch[0]==6)
                    {Varanasi.vara();}
                    else if(Hyderabad.ch[0]==6)
                    {Hyderabad.hyde();}
                    else if(Udaipur.ch[0]==6)
                    {Udaipur.udai();}
                    else if(Kanyakumari.ch[0]==6)
                    {Kanyakumari.kany();}
                    else if(Ooty.ch[0]==6)
                    {Ooty.oot();}
                    else if(Darjeeling.ch[0]==6)
                    {Darjeeling.darj();}
                }
                }}
   }
   public static void rcar()throws Exception
   {
       System.out.print("\u000C");
       numberofv++;
       System.out.println("Press 1 to rent a car which has a driver...\nPress 2 to rent a car which has to be self-driven");
       try{check=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");check=Integer.parseInt(obj.readLine());}
       if(check==1)
       {
          double driver=Math.ceil(Math.random())*100;
          if(driver<2.0)
          {System.out.println("Driver Name-Krishna Prasad.\n\tCar-White Swift");}
          else{System.out.println("Driver Name-Ram Prasad.\n\tCar-White Ritz");}
       {System.out.println("You have to pay " +(fare*dfare)+ " per day.");} 
       bill=(fare*dfare*day);
       {System.out.println("Since you have chose a car with a driver for "+day+" days it will cost you "+bill);} 
       }
      if(check==2)
       {{System.out.println("You have to pay " +(fare*1)+ " per day.");}  
       bill=day*fare;
       System.out.println("Since you have rented it for "+day+" days it will cost you "+bill);}
       if(travelers>4)
       {
           System.out.println("We recommend you to rent more cars.");
           System.out.println("To rent another car press 1...else press any number..");
           try{another=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");another=Integer.parseInt(obj.readLine());}
           if(another==1)
           {rcar();}
           else{}
        }
    }
       public static void rtwowheeler()throws Exception
   {
       System.out.print("\u000C");
       int fare=25;
       numberofv++;
       System.out.println("Show your driving licence when you are taking the two-wheeler. ");
       System.out.println("You have to pay " +fare+ " per day.");
       bill=(fare*day);
       System.out.println("Since you want a two wheeler for "+day+" days it will cost you "+bill);
       if(travelers>2)
       {
           System.out.println("We recommend you to rent more two-wheelers.");
           System.out.println("To rent another car press 1...else press any number..");
           try{another=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");another=Integer.parseInt(obj.readLine());}
           if(another==1)
           {rtwowheeler();}
           else{}
       }
   }
}