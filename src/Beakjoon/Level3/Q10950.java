// A+B - 3
package Beakjoon.Level3;
import java.util.*;

public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();     // 테스트 개수 T

        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();    
            System.out.println(a+b);
        }
    }    
}
