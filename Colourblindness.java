/**
problem : ColourBlindness
code link:https://codeforces.com/problemset/problem/1722/B
*/

import java.util.*;
public class Colourblindness{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){
            int t=input.nextInt();
            while(t-->0){
                int n=input.nextInt();
                String s1=input.next().toLowerCase();
                String s2=input.next().toLowerCase();
                boolean check=false;
                for(int i=0;i<n; i++){
                    if((s1.charAt(i)=='r' && s2.charAt(i)=='b')||(s1.charAt(i)=='r' && s2.charAt(i)=='g')||(s1.charAt(i)=='b' && s2.charAt(i)=='r')||(s1.charAt(i)=='g' && s2.charAt(i)=='r')){
                        check=true;
                        break;
                    }
                }
                if(check){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
    }
}
