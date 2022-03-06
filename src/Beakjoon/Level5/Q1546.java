// 평균
package Beakjoon.Level5;

import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;               // 최대값
        int n = sc.nextInt();    // 과목의 개수
        int[] score = new int[n];
        double total = 0;

        for(int i=0; i<n; i++){
            score[i] = sc.nextInt();
        }
        sc.close();

        for(int i : score){
            if(i > max){
                max = i;
            }
        }
        
        for(int i : score){
            total += (float)i/(float)max*100;
        }
        System.out.println(total/n);
        
    }
    
}
