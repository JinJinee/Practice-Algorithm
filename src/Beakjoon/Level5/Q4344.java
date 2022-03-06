// 평균은 넘겠지
package Beakjoon.Level5;
import java.util.Scanner;

public class Q4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();   // 테스트 케이스

        for(int i=0; i<c; i++){
            int stuNum = sc.nextInt();
            int total = 0;
            double avg = 0; 
            int cnt = 0;
            int[] score = new int[stuNum];

            for(int j=0; j<stuNum; j++){
                score[j] = sc.nextInt();
                total += score[j];
            } avg = (double)total / stuNum;

            for(int j=0; j<stuNum; j++){
                if(score[j] > avg){
                    cnt++;
                }
            } 
            System.out.println(String.format("%.3f",((double)cnt / (double)stuNum)*100) + "%"); 
        }
        sc.close();
    }
}
