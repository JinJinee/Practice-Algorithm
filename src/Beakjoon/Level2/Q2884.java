// 알람 시계
package Beakjoon.Level2;
import java.util.*;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int tmp = m - 45;

        if (tmp >= 0){
            System.out.printf("%d %d", h, tmp);
        } else {
            if (h == 0) {
                h = 23;
            } else {
                h -= 1;
            }
            System.out.printf("%d %d", h, tmp+60);
        }
    }
}
