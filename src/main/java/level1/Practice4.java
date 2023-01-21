package level1;

// Practice4
// 배열 arr 에서 peek 값 모두 출력

// peek 값이란? 가운데 값을 기준으로 좌 우 값보다 크면 그 값이 peak 값
// arr : 3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11
// 결과 : 3, 6, 5, 10, 11

import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11};
        ArrayList peek = new ArrayList();

        for (int i = 0; i <= arr.length - 1; i++) {

            // 맨 왼쪽인 경우, 오른쪽 값과 비교함
            if (i == 0) {
                if (arr[i] > arr[i+1]) {
                    peek.add(arr[i]);
                }
            } else if (i == arr.length - 1) { // 맨 오른쪽인 경우, 왼쪽 값과 비교함
                if (arr[i] > arr[i - 1]) {
                    peek.add(arr[i]);
                }
            } else {
                // 그 외 나머지 값들은 좌, 우 값 비교
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    peek.add(arr[i]);
                }
            }

            // 강의 답안
//            if (i == 0 && arr[i] > arr[i+1]) {
//                peek.add(arr[i]);
//            } else if (i == arr.length - 1 && arr[i] > arr[i - 1]) { // 맨 오른쪽인 경우, 왼쪽 값과 비교함
//                peek.add(arr[i]);
//            } else {
//                // 그 외 나머지 값들은 좌, 우 값 비교
//                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
//                    peek.add(arr[i]);
//                }
//            }

        }

        System.out.println(peek);
    }
}
