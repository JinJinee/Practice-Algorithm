// 더하기 사이클
package Beakjoon.Level4;
import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        int i = 0;

        while(true){
            tmp = (tmp%10)*10 + (tmp/10 + tmp%10)%10;  
            i++;
            if (tmp == n){
                break;
            }
        }
        System.out.println(i);  
    }
}


