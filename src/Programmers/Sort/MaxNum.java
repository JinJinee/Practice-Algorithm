package Programmers.Sort;

import java.util.Arrays;
import java.util.Comparator;

// 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
// numbers : 0 또는 양의 정수가 담긴 배열

public class MaxNum {
    public static String solution(int[] numbers) {
        String answer = "";

        // 1. 문자열 배열로 변환하기
        String[] str = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            str[i] = Integer.toString(numbers[i]);
        }

        // 2. Comparator 인터페이스 정렬 기준 설정
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });

        // 3. 모든 문자열을 연결한다.
        for(String arr : str){
            answer += arr;
        }

        // 4. 입력 데이터가 모두 0인 경우 예외처리
        if(str[0].equals("0")) answer = "0";
        
        // mySort(str);

        // for(int i=0; i<str.length; i++){
        //     answer += str[i];
        // }

        return answer;
    }

    // public static void swap(int idx1, int idx2, String[] str){
    //     String tmp = str[idx1];
    //     str[idx1] = str[idx2];
    //     str[idx2] = tmp;
    // } 

    // public static void mySort(String[] str){
    //     for(int i=0; i<str.length-1; i++){
    //         for(int j=str.length-1; j>i; j--){
                
    //             // str1 = 3, str2 = 30 j+(j-1) 숫자의 합이 더 크다면 바꾼다.
    //             //                   330                            303
    //             if(Integer.parseInt(str[j]+str[j-1]) > Integer.parseInt(str[j-1]+str[j])){
    //                 swap(j, j-1, str);
    //             }
    //         }
    //     }
    // }

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers));
    }
}
