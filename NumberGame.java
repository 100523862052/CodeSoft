import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Hello user welcome to my game\n"+"____Lets_Start_the_Game____");
        //int value=s.nextInt();
        int guessed_number=r.nextInt(100-1)+1;
        int score=100;

        while(true){
            System.out.println("Enter a number range between (1-100)!");
        
        for(int i=0;i<6;i++){
            int number=s.nextInt();
            if(number==guessed_number){
            System.out.println("yes, u have selected a correct number ur score is "+score);
             break;
            }else if(number<guessed_number && number>=1){
                score-=10;
                System.out.println("Enter a number which Greater than user number ");
            } else if(number>guessed_number && number<=100){
                System.out.println("Enter a number which Lower then user number");
                
                score-=10;
            
            } else { 
            System.out.println("Invalid input");
            }
            if(i==5){
            System.out.println("Oops u lost the game ");
            }  
            
        }  System.out.println("Again want to play enter 1\n"+"Otherwise, enter 0");
        int b=s.nextInt();
        if(b!=1){
            System.out.println("Thanks for playing");
            break;
        }
    }  
    }
}   
    
    

