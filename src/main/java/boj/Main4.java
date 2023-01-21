package boj;

public class Main4 {
    public static int solution(int A, int B, int V) {
        int day = 1;
        int cur = 0;

        while (V != cur) {
            cur += A;
            cur -= (-1 * B);
            day++;
        }

        return day;
    }
    public static void main(String[] args) {
        System.out.println(solution(2, 1, 5));
    }
}
