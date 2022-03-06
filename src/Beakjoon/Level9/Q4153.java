// 직각삼각형
package Beakjoon.Level9;

import java.util.Scanner;

public class Q4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==0 && b==0 && c== 0) break;
            boolean result = right_triangle(a, b, c);

            if(result == true) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
    
    
    public static boolean right_triangle(int a, int b, int c) {
        if(a > b){
            if(a > c) {
                return Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2);
            }
            else {
                return Math.pow(c,2) == Math.pow(b,2) + Math.pow(a,2);
            }
        } else if(b > c) {
                return Math.pow(b,2) == Math.pow(a,2) + Math.pow(c,2);
        } else {
                return Math.pow(c,2) == Math.pow(b,2) + Math.pow(a,2);
        }
    }
}
