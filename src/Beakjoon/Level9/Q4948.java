// 베르트랑 공준
package Beakjoon.Level9;

import java.util.Scanner;

public class Q4948 {
    public static boolean[] prime;

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for(int i=2; i<=Math.sqrt(prime.length); i++) {
            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int cnt = 0;
            int n = sc.nextInt();
            if(n == 0) break;

            prime = new boolean[2*n+1]; // 0~2*n
            get_prime();

            for(int i=n+1; i<=2*n; i++){
                if(!prime[i]) cnt++;
            }
            System.out.println(cnt);
        }
    }

    
    
}
