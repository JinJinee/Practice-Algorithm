// 터렛
package Beakjoon.Level9;

import java.util.Scanner;

public class Q1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
        }
    }

    public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distance_pow = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));  
        
        // -1: 중점이 같으면서 반지름도 같은 경우
        if(x1==x2 && y1==y2 && r1==r2) {
            return -1;
        } 
        // 0: 두 원의 반지름 합보다 중점감 거리가 더 길 때
        else if(distance_pow > Math.pow(r2+r1, 2)) {
            return 0;
        }
        // 0: 원안에 있으나 내점하지 않을 때
        else if(distance_pow < Math.pow(r2-r1, 2)) {
            return 0;
        }
        // 1: 내접할 때
        else if(distance_pow == Math.pow(r2-r1, 2)) {
            return 1;
        }
        // 1: 외접할 때
        else if(distance_pow == Math.pow(r1+r2, 2)){
            return 1;
        }
        else {
            return 2;
        }

    }
    
}
