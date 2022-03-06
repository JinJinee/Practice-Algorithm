// 크로아티아 알파벳
package Beakjoon.Level7;

import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'c') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') { // c=
                        i++;
                    } else if (s.charAt(i + 1) == '-') { // c-
                        i++;
                    }
                }
            } else if (ch == 'd') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'z') {
                        if (i < s.length() - 2) {
                            if (s.charAt(i + 2) == '=') { // dz=
                                i += 2;
                            }
                        }
                    } 
                    else if (s.charAt(i + 1) == '-') { // d-
                        i++;
                    }
                }
            } else if (ch == 'l') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'j') { // lj
                        i++;
                    }
                }
            } else if (ch == 'n') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'j') { // nj
                        i++;
                    }
                }
            } else if (ch == 's') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') { // s=
                        i++;
                    }
                }
            } else if (ch == 'z') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') { // z=
                        i++;
                    }
                }
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}
