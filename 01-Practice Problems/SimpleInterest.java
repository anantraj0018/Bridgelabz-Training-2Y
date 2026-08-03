import java.util.*;
class SimpleInterest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Principal");
double principal=sc.nextDouble();
System.out.println("Enter Rate");
double rate=sc.nextDouble();
System.out.println("Enter Time");
int time=sc.nextInt();
double simpinte=(principal*rate*time)/100;
System.out.println("SimpleInterest is:"+simpinte);
}
}