import java.util.*;

public class EvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int t = input.nextInt();
            while (t-- > 0) {
                int n = input.nextInt();
                int[] arr = new int[n];
                int wrongEven = 0, wrongOdd = 0;
                for (int i = 0; i < n; i++) {
                    arr[i] = input.nextInt();
                    if (i % 2 != arr[i] % 2) {
                        if (i % 2 == 0) {
                            wrongEven++;
                        } else {
                            wrongOdd++;
                        }
                    }
                }
                if (wrongEven != wrongOdd) {
                    System.out.println(-1);
                } else {
                    System.out.println(wrongEven);
                }
            }
        }
    }
}