package level1;

// Practice5
// 배열 arr 의 값을 오름차순으로 출력

// 입출력 예시)
// arr : 5, 3, 1, 4, 6, 1
// 결과 : 1, 1, 3, 4, 5, 6

import java.util.ArrayList;

public class Practice5 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 6, 1};
        ArrayList list = new ArrayList();

        int min = 100;
        int idx = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }
            list.add(arr[idx]);
            min = 100;
            arr[idx] = 100;
        }


        System.out.println(list);
    }
}
