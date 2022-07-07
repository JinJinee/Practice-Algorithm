package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 첫째 줄에 정점의 개수 N
// 간선의 개수 M
// 탐색을 시작할 정점의 번호 V

// 첫째 줄에 DFS를 수행한 결과
// 그 다음 줄에는 BFS를 수행한 결과를 출력

public class BOJ_1260 {
    // DFS에 쓰일 이차원 배열
    static int[][] Dgraph = new int[1001][1001];
    // BFS에 쓰일 이차원 배열
    static int[][] Bgraph = new int[1001][1001];
    static boolean[] Dvisit = new boolean[10001];
    
    static int N;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 간선을 두개의 그래프 배열에 똑같이 저장해 준다.
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            Dgraph[u][v] = Dgraph[v][u] = 1;
            Bgraph[u][v] = Bgraph[v][u] = 1;
        }

        DFS(V);
        System.out.println();
        BFS(V);
    }

    public static void DFS(int node){
        Dvisit[node] = true;
        System.out.print(node + " ");

        for(int i=1; i<=N; i++){
            if(!Dvisit[i] && Dgraph[node][i] == 1){
                DFS(i);
            }
        }
    }

    public static void BFS(int node){
        boolean[] Bvisit = new boolean[10001];
        Queue<Integer> que = new LinkedList<Integer>();
        Bvisit[node] = true;
        que.offer(node);

        while(!que.isEmpty()){
            int P = que.poll();
            System.out.print(P + " ");

            for(int i=1; i<=N; i++){
                if(!Bvisit[i] && Bgraph[P][i] == 1){
                    Bvisit[i] = true;
                    que.offer(i);
                }
            }
        }
    }
}
