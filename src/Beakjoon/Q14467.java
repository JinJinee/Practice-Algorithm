package Beakjoon;
// 소가 길을 건너간 이유 1

import java.util.Scanner;

// 소는 10마리

public class Q14467 {
    public static void main(String[] args) {
        int[] cows = new int[10];

        for(int i=0; i<cows.length; i++){
            cows[i] = -1;
        }

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 0;

        // N번 관찰한다!
        for(int i=0; i<N; i++){
            int cowNum = sc.nextInt();
            int location = sc.nextInt();

            if(cows[cowNum -1] == -1){
                cows[cowNum-1] = location;
            }else{
                if(cows[cowNum-1] != location){
                    cnt++;
                }
                cows[cowNum-1] = location;
            }
        }

        System.out.println(cnt);
    }
}
