import java.util.Scanner;

public class PracticeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp = 0;
        int curr = 0;
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
            }
            for ( int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (arr[i][j] == 0) {
                        temp++;
                    }
                    if (temp == y) {
                        curr += temp;
                    }

                }
            }
        System.out.println(curr*2);
        }

    }

