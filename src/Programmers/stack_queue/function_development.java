package Programmers.Stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class function_development {

    // 각 기능은 진도가 100%일 때 서비스 반영
    // 각 개발속도 다름
    // 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 배포
    // profresses : 진도가 적힌 정수 배열
    // speeds : 개발 속도
    // 몇 개의 기능이 배포되는 지 return
    // 배포는 하루끝에 한번

    // 100 - 진도 = 남은 작업량
    // Math.ceil(남은 작업략 / 속도) = 배포일

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] day = dayCount(progresses, speeds);
        
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(0);
        for(int i=1; i<day.length; i++){
            if(day[stack.peek()] < day[i]){
                stack.push(i);
            }
        }

        int[] answer = new int[stack.size()];

        for(int i=answer.length-1; i>=0; i--){
            if(i == stack.size()-1){
                answer[i] = day.length - stack.elementAt(i);
            }
            else {
                answer[i] = stack.elementAt(i+1) - stack.elementAt(i);
            }
        }

        return answer;
    }

    public static int[] dayCount(int[] p, int[] s) {
        int[] day = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            day[i] = (int) Math.ceil((100.0 - p[i]) / s[i]);
        }
        return day;
    }


    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

}