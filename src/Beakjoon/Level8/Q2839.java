// 설탕 배달
package Beakjoon.Level8;

import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // 설탕의 무게
        int n = sc.nextInt();
        // 봉지의 개수
        int cnt = 0;

        // 설탕이 모두 들어갈 때까지 반복
        while(true){
            // 5의 배수인지 확인
            if(n%5==0){
                cnt += n/5;   // 5의 몫
                System.out.println(cnt);
                break;
            }
            else {
                n -= 3;
                cnt++;
            }
            if(n < 0){
                System.out.println(-1);
                break;
            }
        }
    }
}
