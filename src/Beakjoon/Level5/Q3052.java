// 나머지
package Beakjoon.Level5;
import java.util.*;

public class Q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();    // 값을 입력받아 배열 arr에 순차대로 저장
            arr[i] %= 42;             // 저장한 값을 45로 나눈 나머지 값을 배열 arr에 저장
        }
        sc.close();

        Set<Integer> set = new HashSet<Integer>();
		for(int i : arr)
			set.add(i);
		
		List<Integer> newArr = new ArrayList<Integer>(set);
		Collections.sort(newArr);

        System.out.println(newArr.size());

    }
}
