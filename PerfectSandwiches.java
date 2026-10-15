import java.util.*;
class PerfectSandwiches{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){
            int t=input.nextInt();
            while(t-->0){
                int a=input.nextInt();
                int b=input.nextInt();
                if(a<=b){
                    System.out.println(-1);
                }
                else{
                    System.out.println(Math.min(b, a-b));
                }
            }
        }
    }
}