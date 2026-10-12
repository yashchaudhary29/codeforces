import java.util.*;

class ICPCBalloons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int t = input.nextInt();
            while (t-- > 0) {
                int n = input.nextInt();
                String s = input.next();
                
                Set<Character> solved = new HashSet<>();
                int count = 0;
                
                for (int j = 0; j < n; j++) {
                    char ch = s.charAt(j);
                    if (solved.contains(ch)) {
                        count += 1;
                    } else {
                        solved.add(ch);
                        count += 2;
                    }
                }
                System.out.println(count);
            }
        }
        input.close();
    }
}