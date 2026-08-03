import java.util.*;
class PerimeterOfRectangle{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Length");
int length =sc.nextInt();
System.out.println("Enter Width");
int width=sc.nextInt();
int perimeter=2*(length+width);
System.out.println("perimeter is:"+perimeter);
}
}
