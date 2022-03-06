// X보다 작은 수
package Beakjoon.Level3;

import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){       // 배열 생성
            int a = sc.nextInt();
            arr[i] = a;
        }
        
        for(int i=0; i<n; i++){       // x값과 비교. x보다 작으면 출력
            if(arr[i] < x){
                System.out.println(arr[i]);
            }
        }
    }    
}
