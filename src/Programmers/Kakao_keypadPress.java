package Programmers;

class Solution {
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int lHand = 10; // 왼손 위치(*)
        int rHand = 12; // 오른손 위치(#)

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) { // 왼쪽열 숫자(1, 4, 7)일 경우 -> 왼손
                sb.append("L");
                lHand = num;
            } else if (num == 3 || num == 6 || num == 9) { // 오른쪽열 숫자(3, 6, 9)일 경우 -> 오른손
                sb.append("R");
                rHand = num;
            } else { // 가운데 열의 숫자(2, 5, 8, 0)일 경우 -> 가까운 거리의 손가락을 구해야 한다.
                int lDist = getDist(lHand, num);
                int rDist = getDist(rHand, num);

                if (lDist > rDist) {
                    sb.append("R");
                    rHand = num;
                } else if (lDist < rDist) {
                    sb.append("L");
                    lHand = num;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        rHand = num;
                    } else {
                        sb.append("L");
                        lHand = num;
                    }

                }

            } // if

        } // for

        return sb.toString();
    }

    public static int getDist(int hand, int num) {
        hand = (hand == 0) ? 11 : hand;
        num = (num == 0) ? 11 : num;

        int handX = (hand - 1) / 3;
        int handY = (hand - 1) % 3;
        int numX = num / 3;
        int numY = 1;
        return Math.abs(handX-numX) + Math.abs(handY-numY);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }
}
