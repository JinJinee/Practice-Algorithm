// 숫자의 개수
package Beakjoon.Level5;

import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];   // 0~9까지 각 개수를 저장할 수 있는 배열생성

        int mutiple = sc.nextInt() * sc.nextInt() * sc.nextInt();

        while(mutiple != 0){
            numArr[mutiple%10]++;
            mutiple/=10;
        } 
     

        for(int i=0; i<numArr.length; i++){         // 0~9까지 비교하기 위해 numArr길이만큼 돈다.
            System.out.println(numArr[i]);
        }
        
    }
}


// result.charAt()-'0';