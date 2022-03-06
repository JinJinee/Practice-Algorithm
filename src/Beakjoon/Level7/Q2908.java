// 상수
package Beakjoon.Level7;

import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n1 = scan.next();
        String n2 = scan.next();

        // 상수 숫자 저장 변수
        String sNum1 = "";
        String sNum2 = "";

        // 입력받은 값을 상수 숫자로 바꾼다
        for(int i=2; i>=0; i--){
            sNum1 += (char)n1.charAt(i);
            sNum2 += (char)n2.charAt(i);
        }

        // string -> int 숫자 크기비교하고 출력
        if(Integer.parseInt(sNum1) > Integer.parseInt(sNum2)) 
            System.out.println(sNum1);
        else
            System.out.println(sNum2);



    }

    
}
