package Programmers;

public class Num_strings_English_words {
    public static int solution(String s) {
        String eWord[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<10; i++){
            s = s.replace(eWord[i], Integer.toString(i));
        }

        int answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
}
