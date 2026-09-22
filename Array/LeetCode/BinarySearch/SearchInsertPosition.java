import java.util.*;
public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int st=0;
        int end=n-1;
        int target=sc.nextInt();
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
              System.out.println(mid);
              return;
            }
            else if(arr[mid]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(st);
        
    }
}