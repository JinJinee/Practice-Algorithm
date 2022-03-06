// 한수
package Beakjoon.Level6;

import java.util.Scanner;

public class Q1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(hansu(sc.nextInt()));
        sc.close();
    }

    public static int hansu(int num) {
        int cnt = 0;

        if (num < 100) {
            return num;
        }

        else {
            cnt = 99;
            // 에외처리
            if (num == 1000) {
                num = 999;
            }

            for (int i = 100; i <= num; i++) {
                int hun = i / 100; // 일의 자리수
                int ten = (i / 10) % 10; // 십의 자리수
                int one = i % 10; // 백의 자리수
                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }
        return cnt;

    }
}
