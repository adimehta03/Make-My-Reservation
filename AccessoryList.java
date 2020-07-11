package Computer;
import java.io.*;
public class AccessoryList 
{
      static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      static String ans,more;
      static double price1=0,price=0;static int n=0;
    public static void accessories()throws Exception
    {
        System.out.print("\u000C");
        System.out.println("NOTE:A SINGLE ACCESSORY COSTS ABOUT Rs.500 FOR RENT.\n    MAXIMUM ARE TWO.IF THIRD TIME Y IS TYPED DETAILS WON'T BE ASKED FOR.");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Do you wish to make a accessories list? [Y/N]");
        ans=obj.readLine();
        int i;
        n++;
        String accessories[]=new String[n+1];
        String brand[]=new String[n+1];
        for(i=0;i<n;i++)
        {
            if(!ans.equalsIgnoreCase("n"))
            {
                System.out.print("ENTER YOUR ACCESSORY- ");
                accessories[i]=obj.readLine();
                System.out.print("\nENTER BRAND- ");
                brand[i]=obj.readLine();
                System.out.println("DO YOU WISH TO FILL IN MORE ACCESSORIES? [Y/N]");
                more=obj.readLine();
                if(more.equalsIgnoreCase("Y"))
                {
                    System.out.print("\u000C");System.out.print("ENTER YOUR ACCESSORY- ");
                    accessories[i+1]=obj.readLine();
                    System.out.print("\nENTER BRAND- ");
                    brand[i+1]=obj.readLine();
                    System.out.println("DO YOU WISH TO FILL IN MORE ACCESSORIES? [Y/N]");
                    more=obj.readLine();
                }
                else if(more.equalsIgnoreCase("n")){break;}
            }
            else{break;}
        }
        if(!ans.equalsIgnoreCase("n"))
        {
            System.out.println("YOUR ACCESSORIES LIST");
            for(i=0;i<accessories.length;i++)
            {
                System.out.print(accessories[i]+"- ");
                System.out.print(brand[i]);
                System.out.println();
            }
           System.out.println("WE WILL TRY TO PROVIDE YOU THESE ACCESSORIES WHEN YOU ARE EITHER BOARDING YOUR FLIGHT OR WHEN\nYOU REACH THERE");       
           if(n==1)
           {price1=500;}
           else
           {
               price1=2*500;
            }
           System.out.println("Price-"+price1);
           price=BILL.tbill+price1;
           System.out.println("Total Price-"+price);
           Thread.sleep(5000);
           System.out.println("PLEASE WAIT....");
           Thread.sleep(10000);
        }
        else
        {
           price=BILL.tbill+price1;
            paymentmethod.pay();
        }
    }
}