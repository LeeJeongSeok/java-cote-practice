package boj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        if (N >= 100) {
            if (N == 1000) {
                N = 999;
            }

            count += 99;

            for (int i = 100; i <= N; i++) {
                String[] split = Integer.toString(i).split("");
                int diff1 = Integer.parseInt(split[1]) - Integer.parseInt(split[0]);
                int diff2 = Integer.parseInt(split[2]) - Integer.parseInt(split[1]);

                if (diff1 == diff2) {
                    count++;
                }
            }
        } else {
            count = N;
        }
        System.out.println(count);
    }
}
