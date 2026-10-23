import java.util.Scanner;

public class FairDevision{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count1 = 0;
            int count2 = 0;
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 1) count1++;
                else count2++;
                sum += x;
            }
            
            // 1. Sum odd hai to impossible
            if (sum % 2 != 0) {
                System.out.println("NO");
            } 
            // 2. Sum even hai par sirf 2 wali candies hai aur half odd hai
            else {
                int half = sum / 2;
                if (half % 2 == 1 && count1 == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}