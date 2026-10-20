import java.util.*;
public class EqualCandies{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){
            int t= input.nextInt();
            while(t-->0){
                int n= input.nextInt();
                int[] arr= new int[n];
                int count=0;
                for(int i=0; i<n; i++){
                    arr[i]=input.nextInt();
                    count+=arr[i];
                }
                Arrays.sort(arr);
                count=count-(arr[0]*n);
                System.out.println(count);
            }
        }
        input.close();
    }
}