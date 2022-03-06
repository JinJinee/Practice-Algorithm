// A+B - 4
package Beakjoon.Level4;
import java.util.*;

public class Q10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {   // 입력값이 들어올 때까지 while문 내부가 실행되지 않음.
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
