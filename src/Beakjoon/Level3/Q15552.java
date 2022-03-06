// 빠른 A+B
package Beakjoon.Level3;
import java.io.*;
import java.util.StringTokenizer;

public class Q15552 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
        
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());   // 테스트 개수 T 
        
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        
        bw.close();
        
    }    
}
