import java.util.Scanner;

public class atminterafcess {
    static Scanner s=new Scanner(System.in);
    static int balance= 1500;
   
   
    public static void withdrawingmoney(){
    System.out.println("Enter a amount for withdrawing ");
    
    int withdraw=s.nextInt();
        
    if(balance<withdraw){
        System.out.println("Insufficient amount in your account");
    } else{
      balance=balance-withdraw;
       System.out.println("Amount withdrawn from your account "+withdraw);
    } 
    System.out.println("Thank You");
   }
      static void Deposit(){
        System.out.println("Adding money in your bank account");
        int amount_adding=s.nextInt();
            balance=balance+amount_adding;
            System.out.println("Money deposited in your account"+"\n Thank you");
      }
       
      static void Check_balance(){
        System.out.println("Checking balance amount in your account ");
        System.out.println(balance+"\n Thank you");
        
      }
      static void exit(){
        System.out.println("Exit from your account "+"\n Thank you");
        
      }

public static void main(String[] args) {
       
        
         
       
        while(true){
            
            System.out.println("1.Withdraw\n 2.Deposit\n 3.Check Balance\n 4.EXIT");
            int choice =s.nextInt();
            switch (choice) {
                case 1:
                    withdrawingmoney();                   
                    break;
                case 2:
                    Deposit();
                    break;
                case 3:
                     Check_balance();
                     break;
                case 4:
                  exit();
                  System.exit(0);
                  break;
                default: 
                System.out.println("Invalid input ");
                    break;
                    
            }  
        }
        }
    }
    

