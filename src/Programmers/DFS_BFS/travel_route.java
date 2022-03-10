package Programmers.DFS_BFS;
// 주어진 항공권을 모두 이용해 여행경로를 짠다.
// 항상 ICN 공항에서 출발
// 항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때, 
// 방문하는 공항 경로를 배열에 담아 return

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미
// 만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 

class Solution {
    boolean visited[];
    ArrayList<String> allRoute;
    public String[] solution(String[][] tickets) {
        String[] answer = {};

        allRoute = new ArrayList<>();
        visited = new boolean[tickets.length];
        int cnt = 0;

        dfs("ICN", "ICN", tickets, cnt);

        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");
        
        return answer;
    }

    public void dfs(String start, String route, String[][] tickets, int cnt){
        if(cnt == tickets.length){
            allRoute.add(route);
            return;
        }

        for(int i=0; i<tickets.length; i++){
            if(start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, cnt+1);
                visited[i] = false;
            }
        }
    }

}