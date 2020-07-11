package Computer;
import java.io.*;
class BILL
{
      static double tbill=0;
      static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    static void bill()throws Exception
    {
        int i;String sign;
        if(MakeMyReservation.yes==1)
        {
            bill1();
        }
        if(MakeMyReservation.yes==2)
        {
            bill2();
        }
            System.out.println();
            for(i=0;i<250;i++)
            System.out.print("=");
            System.out.println("\n\n");
            System.out.print("Trademark-AdanPvtLtd\t\t\t\t\t\tYour Signature-");
            sign=obj.readLine();
            AccessoryList.accessories();
    }
    static void bill1()throws Exception
    {
        int i;
        System.out.print("\tDESCRIPTION\t\t||Number of travelers||Number of Vehicles||Price(in Rs.)||\n");
        for(i=0;i<250;i++)
            System.out.print("-");
            System.out.println();
        String gplace=TaxiBook.gplace;
            {if(TaxiBook.gplace.equalsIgnoreCase("1"))
            {System.out.print("1.Place     :Shimla");}
            else if(TaxiBook.gplace.equalsIgnoreCase("2"))
            {System.out.print("1.Place     :Manali");}
            else if(TaxiBook.gplace.equalsIgnoreCase("3"))
            {System.out.print("1.Place     :Varanasi");}
            else if(TaxiBook.gplace.equals("4"))
            {System.out.print("1.Place     :Udaipur");}
            else if(TaxiBook.gplace.equalsIgnoreCase("5"))
            {System.out.print("1.Place     :Ooty");}
            else if(TaxiBook.gplace.equalsIgnoreCase("6"))
            {System.out.print("1.Place     :Kanyakumari");}
            else if(TaxiBook.gplace.equalsIgnoreCase("7"))
            {System.out.println("1.Place     :Hyderabad");}
            else if(TaxiBook.gplace.equalsIgnoreCase("8"))
            {System.out.print("1.Place     :Darjeeling");}
            else
            {System.out.print("1.Place      :"+TaxiBook.gplace);}}
            System.out.print("\t\t||            ---    ||           ---    ||       ---   ||\n");
            System.out.print("2.Taxi Charge:");
            tbill=TaxiBook.bill;
            System.out.print("\t\t\t||            ---    ||           ---    ||      "+tbill+"    ||\n");
            System.out.print("\t\t\t\t||\t\t     ||\t\t\t ||\t\t||\n");
            System.out.print("\t\t\t\t||\t\t     ||\t\t\t ||\t\t||\n");
            System.out.print("\t\t\t\t||\t\t     ||\t\t\t ||\t\t||\n");
            System.out.print("\t\t\t\t||\t\t     ||\t\t\t ||\t\t||\n");
            System.out.print("\t\t\t\t||\t\t     ||\t\t\t ||\t\t||\n");
            System.out.print("  Total      :");
            System.out.print("\t\t\t||            ---    ||           ---    ||      "+tbill+"    ||\n");
    }
    static void bill2()throws Exception
    {
            String clas=Flight_Class.a;
            double bill=Flight_Class.bill,tbill1=0;
            int trav=Flight_Class.travelers;int i;String sign;
            System.out.print("\u000C");
        for(i=0;i<250;i++)
        System.out.print("=");
        System.out.println();
        System.out.println("\t\t\tMakeMyReservation\n\t\t\tBILL RECEIPT");
        System.out.println();
        System.out.print("\tName  :"+Account.NAME[0]);
        System.out.print("\t\t\tBooking ID:"+(int)Account.pass);
        System.out.println();
        System.out.print("\tEmail ID:"+Account.ID[0]);
        System.out.print("\t\t\tFor more details-+91-8273829919\n");
        for(i=0;i<250;i++)
        System.out.print("=");
        System.out.println();
            System.out.print("\u000C");
        for(i=0;i<250;i++)
        System.out.print("=");
        System.out.println();
        System.out.println("\t\t\tMakeMyReservation\n\t\t\tBILL RECEIPT");
        System.out.println();
        System.out.print("\tName  :"+Account.NAME[0]);
        System.out.print("\t\t\tBooking ID:"+(int)Account.pass);
        System.out.println();
        System.out.print("\tEmail ID:"+Account.ID[0]);
        System.out.print("\t\t\tFor more details-+91-8273829919\n");
        for(i=0;i<250;i++)
        System.out.print("=");
        System.out.println();
        System.out.println();
        System.out.print("\tDESCRIPTION\t\t||Service Tax||Number of travelers||Number of Vehicles||Price(in Rs.)||\n");
        for(i=0;i<250;i++)
            System.out.print("-");
            System.out.println();
            if(MakeMyReservation.place.equals("1"))
            System.out.print("1.Place     :Shimla");
            else if(MakeMyReservation.place.equals("2"))
            System.out.print("1.Place     :Manali");
            else if(MakeMyReservation.place.equals("3"))
            System.out.print("1.Place     :Varanasi");
            else if(MakeMyReservation.place.equals("4"))
            System.out.print("1.Place     :Udaipur");
            else if(MakeMyReservation.place.equals("5"))
            System.out.print("1.Place     :Hyderabad");
            else if(MakeMyReservation.place.equals("6"))
            System.out.print("1.Place     :Ooty");
            else if(MakeMyReservation.place.equals("7"))
            System.out.println("1.Place     :Kanyakumari");
            else if(MakeMyReservation.place.equals("8"))
            System.out.print("1.Place     :Darjeeling");
            else
            {System.out.print("1.Place      :"+MakeMyReservation.place);}
            System.out.print("\t\t||     ---   ||            ---    ||           ---    ||             ||\n");
            if(Shimla.ch[0]==1||Manali.ch[0]==1||Varanasi.ch[0]==1||Udaipur.ch[0]==1||Ooty.ch[0]==1||Darjeeling.ch[0]==1||Kanyakumari.ch[0]==1||Hyderabad.ch[0]==1)
            {
                System.out.print("2.Holiday Package:Saver Package");
                System.out.print(" ||     ---   ||            ---    ||           ---    ||     ---     ||\n");
                System.out.print("3.Flight_Class:"+clas);
                tbill=bill+5.5/100.0*bill;
                System.out.print("\t\t||     5.5%  ||            "+trav+"      ||           ---    ||    "+tbill+"   ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("  Total      :");
                System.out.print("\t\t\t||     ---   ||            ---    ||           ---    ||      "+tbill+" ||\n");
            }
            else if(Shimla.ch[0]==2||Manali.ch[0]==2||Varanasi.ch[0]==2||Udaipur.ch[0]==2||Ooty.ch[0]==2||Darjeeling.ch[0]==2||Kanyakumari.ch[0]==2||Hyderabad.ch[0]==2)
            {
                System.out.print("2.Package:Premium Economy Package");
                System.out.print("    ---     ||            ---    ||           ---    ||     ---     ||\n");
                System.out.print("3.Hotel Cost:");
                if(Shimla.ch[0]==2)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Shimla.cost+"   ||\n");
                tbill1=Shimla.cost;}
                else if(Manali.ch[0]==2)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Manali.cost+"   ||\n");
                tbill1=Manali.cost;}
                else if(Udaipur.ch[0]==2)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Udaipur.cost+"   ||\n");
                tbill1=Udaipur.cost;}
                else if(Varanasi.ch[0]==2)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Varanasi.cost+"   ||\n");
                tbill1=Varanasi.cost;}
                else if(Kanyakumari.ch[0]==2)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Kanyakumari.cost+"   ||\n");
                tbill1=Kanyakumari.cost;}
                else if(Hyderabad.ch[0]==2)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Hyderabad.cost+"   ||\n");
                tbill1=Hyderabad.cost;}
                else if(Ooty.ch[0]==2)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Ooty.cost+"   ||\n");
                tbill1=Ooty.cost;}
                else if(Darjeeling.ch[0]==2)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Darjeeling.cost+"   ||\n");
                tbill1=Darjeeling.cost;}
                System.out.print("4.Flight_Class:"+clas);
                tbill=bill+5.0/100.0*bill;
                System.out.print("\t\t||     5.0%  ||            "+trav+"      ||           ---    ||    "+tbill+"  ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                tbill+=tbill1;
                System.out.print("  Total      :");
                System.out.print("\t\t\t||     ---   ||            ---    ||           ---    ||      "+tbill+" ||\n");
            }
            else if(Shimla.ch[0]==3||Manali.ch[0]==3||Varanasi.ch[0]==3||Udaipur.ch[0]==3||Ooty.ch[0]==3||Darjeeling.ch[0]==3||Kanyakumari.ch[0]==3||Hyderabad.ch[0]==3)
            {
                System.out.print("2.Holiday Package:Business Package");
                System.out.print("    ---    ||            ---    ||           ---    ||     ---     ||\n");
                System.out.print("3.Hotel Cost:");
                if(Shimla.ch[0]==3)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Shimla.cost+"   ||\n");
                tbill1=Shimla.cost;}
                else if(Manali.ch[0]==3)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Manali.cost+"   ||\n");
                tbill1=Manali.cost;}
                else if(Udaipur.ch[0]==3)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Udaipur.cost+"   ||\n");
                tbill1=Udaipur.cost;}
                else if(Varanasi.ch[0]==3)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Varanasi.cost+"   ||\n");
                tbill1=Varanasi.cost;}
                else if(Kanyakumari.ch[0]==3)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Kanyakumari.cost+"   ||\n");
                tbill1=Kanyakumari.cost;}
                else if(Hyderabad.ch[0]==3)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Hyderabad.cost+"   ||\n");
                tbill1=Hyderabad.cost;}
                else if(Ooty.ch[0]==3)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Ooty.cost+"   ||\n");
                tbill1=Ooty.cost;}
                else if(Darjeeling.ch[0]==3)
                {System.out.print("                   ||   ---     ||            ---    ||           ---    ||     "+Darjeeling.cost+"   ||\n");
                tbill1=Darjeeling.cost;}
                System.out.print("4.Flight_Class:"+clas);
                tbill=bill+8.0/100.0*bill;
                System.out.print("\t\t||     8.0%  ||            "+trav+"      ||           ---    ||  "+tbill+"   ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                tbill+=tbill1;
                System.out.print("  Total      :");
                System.out.print("\t\t\t||     ---   ||            ---    ||           ---    ||      "+tbill+" ||\n");
            }
            else if(Shimla.ch[0]==4||Manali.ch[0]==4||Varanasi.ch[0]==4||Udaipur.ch[0]==4||Ooty.ch[0]==4||Darjeeling.ch[0]==4||Kanyakumari.ch[0]==4||Hyderabad.ch[0]==4)
            {
                System.out.print("2.Holiday Package:Super Saver Package");
                System.out.print("    --- ||            ---    ||           ---    ||     ---     ||\n");
                System.out.print("3.Flight_Class:"+clas);
                tbill=bill+7.5/100.0*bill;
                System.out.print("\t\t||     7.5%  ||            "+trav+"      ||           ---    ||  "+tbill+"  ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("  Total      :");
                System.out.print("\t\t\t||     ---   ||            ---    ||           ---    ||    "+tbill+" ||\n");
            }
            else if(Shimla.ch[0]==5||Manali.ch[0]==5||Varanasi.ch[0]==5||Udaipur.ch[0]==5||Ooty.ch[0]==5||Darjeeling.ch[0]==5||Kanyakumari.ch[0]==5||Hyderabad.ch[0]==5)
            {
                System.out.print("2.Rooms booked:"+MakeMyReservation.rooms);
                tbill=MakeMyReservation.bill+0.50/100.0*MakeMyReservation.bill;
                System.out.print("\t\t||     0.5%  ||            "+MakeMyReservation.travelers+"      ||            ---   ||  "+tbill+"     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("  Total      :");
                System.out.print("\t\t\t||     ---   ||            ---    ||           ---    ||    "+tbill+"  ||\n");
            }
            else if(Shimla.ch[0]==6||Manali.ch[0]==6||Varanasi.ch[0]==6||Udaipur.ch[0]==6||Ooty.ch[0]==6||Darjeeling.ch[0]==6||Kanyakumari.ch[0]==6||Hyderabad.ch[0]==6)
            {
                if(Rented_Vehicles.check==1)
                {
                    System.out.print("2.Rented Vehicle:Car");
                    if(Rented_Vehicles.rent==1)
                    {
                        System.out.print("Type:Driver");
                        tbill=Rented_Vehicles.bill+4.0/100.0*Rented_Vehicles.bill;
                        System.out.print(" ||   4%      ||            "+Rented_Vehicles.travelers+"      ||          "+Rented_Vehicles.numberofv+"       ||   "+tbill+"    ||\n");
                    }
                    else if(Rented_Vehicles.rent==2)
                    {
                        System.out.print("Type:Self-Driven");
                        tbill=Rented_Vehicles.bill+2.0/100.0*Rented_Vehicles.bill;
                        System.out.print(" ||   2%      ||            "+Rented_Vehicles.travelers+"      ||          "+Rented_Vehicles.numberofv+"       ||   "+tbill+"    ||\n");
                    }
                }
                else
                {
                    System.out.print("2.Rented Vehicle:Two Wheeler");
                    tbill=Rented_Vehicles.bill+0.05/100.0*Rented_Vehicles.bill;
                    System.out.print(" ||   0.05%      ||            "+Rented_Vehicles.travelers+"      ||          "+Rented_Vehicles.numberofv+"       ||   "+tbill+"    ||\n");
                }
                    System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                    System.out.print("  Total      :");
                    System.out.print("\t\t\t||     ---   ||            ---    ||           ---    ||      "+tbill+" ||\n");
                }
            else if(Shimla.ch[0]==7||Manali.ch[0]==7||Varanasi.ch[0]==7||Udaipur.ch[0]==7||Ooty.ch[0]==7||Darjeeling.ch[0]==7||Kanyakumari.ch[0]==7||Hyderabad.ch[0]==7)
            {
                System.out.print("2.Holiday Package:Supreme Package");
                System.out.print("    ---     ||            ---    ||           ---    ||     ---     ||\n");
                System.out.print("3.Flight_Class:"+clas);
                tbill1=bill+9.5/100.0*bill;
                System.out.print("\t\t||     9.5%  ||            "+trav+"      ||           ---    ||  "+tbill1+"   ||\n");
                if(Rented_Vehicles.check==1)
                {
                    System.out.print("2.Rented Vehicle:Car");
                    if(Rented_Vehicles.rent==1)
                    {
                        System.out.print("Type:Driver");
                        tbill=Rented_Vehicles.bill+4.0/100.0*Rented_Vehicles.bill;
                        System.out.print(" ||   4%      ||            "+Rented_Vehicles.travelers+"      ||          "+Rented_Vehicles.numberofv+"       ||   "+tbill+"    ||\n");
                    }
                    else if(Rented_Vehicles.rent==2)
                    {
                        System.out.print("Type:Self-Driven");
                        tbill=Rented_Vehicles.bill+2.0/100.0*Rented_Vehicles.bill;
                        System.out.print(" ||   2%      ||            "+Rented_Vehicles.travelers+"      ||          "+Rented_Vehicles.numberofv+"       ||   "+tbill+"    ||\n");
                    }
                }
                else
                {
                    System.out.print("2.Rented Vehicle:Two Wheeler");
                    tbill=Rented_Vehicles.bill+0.05/100.0*Rented_Vehicles.bill;
                    System.out.print("    ||   0.05%      ||         "+Rented_Vehicles.travelers+"      ||          "+Rented_Vehicles.numberofv+"       ||   "+tbill+"    ||\n");
                }
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                System.out.print("\t\t\t\t||           ||\t\t\t  ||\t\t      ||\t     ||\n");
                tbill+=tbill1;
                System.out.print("  Total      :");
                System.out.print("\t\t\t||     ---   ||            ---    ||           ---    ||      "+tbill+"||\n");
            }
    }
}