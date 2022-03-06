// 곱셈
package Beakjoon.Level1;
import java.util.*;

public class Q2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        int i = 1;

        while (b != 0) {
            System.out.println(a * (b % 10));
            result += (a * (b % 10)) * i;
            b /= 10;
            i *= 10;
        } 
        System.out.println(result);
    }
    
}
