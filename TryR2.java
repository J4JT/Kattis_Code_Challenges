import java.util.Scanner;
public class TryR2{
public static void main(String[] args)
{
Scanner scan1=new Scanner(System.in);
Scanner scan2=new Scanner(System.in);
Scanner sc = new Scanner(System.in);
while (sc.hasNextInt()) {
int R1=sc.nextInt();
int S=sc.nextInt();
int R2=(2*S)-R1;
System.out.println(R2);
}



}

}