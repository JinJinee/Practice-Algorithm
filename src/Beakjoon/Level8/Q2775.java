// 부녀회장이 될테야
package Beakjoon.Level8;

import java.util.Scanner;

public class Q2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트케이스
        int T = sc.nextInt();

        int[][] apt = new int[15][15];
        
        for(int i=0; i<=apt.length; i++){
            apt[0][i] = i;
            apt[i][1] = 1;
        }

        // 층
        int k = sc.nextInt();
        // 호
        int n = sc.nextInt();

        for(int i=0; i<k; i++){
            for(int j=1; j<=n; j++){
                apt[i][j] += j;
            }

        }

    }
}
