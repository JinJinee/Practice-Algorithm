// 최소, 최대
package Beakjoon.Level5;

import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            int tmp = sc.nextInt();
            arr[i] = tmp;
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
