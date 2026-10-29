/**
 * Problem: Your Name
 * Problem link: https://codeforces.com/problemset/problem/2167/B
 * 
 */

import java.util.*;
public class YourName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        if(input.hasNextInt()){
            int q = input.nextInt();
            while(q-->0){
                int n=input.nextInt();
                String s=input.next();
                String t=input.next();
                ArrayList<Character> list=new ArrayList<>();
                for(int i=0; i<n; i++){
                    list.add(s.charAt(i));
                }
                YourName yn = new YourName();
                boolean check= yn.isPresent(list, t);
                if(check){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
    public boolean isPresent(ArrayList<Character> list, String t){
        if(list.size()!=t.length()){
            return false;
        }
        else{
            ArrayList<Character> Slist= new ArrayList<>(list);
            Collections.sort(Slist);
            char[] ch= new char[t.length()];
            for(int i =0;i<t.length(); i++){
                ch[i]=t.charAt(i);
            }
            Arrays.sort(ch);
            for(int i=0; i< ch.length; i++){
                if(Slist.get(i)!=ch[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
