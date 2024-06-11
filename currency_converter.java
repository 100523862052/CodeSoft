import java.util.Scanner;

public class currency_converter {
    static Scanner s=new Scanner(System.in);
    static float Usa=83.36f;
    static float euro=90.47f;
    static float ruble=0.92f;
    
    static String Dollar,Euro,Ruble;
    static void   usa(int rupee){
        System.out.println(">>>>>>USA>>>>>>TO>>>>>>INDIA\n>>>>>INDIA>>>>>>TO>>>>>>USA");
        System.out.println("1 dollar =rs "+Usa);
        System.out.println("Select 0 t0 change rupees and 1 for dollars!.......");
          int n=s.nextInt();
        if(n!=1&&n==0){

           float dollar1=rupee*Usa;
           System.out.println("User asked to change USA dollar into Indian rupee "+"\nRs"+dollar1);
        }else{
            float dollar2=rupee/Usa;
            System.out.println("User asked to change Indian  rupee into USA dollar"+"\n'$'"+dollar2);
        }
    }   
    static void   germany(int rupee1){
        System.out.println(">>>>>>Germany>>>>>>TO>>>>>>INDIA\\n" + ">>>>>INDIA>>>>>>TO>>>>>>GERMANY");
          System.out.println("1 Euro =rs "+euro);
          System.out.println("select 0 to change indian rs and 1 for euros....");
        int n=s.nextInt();
         if(n!=1&&n==0){
            
            float euro2=rupee1/euro;
            System.out.println("User asked to change Germany euro into Indian rupee"+"\n'rs"+euro2);

         }  else{
            float euro2=rupee1/euro;
            System.out.println("User asked to change Indian  rupee into Germany euro"+"\n'euro'"+euro2);
         }
         
    }
   static void  russia(int rupee2){
        System.out.println(">>>>>>Germany>>>>>>TO>>>>>>INDIA\n" +">>>>>INDIA>>>>>>TO>>>>>>GERMANY");
        System.out.println("1 Ruble =rs "+ruble);
        System.out.println("select 0 to change indian rs and 1 for ruble....");
        int n=s.nextInt();
         if(n!=1&&n==0){
            float ruble1=rupee2*ruble;
            System.out.println("User asked to change Russian ruble into Indian rupee"+"\n'ruble'"+ruble1);
        }else{
            float ruble2=rupee2/ruble;
            System.out.println("User asked to change Indian rupee into Russian ruble"+"\n'rs'"+ruble2);
        }
    } 
    public static void main(String[] args) {
        System.out.println("INDIA currency is 'rupee'");
        System.out.println("For converting currency into various country\n1.USA\n2.Germany\n3.Russia"); 
       
                System.out.println("Dollar,Euro,Ruble is enter a'String' whether user want to convert indian currency to which currency ");
                int choice=s.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Enter INDIAN money to convert into USA");
            int currency=s.nextInt();
              usa(currency);
                break;
            case 2:
            System.out.println("Enter INDIAN money to convert into GERMANY");
            int currency1=s.nextInt();
                germany(currency1);
                  break;
            case 3:
            System.out.println("Enter INDIAN money to convert into RUSSIA");
            int currency2=s.nextInt();
                 russia(currency2);
                   break; 
            default:
                System.out.println("You have entered wromg country");
                System.out.println("And you are exit from the bank\nThank you");
                System.exit(0);
                break;
          }
    }
}
