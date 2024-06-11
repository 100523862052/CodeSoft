
import java.util.Scanner;

public class caculator {
     public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
       System.out.println("_____CALCULATOR FOR PRINTING STUDENT MARKS______");
       
       
       
       System.out.println("Enter subjects of a student in calculator=");
        int m=n.nextInt();
      int []a=new int[m];
      

        
        
        System.out.println("Enter subjects marks=");
        for(int i=0;i<a.length;i++){
          a[i]=n.nextInt();
        }
         int k=0;
        for(int i=0; i<a.length; i++){
          k+=a[i];
           }
       // System.out.println("Total marks obtained="+k);
       float percentage=(k/m);
      
       int count=0; 
       for(int i=0;i<a.length;i++){
        if(a[i]<40){
          count++;
        }
        }
       System.out.println();
       System.out.println();
       System.out.println("________STUDENT_DETAILS_____&______MEMO_______");
       if(count!=0){
        System.out.println("Then student failed in "+count+" subjects");
       } else{
       if(percentage>=85&&percentage<=100){
        System.out.println("Student secured S grade "+percentage+"%");
        
       } else if(percentage>=75&&percentage<85){
        System.out.println("Student secured A grade "+percentage+"%");
       } else if(percentage>=50&&percentage<75){
        System.out.println("Student secured B grade "+percentage+"%");
       }  else{ if(percentage<50&&percentage>=40)
        System.out.println("Student secured C grade "+percentage+"%");
       }
      }
      
      System.out.println("Total marks obtained="+k);
  
     //System.out.println("percentage of student "+percentage);  

      }
      
    }
    

