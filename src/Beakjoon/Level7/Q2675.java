// 문자열 반복
package Beakjoon.Level7;

import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        // T만큼 반복
        for(int i=0; i<T; i++){

            int R = scan.nextInt();
            String S = scan.next();
            
            // S 길이만큼 반복
            for(int j=0; j<S.length(); j++){
                // R 개수만큼 출력
                for(int k=0; k<R; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
