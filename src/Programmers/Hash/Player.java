package Programmers.Hash;

import java.util.Arrays;


// participant : 마라톤에 참여한 선수들의 이름이 담긴 배열
// completion : 완주한 선수들의 이름이 담긴 배열
// 완주하지 못한 선수의 이름을 return



class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for(i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                break;
            }
             
        }     
        return participant[i];
    }
}