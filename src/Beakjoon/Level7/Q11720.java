// 숫자의 합
package Beakjoon.Level7;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String strNum = scan.next();

        int sum = 0;

        for(int i=0; i<N; i++){
            sum += strNum.charAt(i)-'0';
        }

        System.out.println(sum);
        
    }
}
