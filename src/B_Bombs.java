import java.util.*;

public class B_Bombs  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        char B[][] = new char[R][C];
        for (int i = 0; i < R; i++) {
            B[i] = scanner.next().toCharArray();
        }
        scanner.close();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (B[i][j] != '#' && B[i][j] != '.') {
                    for (int k = 0; k < R; k++) {
                        for (int l = 0; l < C; l++) {
                            bomb(B, i, j, k, l);
                        }
                    }
                    B[i][j] = '.';
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(B[i][j]);
            }
            System.out.println();
        }
    }
    
    private static void bomb(char B[][], int i, int j, int k, int l) {
        if (Character.getNumericValue(B[k][l])==-1 && (Math.abs(i-k)+Math.abs(j-l)) <= Character.getNumericValue(B[i][j])) {
            B[k][l] = '.';
        }
    }
}

