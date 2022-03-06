// 달팽이는 올라가고 싶다
package Beakjoon.Level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        
        // A - B : 하루에 올라간 거리
        // A - B + A : 하루 + 다음날 낮에 올라간 거리
        // (A-B)+A, (A-B)+(A-B)+A, ...
        // x일 낮에 도착: (A-B)*(x-1)+A
        // V = (A-B) * (x-a) + A
        // x = (V-B) / (A-B)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 올라가는 거리
        int A = Integer.parseInt(st.nextToken());
        // 내려가는 거리
        int B = Integer.parseInt(st.nextToken());
        // 나무 막대 길이
        int V = Integer.parseInt(st.nextToken());

        // 날자 계산
        int day = (V-B) / (A-B);

        if((V-B)%(A-B) != 0){
            day++;
        }

        bw.write(day+"\n");
        bw.flush();
        bw.close();
    }
}
