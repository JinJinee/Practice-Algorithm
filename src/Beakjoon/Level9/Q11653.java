// 소인수분해
package Beakjoon.Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11653 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = 2;

        if (N == 1) {
            System.out.println();
        } else {
            while (N > 1) {
                if (N % num == 0) {
                    System.out.println(num);
                    N = N / num;
                } else {
                    num++;
                }
            }
        }
    }

}
