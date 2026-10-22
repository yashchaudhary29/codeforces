import java.util.*;
public class SequenceGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        if(input.hasNextInt()){
            int t=input.nextInt();
            while(t-->0){
                int n=input.nextInt();
                long[] arr=new long[n];
                for(int i=0; i<n; i++){
                    arr[i]=input.nextLong();
                }
                ArrayList<Long> ans=new ArrayList<>();
                ans.add(arr[0]);
                for(int i=1;i<n; i++){
                    if(arr[i]<arr[i-1]){
                        ans.add(arr[i]);
                    }
                    ans.add(arr[i]);
                }
                System.out.println(ans.size());
                StringBuilder sb = new StringBuilder();
                for (long val : ans) {
                    sb.append(val).append(" ");
                }
                System.out.println(sb);
            }
        }
        input.close();
    }
}
