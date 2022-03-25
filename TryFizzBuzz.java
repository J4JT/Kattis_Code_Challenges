import java.util.Scanner;
public class TryFizzBuzz{
   public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      int first=scan.nextInt();
      int second=scan.nextInt();
      int counter=scan.nextInt();
      scan.close();
   
      for(int i=1;i<=counter;i++){
      
            if(i%first==0 && i%second!=0 )
            System.out.println("Fizz");
           else if(i%second==0 && i%first!=0)
            System.out.println("Buzz");
      
           else if(i%first==0 && i%second==0)
            System.out.println("FizzBuzz");
            else
            System.out.println(i);
            
            }
      
   
   }
}
