// ACM 호텔
package Beakjoon.Level8;

import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스
        int T = sc.nextInt();

        for (int i=0; i<T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            // 층수구하기
            int floor;
            if(N%H == 0){
                floor = H;
            } else {
                floor = N % H;
            }

            // 호수구하기
            int room;
            if(N % H == 0){
                room = N / H;
            }
            else {
                room = N / H + 1;
            }

            if(room < 10){
                System.out.println(floor + "" + 0 + room);
            }
            else{
                System.out.println(floor + "" + room);
            }
        }
    }
}
