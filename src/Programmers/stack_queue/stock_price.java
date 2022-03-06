package Programmers.stack_queue;

public class stock_price {

    // price[] : 주식가격이 담긴 배열
    // 가격이 떨어지지 않은 기간은 몇 초인지 return 


    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];

        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                answer[i]++;
                if(prices[i] > prices[j]){
                    break;
                }
            }
        }
        return answer;
    }
    
}
