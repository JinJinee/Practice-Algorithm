// 큰 수 A+B
package Beakjoon.Level8;

import java.math.BigInteger;
import java.util.Scanner;

public class Q10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        A = A.add(B);

        System.out.println(A.toString());
    }
}
