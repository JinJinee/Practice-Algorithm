// 골드바흐의 추측
package Beakjoon.Level9;

import java.util.Scanner;

public class Q9020 {
    public static boolean[] prime;

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for(int i=2; i<=Math.sqrt(prime.length); i++) {
            for(int j=i*i; j<prime.length; j += i) {
                prime[j] = true;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스
        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            // 숫자 입력
            int n = sc.nextInt();
            // 숫자 길이만큼 배열 생성
            prime = new boolean[n+1];
            // 소수 판별
            get_prime();

            // n을 반으로 나눈다
            int halfN = n/2;

            if(!prime[halfN]) {  // 2로 나눈값이 소수라면
                System.out.println(n/2 + " " + n/2);
            }
            else {  // 소수가 아니라면 
                int tmp = 1;
                while(true) {
                    if(prime[halfN-tmp] == false && prime[halfN+tmp] == false) {
                        System.out.println((halfN-tmp) + " " + (halfN+tmp));
                        break;
                    }
                    else{
                        tmp++;
                    }
                }
            }
        }


    }
    
}
