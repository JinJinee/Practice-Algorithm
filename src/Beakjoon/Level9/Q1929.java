// 소수 구하기
package Beakjoon.Level9;

import java.util.Scanner;

public class Q1929 {
    public static boolean[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        prime = new boolean[N+1]; // 0~N
        get_prime();

        for(int i=M; i<=N; i++){
            if(!prime[i]) {
                System.out.println(i);
            }
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
