package Programmers.DFS_BFS;

// n개의 음이 아닌 정수들
// 순서를 바꾸지 않고
// 더하거나 빼서 타켓 넘버 만든다.
// 타켓 넘버를 만들 수 있는 경우의 수 리턴

// root = 0
// 왼쪽자식은 마이너스
// 오른쪽자식은 플러스한다.
// 그리고 마지막 노드의 값에서 타겟넘버를 구한다.

class Solution {
    int count = 0;

    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, target, 0);
        answer = this.count;

        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int result) {
        if (depth == numbers.length) {
            if (result == target) {
                this.count++;
            }
            return;
        }

        int sub = result - numbers[depth];
        int add = result + numbers[depth];

        dfs(numbers, depth+1, target, sub);
        dfs(numbers, depth+1, target, add);
    }
}
