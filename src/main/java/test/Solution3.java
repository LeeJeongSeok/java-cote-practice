package test;

public class Solution3 {
    public int[][] solution(int[][] image, int K) {
        int n = (K - 1) / 2;
        int N = K*K;
        int height = image.length;
        int width = image[0].length;
        int[][] result = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int sum = 0;
                for (int k = i - n; k < i - n + K; k++) {
                    for (int l = j - n; l < j - n + K; l++) {
                        int val = 0;
                        if (k >= 0 && k < height &&
                                l >= 0 && l < width) {
                            val = image[K][l];
                        }
                        sum += val;
                    }
                }
                result[i][j] = sum / N;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        //solution("3{abc}e");
    }
}