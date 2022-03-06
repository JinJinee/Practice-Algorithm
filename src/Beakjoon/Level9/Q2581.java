// 소수
package Beakjoon.Level9;

import java.util.Scanner;

public class Q2581 {
    public static boolean[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        prime = new boolean[N+1];
        get_prime();

        // 소수 합 및 최솟값
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i=M; i<=N; i++) {
            if(prime[i] == false) {
                sum += i;
                if(min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }
        // 소수가 없다면
        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;

        for(int i=2; i<=Math.sqrt(prime.length); i++) {
            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}
