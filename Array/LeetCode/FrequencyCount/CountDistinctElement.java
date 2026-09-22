import java.util.*;
public class CountDistinctElement
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
       for(int i=0;i<n;i++){
           int freq=0;
           for(int j=0;j<n;j++){
               if(arr[i]==arr[j]){
                   freq++;
               }
           }
           if(freq==1){
               count++;
           }
       }
        System.out.println(count);
	}
}