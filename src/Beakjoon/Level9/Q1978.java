// 소수 찾기
package Beakjoon.Level9;

import java.util.Scanner;

public class Q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(isPrime(num)) cnt++;
        }
        System.out.println(cnt);
    }

    // 소수인 경우 true, 아닌 경우 false
    public static boolean isPrime(int num) {
        // 1은 소수가 아니다.
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}