// 단어 공부

package Beakjoon.Level7;

import java.util.Scanner;


public class Q1157 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[26];
        
        // 문자입력
        String str = scan.next();
        // 소문자로 변환
        str = str.toLowerCase();

        int max = 0;
        char ch = '?';
        // 배열에 개수 추가
        for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i)-97;
            arr[idx]++;
            if(arr[idx] > max) {
                max = arr[idx];
                ch = (char) (idx + 65) ;
            } else if (arr[idx] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
