package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Crane_puppet {
    public static int solution(int[][] board, int[] moves) {
        // 꺼낸 인형을 담을 바구니 리스트 생성
        List<Integer> box = new ArrayList<>();
        // 터진 인형의 수를 담을 변수
        int answer = 0;

        // 움직이는 횟수만큼 반복
        for(int i=0; i<moves.length; i++){
            // 인형을 꺼낼 위치 인덱스
            int idx = moves[i]-1;

            for(int j=0; j<board.length; j++){
                // 0이 아닐경우 인형을 꺼내서 바구니에 넣는다
                if(board[j][idx] != 0){
                    box.add(board[j][idx]);
                    board[j][idx] = 0; // 꺼낸 자리 0으로 바꾸기

                    // 바구니에 꺼낸 인형이 2개 이상일 경우 앞에있는 숫자와 비교
                    if(box.size() > 1){
                        // 같을 경우 리스트에서 제거 후 answer 2증가
                        if(box.get(box.size()-1) == box.get(box.size()-2)){
                            box.remove(box.size()-1);
                            box.remove(box.size()-1);
                            answer += 2;
                        }
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {
                        {0,0,0,0,0},
                        {0,0,1,0,3},
                        {0,2,5,0,1},
                        {4,2,4,4,2},
                        {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));

    }
}
