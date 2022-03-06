// 윤년
package Beakjoon.Level2;
import java.util.*;

public class Q2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();    // 연도를 입력받음

        if((year%4 == 0) && ((year%100 != 0) || (year% 400 == 0))){   // 4의 배수 이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
            System.out.println(1);      // 윤년일 경우  
        } else {
            System.out.println(0);      // 윤년이 아닌 경우
        }
    }
    
}