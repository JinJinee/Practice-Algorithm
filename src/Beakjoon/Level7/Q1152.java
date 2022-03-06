// 단어의 개수

package Beakjoon.Level7;

import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int cnt = 1;

        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == ' ') cnt++;
        }

        if(s.charAt(0) == ' ') cnt--;
        if(s.charAt(s.length()-1) == ' ') cnt--;

        System.out.println(cnt);


    }
}
