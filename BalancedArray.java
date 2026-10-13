import java.util.*;
class BalancedArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){
            int t= input.nextInt(); 
            while(t-->0){
                int n=input.nextInt();
                int[] arr = new int[n];
                int c1=0, c2=0;
                if(n%4==0){
                    System.out.println("YES");
                    for(int i=0; i<n/2; i++){
                        arr[i]=(i+1)*2;
                        c1+=arr[i];
                    }
                    for(int i=0; i<(n/2)-1; i++){
                        arr[(n/2)+i]=(i*2)+1;
                        c2+=arr[(n/2)+i];
                    }
                    arr[n-1]=c1-c2;
                    for(int i=0; i<n; i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println("");
                }else{
                    System.out.println("NO");
                }
                
            }
        }
    }
}