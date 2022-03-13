package Programmers.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3
// 1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
// 2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
// 3. 2에서 나온 배열의 3번째 숫자는 5입니다.

// commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return

public class KthNumber {
    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            // 1. commands[i][0]~commands[i][1] 까지 자른 배열을 만든어야한다.
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            // 2. 정렬
            Collections.sort(list);

            // 3. commands[i][2]번째 숫자뽑기
            answer[i] = list.get(commands[i][2]-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

        System.out.println(Arrays.toString(solution(array, commands)));
    }
}
