package boj;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int count = 1;
        int pre_count_num = 0;

        while (true) {
            if (X <= count + pre_count_num) {
                System.out.println(count + pre_count_num);

                // 짝수인 경우와, 홀수인 경우를 나눠야하는데
                if (count % 2 == 0) {
                    // 분자가 큰 수부터 시작
                    // 분자는 대각선상(count) 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1)
                    // 분모는 X 번째 - 직전 대각선까지의 블럭 개수
                    System.out.print((count - (X - pre_count_num - 1)) + "/" + (X - pre_count_num));
                    break;
                } else {
                    System.out.print((X - pre_count_num) + "/" + (count - (X - pre_count_num - 1)));
                    break;
                }
            } else {
                pre_count_num += count;
                count++;
            }
        }


    }
}
