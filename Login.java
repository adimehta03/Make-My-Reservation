package Computer;
import java.io.*;
class Login
{
    public static void Intro()throws Exception
    {
        System.out.print("\u000C");
        System.out.println("\t\t\t\tMakeMyReservation.com");
        Login();
    }
    public static void Login()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String email,password;int check;
        System.out.println("\t\t\t\tLogin");
        System.out.print("\n\n\n\n\t\t\tE-MAIL ID: ");
        email=br.readLine();
        System.out.print("\n\t\t\tPASSWORD: ");
        password=br.readLine();
        if((email.equals(Account.ID[0]))&&(password.equals(Account.password)))        
        {
            System.out.println("The DATA you have entered is right!");
            Thread.sleep(2000);
            MakeMyReservation.intr();
        }
        else
        {
            System.out.println("It looks like you have entered a wrong E-Mail ID or password so please re-enter it-");
            Thread.sleep(900);
            System.out.println("Would you like to create an account?\nTo do so press 1..");
            System.out.println("To try again press 2..");
            try{check=Integer.parseInt(br.readLine());}
            catch(Exception a)
            {
                System.out.println("TRY AGAIN");
                check=Integer.parseInt(br.readLine());
            }
            if(check==1){Account.Account_creation();}
            else if(check==2){
            System.out.print("\u000C");
            LOGINCHECK();}
            else{Login();}
        }
    }
    static void LOGINCHECK()throws Exception
    {Login();}
}