import java.util.*;
public class LCFindAllNumberDissapearedFromArray
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            ArrayList<Integer> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                result.add(i);
            }
        }
        System.out.println("missing number "+result);
	}
}