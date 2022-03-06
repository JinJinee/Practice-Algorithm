// 분수찾기
package Beakjoon.Level8;

import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // X번째 분수
        int X = sc.nextInt();
        
        int cross_count = 1, pre_count_sum = 0;

        while(true){
            if(X <= pre_count_sum + cross_count){
                if(cross_count%2 == 1) { // 대각선의 개수가 홀수면
                    // 분모가 큰 수부터 시작
                    // 분모는 대각선 개수 - (X번째  - w)

                }


            }
            else {
                pre_count_sum += cross_count;
                cross_count++;
            }

        }


        

        
    }
    
}
