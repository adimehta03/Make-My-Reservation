package Computer;
import java.io.*;
class TaxiBook
{
    static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    static int far=25,bill,no,tplace,tplace1;
    static String gplace;
    static String darjeelingp[]={"","Kanchenjunga Mountain","Padmaja Naidu Himalayan Zoological Park","Japanese Peace Pagoda","Tiger Hill","Batasia Loop","Chowrasta","Passenger Ropeway","Mahakal Temple","Darjeeling Himalayan Railway","Hiking & Camping Tours"};
    static String ootyp[]={"","Nilgiri Mountain Railway","Botanical Gardens","Avalanche Lake","Pykara Lake","Upper Bhavani Lake","Doddabetta Peak","Shooting Point","Rose Garden","Pykara Lake","Pykara Falls"};
    static String hyderabadp[]={"","Birla Mandir","Ramoji Film City","Taj Falaknuma Palace","Golkonda Fort","Charminar","Shri Jagannath Temple","Chowmahalla Palace","Nehru Zoological Park","Salar Jung Museum","Chilkur Balaji Temple"};
    static String kanyakumarip[]={"","Vivekananda Rock Memorial","Thiruvalluvar Statue","Kanyakumari Beach","Thirparappu Falls","Mathur Aqueduct","Our Lady of Ransom Church","Gandhi Memorial","Vattakottai Fort","Kanyakumari Wax Museum","Sunset view point"};
    static String udaipurp[]={"","Lake Pichola","Bagore Ki Haveli","Lake Fatehsagar Udaipur","Eklingji Temple","Jagdish Temple","Srinathji Temple","City Palace Government Museum","Jagmandir Isla","Monsoon Palace"};
    static String varanasip[]={"","Bharat Kala Bhawan","Kabir Math","Bharat Mata Temple","Ramnagar Fort","Sankat Mochan Hanuman Temple","Banaras Hindu University","Tulsi Manas Temple","Sarnath","Kashi Vishwanath Mandir","Dashashwmedh Ghat"};
    static String shimlap[]={"","The Ridge","Jakhoo Hills","The Shimla State Musuem","Kufri","Summer Hill","Indian Institute of Advanced Studies","Annandale","Naldehra And Shaily Peak","Chadwick Falls","Daranghati Sanctuary"};
    static String manalip[]={"","Rohtang Pass","Hadimba Temple"," Vashist Hot Water Springs","Solang Valley","Basheshwar Mahadev Temple","Nehru Kund","Sultanpur Palace","Bijli Mahadev Temple","Beas River","Ma Sharvari Temple"};
    static String place[]={"","Shimla","Manali","Varanasi","Udaipur","Ooty","Kanyakumari","Hydrebad","Darjeeling"};
    static void TAXI()throws Exception
    {
        System.out.print("\u000C");
        DesignClass.TAXI();
        Thread.sleep(1000);
        System.out.print("\u000C");
        System.out.println("\t\t  TAXI BOOKING");
        System.out.println("WE PROVIDE FACILITIES ONLY FROM TOURIST ATTRACTIONS TO\n TOURIST ATTRACTIONS!");
        System.out.println("It looks like you've completed your bookings and reached your destination.");
        System.out.println("We are glad to inform you about the brand new facility we are providing-");
        System.out.println("                       TUBER TAXIES");
        System.out.println("                 ANYTIME     ANYWHERE....*.*");
        Thread.sleep(7500);
        taxi();
    }
    static void taxi()throws Exception
    {
        System.out.println("Where are you now?");
            for(int i=1;i<9;i++)
            {
                System.out.println(i+")"+place[i]);
                Thread.sleep(1000);
            }
            gplace=obj.readLine();
            if(gplace.equalsIgnoreCase("1")||gplace.equalsIgnoreCase("Shimla"))
            {
                System.out.print("\u000C");
                System.out.println("WOAH! It looks like you've reached Shimla and bugging about mode of transport to travel around.\nSo here we are-TUBER TAXI.....\n             ANYTIME ANYWHERE *.*.");
                for(int i=0;i<70;i++)
                {System.out.print("-");}
                System.out.println();
                System.out.println("So these are the places in Shimla where you can get our taxis.");
                for(int i=1;i<11;i++)
            {
                System.out.println(i+")"+shimlap[i]);
                Thread.sleep(1000);
            }
        }
        else if(gplace.equalsIgnoreCase("2")||gplace.equalsIgnoreCase("Manali"))
            {
                System.out.print("\u000C");
                System.out.println("WOAH! It looks like you've reached Manali and bugging about mode of transport to travel around.\nSo here we are-TUBER TAXI.....\n             ANYTIME ANYWHERE *.*.");
                for(int i=0;i<70;i++)
                {System.out.print("-");}
                System.out.println();
                System.out.println("So these are the places in Manali where you can get our taxis.");
                for(int i=1;i<11;i++)
            {
                System.out.println(i+")"+manalip[i]);
                Thread.sleep(1000);
            }
        }
        else if(gplace.equalsIgnoreCase("3")||gplace.equalsIgnoreCase("Varanasi"))
            {
                System.out.print("\u000C");
                System.out.println("WOAH! It looks like you've reached Varanasi and bugging about mode of transport to travel around.\nSo here we are-TUBER TAXI.....\n             ANYTIME ANYWHERE *.*.");
                for(int i=0;i<70;i++)
                {System.out.print("-");}
                System.out.println();
                System.out.println("So these are the places in Varanasi where you can get our taxis.");
                for(int i=1;i<11;i++)
            {
                System.out.println(i+")"+varanasip[i]);
                Thread.sleep(1000);
            }
        }
        else if(gplace.equalsIgnoreCase("4")||gplace.equalsIgnoreCase("Udaipur"))
            {
                System.out.print("\u000C");
                System.out.println("WOAH! It looks like you've reached Udaipur and bugging about mode of transport to travel around.\nSo here we are-TUBER TAXI.....\n             ANYTIME ANYWHERE *.*.");
                for(int i=0;i<70;i++)
                {System.out.print("-");}
                System.out.println();
                System.out.println("So these are the places in Udaipur where you can get our taxis.");
                for(int i=1;i<10;i++)
            {
                System.out.println(i+")"+udaipurp[i]);
                Thread.sleep(1000);
            }
        }
        else if(gplace.equalsIgnoreCase("5")||gplace.equalsIgnoreCase("Ooty"))
            {
                System.out.print("\u000C");
                System.out.println("WOAH! It looks like you've reached Ooty and bugging about mode of transport to travel around.\nSo here we are-TUBER TAXI.....\n             ANYTIME ANYWHERE *.*.");
                for(int i=0;i<70;i++)
                {System.out.print("-");}
                System.out.println();
                System.out.println("So these are the places in Ooty where you can get our taxis.");
                for(int i=1;i<11;i++)
            {
                System.out.println(i+")"+ootyp[i]);
                Thread.sleep(1000);
            }
        }
        else if(gplace.equalsIgnoreCase("6")||gplace.equalsIgnoreCase("Kanyakumari"))
            {
                System.out.print("\u000C");
                System.out.println("WOAH! It looks like you've reached Kanyakumari and bugging about mode of transport to travel around.\nSo here we are-TUBER TAXI.....\n             ANYTIME ANYWHERE *.*.");
                for(int i=0;i<70;i++)
                {System.out.print("-");}
                System.out.println();
                System.out.println("So these are the places in Kanyakumari where you can get our taxis.");
                for(int i=1;i<11;i++)
            {
                System.out.println(i+")"+kanyakumarip[i]);
                Thread.sleep(1000);
            }
        }
        else if(gplace.equalsIgnoreCase("7")||gplace.equalsIgnoreCase("Hyderabad"))
            {
                System.out.print("\u000C");
                System.out.println("WOAH! It looks like you've reached Hyderabad and bugging about mode of transport to travel around.\nSo here we are-TUBER TAXI.....\n             ANYTIME ANYWHERE *.*.");
                for(int i=0;i<70;i++)
                {System.out.print("-");}
                System.out.println();
                System.out.println("So these are the places in Hyderabad where you can get our taxis.");
                for(int i=1;i<11;i++)
            {
                System.out.println(i+")"+hyderabadp[i]);
                Thread.sleep(1000);
            }
        }
        else if(gplace.equalsIgnoreCase("8")||gplace.equalsIgnoreCase("Darjeeling"))
            {
                System.out.print("\u000C");
                System.out.println("WOAH! It looks like you've reached Darjeeling and bugging about mode of transport to travel around.\nSo here we are-TUBER TAXI.....\n             ANYTIME ANYWHERE *.*.");
                for(int i=0;i<70;i++)
                {System.out.print("-");}
                System.out.println();
                System.out.println("So these are the places in Darejeeling where you can get our taxis.");
                for(int i=1;i<11;i++)
            {
                System.out.println(i+")"+darjeelingp[i]);
                Thread.sleep(1000);
            }
        }
        else
        {System.out.println("INVALID");Thread.sleep(1000);TAXI();}
                System.out.println("Please enter the number corresponding the place where you are.");
                try{tplace=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");tplace=Integer.parseInt(obj.readLine());}
                System.out.println("Please enter the number corresponding the place where you want to go.");
                try{tplace1=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");tplace1=Integer.parseInt(obj.readLine());}
                System.out.print("\u000C");
                taxis();
    }
    static void taxis()throws Exception
    {
            if(tplace==tplace1)
            {
                System.out.println("You can't book taxi for the same place\nTry Again.");
                taxi();
            }
            else if(tplace>=1&&tplace1>=1&&tplace<=10&&tplace1<=10)
            {
            if(tplace==1&&tplace1==2||tplace==2&&tplace1==1||tplace==3&&tplace1==1||tplace==4&&tplace1==1||tplace==5&&tplace1==1||tplace==6&&tplace1==1||tplace==7&&tplace1==1||tplace==1&&tplace1==2||tplace==8&&tplace1==1||tplace==9&&tplace1==1||tplace==10&&tplace1==1)
            {
                bill=(far*2);
                System.out.println("The distance of this place from your location is 2 km\nso it will cost you "+bill);}
                else if(tplace==1&&tplace1==3||tplace==2&&tplace1==3||tplace==3&&tplace1==2||tplace==4&&tplace1==2||tplace==5&&tplace1==2||tplace==6&&tplace1==2||tplace==7&&tplace1==2||tplace==8&&tplace1==2||tplace==9&&tplace1==2||tplace==10&&tplace1==2)
            {
                bill=(far*6);
                System.out.println("The distance of this place from your location is 6 km\nso it will cost you "+bill);}
                  else if(tplace==1&&tplace1==4||tplace==2&&tplace1==4||tplace==3&&tplace1==4||tplace==4&&tplace1==3||tplace==5&&tplace1==3||tplace==6&&tplace1==3||tplace==7&&tplace1==3||tplace==8&&tplace1==3||tplace==9&&tplace1==3||tplace==10&&tplace1==3)
            {
                bill=(far*19);
                System.out.println("The distance of this place from your location is 19 km\nso it will cost you "+bill);}
              else if(tplace==1&&tplace1==5||tplace==2&&tplace1==5||tplace==3&&tplace1==5||tplace==4&&tplace1==5||tplace==5&&tplace1==4||tplace==6&&tplace1==4||tplace==7&&tplace1==4||tplace==8&&tplace1==4||tplace==9&&tplace1==4||tplace==10&&tplace1==4)
            {
                bill=(far*9);
                System.out.println("The distance of this place from your location is 9 km\nso it will cost you "+bill);}
                  else if(tplace==1&&tplace1==6||tplace==2&&tplace1==6||tplace==3&&tplace1==6||tplace==4&&tplace1==6||tplace==5&&tplace1==6||tplace==6&&tplace1==5||tplace==7&&tplace1==5||tplace==8&&tplace1==5||tplace==9&&tplace1==5||tplace==10&&tplace1==5)
            {
                bill=(far*8);
                System.out.println("The distance of this place from your location is 8 km\nso it will cost you "+bill);}
                  else if(tplace==1&&tplace1==7||tplace==2&&tplace1==7||tplace==3&&tplace1==7||tplace==4&&tplace1==7||tplace==5&&tplace1==7||tplace==6&&tplace1==7||tplace==7&&tplace1==6||tplace==8&&tplace1==6||tplace==9&&tplace1==6||tplace==10&&tplace1==6)
            {   
                bill=(far*22);
                System.out.println("The distance of this place from your location is 22 km\nso it will cost you "+bill);}
                  else if(tplace==1&&tplace1==8||tplace==2&&tplace1==8||tplace==3&&tplace1==8||tplace==4&&tplace1==8||tplace==5&&tplace1==8||tplace==6&&tplace1==8||tplace==7&&tplace1==8||tplace==8&&tplace1==7||tplace==9&&tplace1==7||tplace==10&&tplace1==7)
            {
                bill=(far*7);
                System.out.println("The distance of this place from your location is 7 km\nso it will cost you "+bill);}
                  else if(tplace==1&&tplace1==9||tplace==2&&tplace1==9||tplace==3&&tplace1==9||tplace==4&&tplace1==9||tplace==5&&tplace1==9||tplace==6&&tplace1==9||tplace==7&&tplace1==9||tplace==8&&tplace1==9||tplace==9&&tplace1==8||tplace==10&&tplace1==8)
            {
                bill=(far*150);
                System.out.println("The distance of this place from your location is 150 km\nso it will cost you "+bill);}
              else if(tplace==1&&tplace1==10||tplace==2&&tplace1==10||tplace==3&&tplace1==10||tplace==4&&tplace1==10||tplace==5&&tplace1==10||tplace==6&&tplace1==10|tplace==7&&tplace1==10||tplace==8&&tplace1==10||tplace==9&&tplace1==10||tplace==10&&tplace1==9)
            {
                bill=(far*12);
                System.out.println("The distance of this place from your location is 12 km\nso it will cost you "+bill);}
                System.out.println("Press 1 to book the taxi.");
                try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
                if(no==1){BILL.bill();paymentmethod.pay();}
                else
                {
                try{no=Integer.parseInt(obj.readLine());}catch(Exception t){System.out.println("INVALID\nTRY AGAIN");no=Integer.parseInt(obj.readLine());}
                if(no==1){BILL.bill();paymentmethod.pay();}
            }
                    
            }
            else
            {TAXI();}
            }
    }