/**
 * Problem : Maximum Multiple Sum
 * Problem link: https://codeforces.com/problemset/problem/1985/B

 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
public class MaximumMultipleSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        if(line==null) return;
        int t = Integer.parseInt(line.trim());
        while(t-->0){
            line =br.readLine();
            int n= Integer.parseInt(line.trim());
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int i=2; i<=n; i++){
                int count=0;
                int j=1;
                while(i*j<=n){
                    count+=i*j;                 
                    j++;                  
                }
                map.put(count,i);
            }
            int maxSum=Collections.max(map.keySet());
            int x=map.get(maxSum);
            System.out.println(x);
        }

    }
}
