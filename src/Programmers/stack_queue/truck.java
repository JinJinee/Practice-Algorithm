package Programmers.Stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class truck {

    // 트럭 여러 대가 일차선 다리를 건넌다.
    // 모든 트럭이 다리를 건너려면 몇초가 걸릴까?

    // 트럭은 bridge_length 대 올라갈 수 있다.
    // 다리는 weight 이하까지 무게를 견딜 수 있다.
    // 단, 다리에 완전히 오르지 않은 트럭의 무게 무시

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> readyTruck = new LinkedList<>();
        
        // 브릿지 길이 만큼의 큐 리스트 생성
        // 초기값으로 0으로 채운다. 
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        // 대기 트럭의 리스트 생성
        // truck_weights 배열의 순서대로 리스트에 담는다.
        for (int i = 0; i < truck_weights.length; i++) {
            readyTruck.offer(truck_weights[i]);
        }

        int time = 0;
        int totalWeight = 0;
        while(!bridge.isEmpty()){  // 다리가 비어있을 때까지
            totalWeight -= bridge.peek();
            bridge.poll();  // 뒤에 새로운 트럭이 들어옴으로 가장 앞순서 제거
            
            if(!readyTruck.isEmpty()){ // 대기하고 있는 트럭이 있다면

                if(totalWeight + readyTruck.peek() <= weight){ // 현재 다리에 있는 무게 + 대기트럭에 가장 앞에 있는 트럭의 무게가 다리 무게보다 적으면,
                    bridge.offer(readyTruck.peek());   // 대기 트럭 제일 앞 순서 트럭 하나 추가
                    totalWeight += readyTruck.peek();  // 현재 다리 무게에 더한다.
                    readyTruck.poll();
                }
                else{   // 현재 다리에 있는 무게 + 대기트럭에 가장 앞에 있는 트럭의 무게가 다리 무게보다 크다면
                    bridge.offer(0);   // 뒤에 0 추가

                }

            } else {  // 대기하고 있는 트럭이 없다면
                time += bridge_length;   // 막 다리에 들어온 트럭이 빠져나가야 함으로 다리의 길이를 더한다.
                break;
            }

            time++;
        }
        return time;
    }

}
