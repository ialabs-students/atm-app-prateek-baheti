import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class assignment4{
    int twoThousands, fiveHundreds, twoHundreds, hundreds ;
    int total_amount=0;
    int withdraw_amount=0;
    public  void deposit()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no of 2000s ");
        twoThousands=sc.nextInt();
        System.out.println("enter the no of 500s ");
        fiveHundreds=sc.nextInt();
        System.out.println("enter the no of 200s ");
        twoHundreds=sc.nextInt();
        System.out.println("enter the no of 100s ");
        hundreds=sc.nextInt();
        if(twoThousands<0 || twoHundreds<0||fiveHundreds<0||hundreds<0)
        {
            System.out.println("incorrect deposite amount");
        }
        else if(twoThousands==0 && twoHundreds==0&&fiveHundreds==0&&hundreds==0)
        {
            System.out.println("deposite amount cannot be zero");
        }
        else{
            int total_2000s=twoThousands*2000;
            int total_500s=fiveHundreds*500;
            int total_200s=twoHundreds*200;
            int total_100s=hundreds*100;
            total_amount=total_100s+total_2000s+total_200s+total_500s;
            System.out.println("Balance:"+" "+"2000s="+twoThousands+" "+"500="+fiveHundreds+" "+"200="+twoHundreds+" "+"100="+hundreds);
        }
        System.out.println("your total amount is"+total_amount);
        menu();

    }
    public void withdraw()
    {
        int left_amount=0;
        System.out.println("enter how much amount you have to withdraw");
        Scanner sc=new Scanner(System.in);
        int withdraw_amount=sc.nextInt();
        
        if(withdraw_amount>total_amount)
        {
            System.out.println("Insufficent balance");
        }
        else {
            left_amount=total_amount-withdraw_amount;
            total_amount=left_amount;
            while(left_amount!=0)
            {
                
                if(left_amount>2000)
                {
                    twoThousands=left_amount/2000;
                    left_amount=left_amount-twoThousands*2000;
                }
                else if(left_amount>500)
                {
                    fiveHundreds=left_amount/500;
                    left_amount=left_amount-fiveHundreds*500;
                    
                }
                else if(left_amount>200)
                {
                    twoHundreds=left_amount/200;
                    left_amount=left_amount-twoHundreds*200;

                }
                else {
                    hundreds=left_amount/100;
                    left_amount=left_amount-hundreds*100;
                }
            }
            System.out.println("Balance:"+" "+"2000s="+twoThousands+" "+"500="+fiveHundreds+" "+"200="+twoHundreds+" "+"100="+hundreds);
            System.out.println("your total amount left is "+total_amount);

        }

    }
    public void menu()
    {
        System.out.println("plz enter the choice \n press 1. for depositing the money \n press 2. for withdraw your money ");

        
        Scanner sc=new Scanner (System.in);
        int option=sc.nextInt();
        switch(option)
        {
            case 1:
            deposit();
            break;
            case 2:
            withdraw();
            break;
        }
    }
    
    public static void main(String[] args) {
        
       assignment4 object=new assignment4();
        object.menu();

    }
}