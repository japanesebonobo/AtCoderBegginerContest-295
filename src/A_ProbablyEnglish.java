import java.util.*;

public class A_ProbablyEnglish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.next();
            if (S[i].equals("and") || S[i].equals("not") || S[i].equals("that") || S[i].equals("the") || S[i].equals("you")) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
        scanner.close();
    }
}

