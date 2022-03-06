// 벌집
package Beakjoon.Level8;

import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int cnt = 1;
        int range = 2;

        if(n == 1){
            System.out.println(1);
        }
        else {
            while(range <= n) { // 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * cnt);   // 다음 범위의 최솟값으로 초기화
                cnt++;  
            }
            System.out.println(cnt);
        }



    }
}
