// 수 정렬하기
package Beakjoon.Level12_sort;

import java.util.Arrays;
import java.util.Scanner;

// N개의 수가 주어졌을 때,
// 오름차순으로 정렬하는 프로그램을 작성하시오.
public class Q2750{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 숫를 받을 리스트 생성
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        // 오름차순으로 정렬
        // 퀵정렬을 사용해보자.
        
    }

}