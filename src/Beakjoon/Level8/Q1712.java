// 손익분기점
package Beakjoon.Level8;

import java.util.Scanner;

public class Q1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();    // 고정비용(A)
        int B = sc.nextInt();    // 가변비용(B)
        int C = sc.nextInt();    // 노트북가격(C)

        if(B >= C) {
            System.out.println(-1);    // 손익분기점이 없는 경우
        } else {
            System.out.println(A/(C-B)+1);
        }
        
    } 
}
