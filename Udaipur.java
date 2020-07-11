package Computer;
import java.io.*;
public class Udaipur
{ 
        static int ch[]=new int[1];
        static String startingplace,xz;
        static int no,travelers,day,far,fare,d;
        static double t,cost=0;
        static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        static String a[]={"Bangalore","Vishakapatnam","Hyderabad","Chattisgarh","Mumbai","Chennai","Thiruvananthapuram","Kolkata","Ranchi","Raipur"};  
      public static void udaipur()throws Exception
    {
        Thread.sleep(70);
            System.out.print("\u000C");
            load();
            Thread.sleep(200);
            System.out.println("OUR FACILITIES ARE ONLY LIMITED TO THESE PLACES.\nWE ARE SORRY IF YOUR PLACE ISN'T INCLUDED.\nPLEASE TRY ANOTHER PLACE YOU WOULD LIKE TO GO TO AND YOU MIGHT FIND YOUR PLACE.THANK YOU!");
            for(d=0;d<10;d++)
            {System.out.println(a[d]);Thread.sleep(500);}
            System.out.println("\n\nDeparture City(CASE SENSITIVE)-");
            try{startingplace=obj.readLine();}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");startingplace=obj.readLine();}
            for(d=0;d<10;d++)
            {if(startingplace.compareTo(a[d])==0)
            {start();}}
            for(d=0;d<10;d++)
            if(!startingplace.equals(a[d]))
            {System.out.print("\u000C");
                System.out.println("Try Again");Thread.sleep(1000);udaipur();}
         }
    static void start()throws Exception
     {
            int cont;
            DD_RD.DepartureDate();
            System.out.println();
            System.out.println("Press 1 to continue..");
            System.out.println("Press 2 to start or change your departure city/date/returning date..");
            try{cont=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");cont=Integer.parseInt(obj.readLine());}
            if(cont==1){System.out.print("\u000C");udai();}
            if(cont==2){System.out.print("\u000C");udaipur();}
            else{System.out.println("Try Again");try{cont=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");cont=Integer.parseInt(obj.readLine());}
        }
    }
    public static void udai()throws Exception
    {
           Thread.sleep(70);
        load();
        System.out.println("1.To choose a holiday package without hotel reservation and round trip flights press 1...");
        System.out.println("2.To choose a holiday package with hotel reservation and one way flight press 2...");
        System.out.println("3.To choose a holiday package with hotel reservation and round trip flights press 3...");
        System.out.println("4.To choose a holiday package without hotel reservation and one way flight press 4...");
        System.out.println("5.To book hotel rooms press 5...");
        System.out.println("6.To book a rented taxi or rented two wheeler press 6...");
        System.out.println("7.To choose a holiday package with hotel reservation, round trip flights and also includes rented vehicles press 7.....");
        System.out.println("8.To see the description of the top 3 tourist destinations\nof Udaipur press 8...");
        try{ch[0]=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");ch[0]=Integer.parseInt(obj.readLine());}
        System.out.print("\u000C");
        DesignClass.LOAD();
        Thread.sleep(3000);
        System.out.print("\u000C");
           switch(ch[0])
           {
               case 1:
            t=Math.ceil(Math.random()*15000);
            System.out.println("Just a second.................");
            Thread.sleep(3000);
             System.out.println("******Saver package******");
             System.out.println("This package includes:"); 
             System.out.println("1)Flight Name-SpiceJet Airlines.");
             System.out.println("Round trip flights ,i.e, flights from "+startingplace+"\n to Udaipur and vice versa.");
             Flight_Class.Udaipur();
                System.out.println("For Detailed bookings of your filghts visit MakeMyFlight.com and login using the same details");
             System.out.println("2) The duration of the flight depends on the distance from your\n departure city");
             System.out.println("3) This package does not include hotel reservations. \nPlease have a look at the next package if you require hotel booking too.");
            System.out.println("Press 1 to return back to the homepage.");
            System.out.println("Press 2 to choose another place.");
            System.out.println("Press 3 to buy this package.");
            Thread.sleep(100);
            try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
             if(no==1){MakeMyReservation.intr();}
             if(no==2){System.out.print("\u000C");udai();}
             if(no==3){BILL.bill();paymentmethod.pay();}
            break;
            case 2:
            double room= 2500.0;
            int nrooms;
            t=Math.ceil(Math.random()*7500);
            System.out.println("Please enter the number of rooms you would like to reserve-");
            try{nrooms=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");nrooms=Integer.parseInt(obj.readLine());}
            cost=nrooms*room;
            System.out.println("Just a second..............");
            Thread.sleep(3000);
                System.out.println("******Premium economy package******");
                System.out.println("This package includes:");
                System.out.println("1)Flight name-IndiGo Airlines.");
                System.out.println("One way flight from "+startingplace+" to Udaipur.");
                Flight_Class.Udaipur();
                System.out.println("For Detailed bookings of your filghts visit MakeMyFlight.com and login using the same details");
                System.out.println("3) The duration of the flight depends on the distance from your\n departure city");
                System.out.println("4) In this package, the hotel reservation charges are "+room+"\n per room reserved. Since you have reserved "+nrooms+" rooms, the\n cost for the hotel rooms will be "+cost);
                System.out.println("5) At the time of check out, additional taxes are \ngoing to be applied to your hotel cost.");
                System.out.println("This is available in Hotel Inn");
                System.out.println("AMENITIES:Elegant lodging offering lake views & multiple dining options, plus a gym, a spa\n and an outdoor pool.");
                System.out.println("OVERALL REVIEW:4.8/5");
                System.out.println("Press 0 to quit the program");
                System.out.println("Press 1 to return back to the homepage.");
                System.out.println("Press 2 to buy this package.");
                Thread.sleep(100);
                System.out.println("Press 1 to return back to the homepage.");
                System.out.println("Press 2 to buy this package.");
                System.out.println("Press 3 to return back to the homepage of this place.");
            try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
                if(no==1){MakeMyReservation.intr();}
                if(no==2){BILL.bill();paymentmethod.pay();}
                if(no==3){System.out.print("\u000C");udai();}
            break;
            case 3:
            t=Math.ceil(Math.random()*15000);
            double room1=4000.0;
            int no_rooms;
            System.out.println("Please enter the number of rooms you would like to reserve-");
            try{no_rooms=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no_rooms=Integer.parseInt(obj.readLine());}
            cost=no_rooms*room1;
            System.out.println("Just a second..............");
            Thread.sleep(3000);
                System.out.println("******Business package******");
                System.out.println("This package includes:");
                System.out.println("1) Flight name-Jet Airways.");
                System.out.println("Round Trip flights from "+startingplace+" to Udaipur and\n vice versa.");
                Flight_Class.Udaipur();
                System.out.println("For Detailed bookings of your filghts visit MakeMyFlight.com and login using the same details");
                System.out.println("3) The duration of the flight depends on the distance from your\n departure city");
                System.out.println("4) This package is for 12 days and 13 nights");
                System.out.println("5) In this package, the hotel reservation charges are "+room1+" \nper room reserved. Since you have reserved "+no_rooms+" rooms, the cost for the hotel rooms\n will be "+(room1*no_rooms));
                System.out.println("6) At the time of check out, additional taxes are going to be\n applied to your hotel cost.");
                System.out.println("This package is available in Taj Lake Palace");
             System.out.println("AMENITIES:Lavish accommodations, a spa & elegant dining in an ultra-luxe marble hotel covering an island.");
             System.out.println("OVERALL REVIEW:4.7/5");
                Thread.sleep(100);
                System.out.println("Press 1 to return back to the homepage.");
                System.out.println("Press 2 to buy this package.");
                System.out.println("Press 3 to return back to the homepage of this place.");
            try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
                if(no==1){MakeMyReservation.intr();}
             if(no==2){BILL.bill();paymentmethod.pay();}
             if(no==3){System.out.print("\u000C");udai();}
            break;
            case 4:
            t=Math.ceil(Math.random()*9000);
            System.out.println("Just a second..............");
                Thread.sleep(3000);
             System.out.println("******Super Saver package******");
             System.out.println("This package includes:"); 
             System.out.println("1)Flight name-Air Asia.Class-Economy.");
             System.out.println("Round trip flights ,i.e, flights from "+startingplace+" to \nUdaipur and vice versa.");
             Flight_Class.Udaipur();
                System.out.println("For Detailed bookings of your filghts visit MakeMyFlight.com and login using the same details");
             System.out.println("2) The duration of the flight depends on the distance from your\n departure city");
             System.out.println("3) The package does not contain hotel reservations.Please see \nother packages for hotel reservations");
            Thread.sleep(100);
            System.out.println("Press 1 to return back to the homepage.");
            System.out.println("Press 2 to buy this package.");
                System.out.println("Press 3 to return back to the homepage of this place.");
            try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
                if(no==1){MakeMyReservation.intr();}
                if(no==2){BILL.bill();paymentmethod.pay();}
                if(no==3){System.out.print("\u000C");udai();}
            break;
            case 5:
            int rooms;
            System.out.println("Please enter the number of travelers-");
            try{travelers=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");travelers=Integer.parseInt(obj.readLine());}
            MakeMyReservation.travelers=travelers;
            System.out.println("Please enter the number of rooms you want");
            try{rooms=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");rooms=Integer.parseInt(obj.readLine());}
            MakeMyReservation.rooms=rooms;
            double days;
            System.out.println("Please enter the number of days you want it for");
            try{days=Double.parseDouble(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");days=Double.parseDouble(obj.readLine());}
            double cost;
            double cheapcostingroom=2550.0;
            double middlerangeroom=3700.0;
            double costlyroom=11400.0;
            System.out.println("Please enter the per room charges you look for \nand we will show you relevant rooms.(Starting from Rs.1000)");
            try{cost=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");cost=Integer.parseInt(obj.readLine());}
            System.out.println("Just a second.........");
            Thread.sleep(3000);
            if((cost>=1000)&&(cost<=3000))
            {
                System.out.println("You have opted for cheap costing rooms.");
                System.out.println("Only Fans and TV Facility.No Food Service.");
                cost=((rooms*cheapcostingroom)*days);
                MakeMyReservation.bill=cost;
                System.out.println("Therefore if you wish to stay for "+days+" days and reserve "+rooms+" rooms, you\n must pay "+cost);
            }
            else if((cost>=3001)&&(cost<=10000))
            {
                System.out.println("You have opted for middle ranged rooms");
                System.out.println("Fans,AC and TV Facility.No Food Service.");
                cost=((rooms*middlerangeroom)*days);
                MakeMyReservation.bill=cost;
                System.out.println("Therefore if you wish to stay for "+days+" days and reserve "+rooms+" rooms, you\nmust pay "+cost);
            }
            else
            { 
                System.out.println("You have opted for a high range room");
                System.out.println("Fans,Ac,4G WiFi and TV Facility.Food Service(24*7).");
                cost=((rooms*costlyroom)*days);
                MakeMyReservation.bill=cost;
                System.out.println("Therefore if you wish to stay for "+days+" days and reserve "+rooms+" rooms, you\nmust pay "+cost);}
            System.out.println("Press 1 to return back to the homepage.");
            System.out.println("Press 2 to buy this package.");
                System.out.println("Press 3 to return back to the homepage of this place.");
            try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
                if(no==1){MakeMyReservation.intr();}
                if(no==2){BILL.bill();paymentmethod.pay();}
                if(no==3){System.out.print("\u000C");udai();}
            break;
            case 6:
            {
                Rented_Vehicles.RentedV();
            }break;
            case 7:
            String enter;
            t=Math.ceil(Math.random()*15000);
            double roomm=5000.0;
            int no_room;
            System.out.println("Please enter the number of rooms you would like to reserve-");
            try{no_room=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no_room=Integer.parseInt(obj.readLine());}
            System.out.println("Just a second..............");
            cost=roomm*no_room;
            Thread.sleep(3000);
                System.out.println("******Supreme package******");
                System.out.println("This package includes:");
                System.out.println("1) Flight name-Jet Airways.");
                System.out.println("Round Trip flights from "+startingplace+" to Udaipur and\n vice versa.");
                Flight_Class.Udaipur();
                System.out.println("For Detailed bookings of your filghts visit MakeMyFlight.com and login using the same details");
                System.out.println("3) The duration of the flight depends on the distance from your\n departure city");
                System.out.println("4) This package is for 12 days and 13 nights");
                System.out.println("5) In this package, the hotel reservation charges are "+roomm+" \nper room reserved. Since you have reserved "+no_room+" rooms, the cost for the hotel rooms\n will be "+cost);
                System.out.println("6) At the time of check out, additional taxes are going to be\n applied to your hotel cost.");
                System.out.println("This package is available in Hotel Chiranthan");
                System.out.println("AMENITIES:24/7 Service,Television,4G WiFi,24/7 Water Supply, 24/7 Food Service,Laundary,A Personal Pool and AC");
                System.out.println("OVERALL REVIEW:4.9/5");
                Thread.sleep(1000);
                System.out.println("Type done when done");
                enter=obj.readLine();
                if(enter.equalsIgnoreCase("done"))
                {
                Rented_Vehicles.RentedV();
                System.out.println("Press 1 to return back to the homepage.");
                System.out.println("Press 2 to buy this package.");
                System.out.println("Press 3 to return back to the homepage of this place.");
                try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
                if(no==1){MakeMyReservation.intr();}
                if(no==2){BILL.bill();paymentmethod.pay();}
                if(no==3){System.out.print("\u000C");udai();}}
             else
             {
                 System.out.println("TRY AGAIN");
                 enter=obj.readLine();
                if(enter.equalsIgnoreCase("done"))
                {
                Rented_Vehicles.RentedV();
                System.out.println("Press 1 to return back to the homepage.");
                System.out.println("Press 2 to buy this package.");
                System.out.println("Press 3 to return back to the homepage of this place.");
                try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
                if(no==1){MakeMyReservation.intr();}
                if(no==2){BILL.bill();paymentmethod.pay();}
                if(no==3){System.out.print("\u000C");udai();}
               }
            }
             break;
             case 8:
            {
                System.out.print("\u000C");
                tdestions.utd();
                System.out.println("Press 1 to return back to the homepage.");
                System.out.println("Press 2 to return back to the homepage of this place.");
            try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
             if(no==1){MakeMyReservation.intr();}
             if(no==2){System.out.print("\u000C");udai();}
           }
           default:
           System.out.println("TRY AGAIN");
           Thread.sleep(150);
           System.out.print("\u000C");
           udai();
           break;
           }
          }
   static void load()throws Exception
   {
       String a="WELCOME";int i;
        int l=a.length();
        String b="TO";
        int l1=b.length();
        String c="UDAIPUR TOURISM";
        int l2=c.length();
        System.out.print("\t\t\t\t        ");     
        for(i=0;i<l;i++)
         {   char ch=a.charAt(i);
             for(int j=0;j<1;j++)
             {  String m="";m=m+ch;
                 System.out.print(m);
                 Thread.sleep(230);
             }
         }
        System.out.println();
        System.out.print("\t\t\t                  ");
        for(i=0;i<l1;i++)
         {
             char ch=b.charAt(i);
             for(int j=0;j<1;j++)
             {
                 System.out.print(ch);
                 Thread.sleep(500);
                }
        }
        System.out.println();
        System.out.print("\t\t\t            ");
        for(i=0;i<l2;i++)
         {
             char ch=c.charAt(i);
             for(int j=0;j<1;j++)
             {
                 System.out.print(ch);
                 Thread.sleep(100);
                }
        }
        System.out.println();
       for(i=0;i<150;i++)
       {System.out.print("=");}
       System.out.println();
    }
    }