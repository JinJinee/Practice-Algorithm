// 알파벳 찾기
package Beakjoon.Level7;

import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] result = new int[26];
        
        // -1로 채워진 배열생성
        for (int i=0; i<result.length; i++){
            result[i] = -1;
        }

        // string값 입력받음
        String str = scan.next();
        
        for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i)-97;    // 위치 찾기
            if(result[idx] == -1) {        // 위치에 값이 수정돼 있지 않은 경우 수정
                result[idx] = i;
            }            
        }

        // 출력
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
    }
}
