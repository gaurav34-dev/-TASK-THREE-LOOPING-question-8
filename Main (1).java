import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      while(true)
        {   
          Scanner s=new Scanner(System.in);
          System.out.println("enter a year");
          int year= s.nextInt();
          if(year%400==0||(year%4==0 && year%100!=0))
          {
            System.out.println(year +" is leap year");
          }
          else{
            System.out.println(year+" is not a leap year");
          }
          
        }



      
    }
}

  