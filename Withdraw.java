import java.util.Scanner;
class withdraw
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to Kiran Bank ");
    int time=1,pinReal=1233,chance=4;
    char askUser;
    do
    {
      System.out.println("Enter your four-digit Pin:- ");
      int pinUser=sc.nextInt();
      if(pinUser>999 && pinUser <=9999)
      {
        if (time==1 && pinUser!=pinReal)
      {
        System.out.println("Sorry ! You enter Worng pin.\n Chance remaining ="+(chance-time));
        System.out.println("Do you want Hint (Y/N)?");
        askUser=sc.next().charAt(0);
        if(askUser=='Y')
        {
          if (pinReal%2==0) 
          {
            System.out.println("your Hint is:- Pin Number is Four-digit-Even-Number");
          }
        else
        {
          System.out.println("your Hint is:- Pin Number is Four-digit-Odd-Number");
        }
        }
     }
      else if (time==2 && pinUser!=pinReal)
      {
        System.out.println("Sorry ! You enter Worng pin Again.\n Chance remaining ="+(chance-time));
        System.out.println("Do you want Hint (Y/N)?");
        askUser=sc.next().charAt(0);
        if(askUser=='Y')
        {
        int fdigit=pinReal/1000;
        System.out.println("your Hint is:- Pin Number Start with "+fdigit);
        }
      }
      else if (time==3 && pinUser!=pinReal)
      {
        System.out.println("Sorry ! You enter Worng pin Again.\n Chance remaining ="+(chance-time));
        System.out.println("Do you want Hint (Y/N)?");
        askUser=sc.next().charAt(0);
        if(askUser=='Y')
        {
        int ldigit=pinReal%10;
        System.out.println("your Hint is:- Pin Number ends with "+ldigit);
        }
      }
      else if(pinUser==pinReal)
      {
        System.out.println("your pin is accepted !! you can withdraw your money.");
        break;
      }
      }
      else
      {
        System.out.println("Invalid PIN !!! Please Enter Four-Digit PIN-Number\nHint :- 1111\nChance Remaining = "+(chance-time));
      }      
      time++;
    }while(time<=4);
    if(time==5)
    {
      System.out.println("You are under CC TV... your footage is taken... please contact customer care as soon as possible.");
    }
    sc.close();
  }
}
