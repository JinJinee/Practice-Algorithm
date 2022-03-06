// 그룹 단어 체커   
package Beakjoon.Level7;

import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 단어의 개수
        int N = sc.nextInt();

        boolean[] alpha;
        int cnt = N;

        for (int i = 0; i < N; i++) {
            alpha = new boolean[26];
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                int idx = str.charAt(j) - 97;

                if (alpha[idx] == false) {
                    alpha[idx] = true;
                } else {

                        if (str.charAt(j-1) == str.charAt(j)) {
                            continue;
                        } else {
                            cnt--;
                            break;
                        }
                    
                }
            }
        }
        System.out.println(cnt);

    }
}
