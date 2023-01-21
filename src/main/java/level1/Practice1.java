package level1;
// Practice3
// 배열 arr의 데이터 순서를 거꾸로 변경하세요.
// 추가 배열을 사용하지 않고 구현

// 입출력 예시)
// arr : 1, 3, 5, 7, 9
// 결과 : 9, 7, 5, 3, 1


import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        // 스왑을 사용하면 될 것 같긴한데..

        int[] arr = {1, 3, 5, 7, 9};

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;

//            if (i == 2) {
//                break;
//            }
        }
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
    }
}
