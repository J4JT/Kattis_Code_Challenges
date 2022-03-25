import java.util.Scanner;
public class TryAutori {
public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
String forScience=scan.nextLine();

char[] temp=forScience.toCharArray();
String name="";
for(int i=0;i<temp.length;i++){
if (i==0)
name=name+temp[0];
if(temp[i]=='-')
name=name+temp[i+1];
}
System.out.println(name);


}

}
