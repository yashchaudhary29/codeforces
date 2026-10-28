/**
 * Problem: Triple
 * Problem Link: https://codeforces.com/problemset/problem/1669/B
 * 
 */

import java.util.*;
public class Triple{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        if(input.hasNextInt()){
            int t=input.nextInt();
            while(t-->0){
                int n=input.nextInt();
                HashMap<Integer, Integer> map =new HashMap<>();
                int[] arr=new int[n];
                for(int i=0; i<n;i++){
                    arr[i]=input.nextInt();
                    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                }
                int ans=-1;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    int element = entry.getKey();  
                    int frequency = entry.getValue(); 
                    if (frequency >= 3) {
                        ans=element;
                        break;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
