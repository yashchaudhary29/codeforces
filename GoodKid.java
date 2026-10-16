
import java.util.*;

public class GoodKid{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        if(input.hasNextInt()){
            int t=input.nextInt();
            while(t-->0){
                int n=input.nextInt();
                int[] arr=new int[n];
                for(int i=0; i<n; i++){
                    arr[i]=input.nextInt();
                }
                Arrays.sort(arr);
                arr[0]+=1;
                int count=1;
                for(int i=0; i<n; i++){
                    count*=arr[i];
                }
                System.out.println(count);
            }
        }
        input.close();
    }
}