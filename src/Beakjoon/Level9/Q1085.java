// 직사각형에서 탈출
package Beakjoon.Level9;

import java.util.Scanner;

public class Q1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int t1 = w - x;
        int t2 = h - y;

        if(t1 > x) t1 = x;
        if(t2 > y) t2 = y;

        if(t1 > t2) System.out.println(t2);
        else System.out.println(t1);
    }
    
}
