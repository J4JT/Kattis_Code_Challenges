import java.util.Scanner;
import java.lang.Math;
public class TryFaktor{
public static void main(String[] args)
{
Scanner select=new Scanner(System.in);

int pub=select.nextInt();
int goal=select.nextInt();
select.close();

double bribes=pub*(goal-0.99);
int roar=(int)Math.ceil(bribes);
System.out.println(roar);


}
}