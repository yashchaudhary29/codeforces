import java.util.*;

public class Increasing {
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
                int count=n;
                for(int i=0; i<n-1;i++){
                    if(arr[i]>=arr[i+1]){
                        count--;
                    }
                }
                if(count==n){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        input.close();
    }
    
}
