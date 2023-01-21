package level1;

// Practice6
// 배열 arr 에서 중복 값을 제거한 새 배열을 만드시오.

// 입출력 예시)
// arr : 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5
// 결과 : 1, 5, 3, 2, 4

import java.util.ArrayList;
import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        int[] arrResult = new int[arr.length];
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (value == arr[j]) {
                    count++;
                }

                if (count >= 2 && arrResult[j] != value) {
                    arrResult[j] = arr[i];
                }
            }
        }

        System.out.println(Arrays.toString(arrResult));

    }
}
