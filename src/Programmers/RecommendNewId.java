package Programmers;
// 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램
// 아이디의 길이는 3자 이상 15자 이하여야 합니다.
// 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
// 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.

public class RecommendNewId{

    public static String solution(String new_id) {

        // 1. 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2. 소문자(97~122), 숫자(48~57), -(45), _(95), .(46) 제외 모든 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // 3. 마침표(.)가 2번 이상 연속된 부분 하나로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");

        // 4. 마침표가 처음이나 끝에 위치하면 제거
        new_id = new_id.replaceAll("^(\\.)|(\\.)$", "");

        // 5. 빈 문자열이라면, "a" 대입
        if(new_id.isEmpty()) new_id = "a";

        // 6. 처음 15자를 제외한 나머지 문자 제거
        //      만약 제거 후 마침표가 끝에 위치한다면 끝에 위치한 마침표 제거
        if(new_id.length() > 15){
            new_id = new_id.substring(0, 15).replaceAll("(\\.)$", "");
        }

        // 7. new_id의 길이가 2자 이하라면, 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        while(new_id.length() <= 2){
            new_id += new_id.charAt(new_id.length()-1);
        }

        return new_id;
    }

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id));
    }

}