// 택시 기하학(맨해튼 거리)
package Beakjoon.Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3053 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double R = Double.parseDouble(br.readLine());

        System.out.println(R * R * Math.PI);
        System.out.println(2 * R * R);
    }

}
