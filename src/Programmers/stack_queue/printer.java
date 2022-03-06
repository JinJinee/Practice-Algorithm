package Programmers.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class printer {

    // 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
    // 2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
    // 3. 그렇지 않으면 J를 인쇄합니다.

    // priorities : 중요도


        public int solution(int[] priorities, int location) {
            Queue<Pair> queue = new LinkedList<>();
            int answer = 0;
            
            for (int i = 0; i < priorities.length; i++) {
                queue.add(new Pair(i, priorities[i]));
            }
            
            while (!queue.isEmpty()) {
                
                int current = queue.peek().value;
                
                boolean flag = false;
                
                for (Pair pair : queue) {
                    if (pair.value > current) {
                        // System.out.println(pair.value);
                        flag = true;
                        break;
                    }
                }
                
                if (flag) {
                    Pair temp = queue.poll();
                    queue.add(temp);
                }
                else {
                    answer++;
                    Pair pair = queue.poll();
                    
                    if (pair.index == location) {
                        return answer;
                    }
                }
            }
            return answer;
        }
        
        class Pair {
            int index;
            int value;
            
            public Pair(int index, int value) {
                this.index = index;
                this.value = value;
            }
        }
    }

    


