import java.util.Scanner;
public class TryTarifa{

public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int megaAllow=scan.nextInt();
int months=scan.nextInt();
int sum=0;
int iterate=0;
do{


int i=scan.nextInt();
sum=sum+i;
++iterate;
if(iterate==months)
break;
}while(scan.hasNextInt() && iterate<months);


int allowed=megaAllow*(months+1);
int remain=allowed-sum;

System.out.print(remain);
}
}