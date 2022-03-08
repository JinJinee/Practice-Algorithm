package Programmers.DFS_BFS;

// 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 
// 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean check[] = new boolean[n];

        for(int i=0; i<n; i++){
            if(!check[i]){
                dfs(computers, i, check);
                answer++;
            }
        }
        return answer;
    }

    boolean[] dfs(int[][] computers, int i, boolean check[]){
        check[i] = true;
        for(int j=0; j<computers.length; j++){
            if(i != j && computers[i][j] == 1 && check[j] == false){
                check = dfs(computers, j, check);
            }
        }
        return check;
    }

    // 실행해보기
    public static void main(String[] args) {
        int n = 3;
        int computers[][] = {{1,1,0},{1,1,0},{0,0,1}};
        Solution s = new Solution();
        System.out.println(s.solution(n, computers));
    }
    
}
