package Programmers;
// 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램
// 아이디의 길이는 3자 이상 15자 이하여야 합니다.
// 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
// 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.

import java.util.Arrays;

public class RecommendNewId{

    public static String solution(String new_id) {
        String answer = "";

        // 소문자로 치환
        new_id = new_id.toLowerCase();

        // 소문자(97~122), 숫자(48~57), -, _, . 제외 모든 문자 제거
        for(int i=0; i<new_id.length(); i++){
           
        }

        char a = '-';
        System.out.println((int)a);



        return new_id;
    }

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id));
    }

}