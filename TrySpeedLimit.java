import java.util.Scanner;
public class TrySpeedLimit{
   public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
   
     
               
      
      while(scan.hasNextInt())         {
       int miles;
      int hours;
      int eclipsedTime=0;
      int sectionHours=0;
      int totalHours=0;
   
      int sectionMiles;
      int total=0;
         int sections=scan.nextInt();
         if (sections<0){
            scan.close();
            break;
         }
      
         for(int i=0;i<sections;i++)
         {
            miles= scan.nextInt();
         
         
            hours= scan.nextInt();
            if(i==0)
            {
               eclipsedTime=eclipsedTime+hours;
               sectionMiles=eclipsedTime*miles;
               total=total+sectionMiles;
            }
         
            if(i>0)
            {
               sectionHours=hours-eclipsedTime;
               eclipsedTime=hours;
               sectionMiles=sectionHours*miles;
               total=total+sectionMiles;
            }
         
         
         
            sectionMiles=miles*sectionHours;
         
            scan.nextLine();
         }
         
           if(total<0)
         total=total*-1;
      if(total>0){
         System.out.println(total+" " + "miles");
      }
    
      }
   
   }
}
