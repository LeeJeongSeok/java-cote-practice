package level1;

class Solution {
    public static int recursiveArr(int n, int i, int j) {

        if (n == 2) {
            // 우측 상단 (1번칸)
            if (i == 0 && j == 1) { return 1; }
            // 좌측 상단 (2번칸)
            else if (i == 0 && j == 0) { return 2; }
            // 좌측 하단 (3번칸)
            else if (i % 2 == 1 && j % 2 == 0) { return 3; }
            // 우측 하단 (4번칸)
            else { return 4; }

        } else {
            // 가로 세로 길이가 n인 배열을 길이가 절반인 배열 4개로 나눈다
            // 가로 세로 인덱스를 n/2로 나누면 몫이 0 또는 1이 되고
            // 이를 이용하면 해당 인덱스가 4개의 배열 중 몇번째 배열에 속하는지 알 수 있다.
            int subArrayLength = n / 2;
            int subArrayRowIdx = i / subArrayLength;
            int subArrayColIdx = j / subArrayLength;

            // 4개로 나뉜 각 배열의 값들은 동일한 인덱스일 경우  (n/2)^2 만큼 차이가 난다.
            int differenceBetweenSubArray = (int)Math.pow(subArrayLength, 2);

            // 4개로 나뉜 배열 내에서 사용할 인덱스를 다시 계산한다.
            int newRowIdx = i % subArrayLength;
            int newColIdx = j % subArrayLength;

            // 우측 상단 (1번째 배열)
            if (subArrayRowIdx == 0 && subArrayColIdx == 1) {
                return recursiveArr(subArrayLength, newRowIdx, newColIdx);

                // 좌측 상단 (2번째 배열)
            } else if (subArrayRowIdx == 0 && subArrayColIdx == 0) {
                return recursiveArr(subArrayLength, newRowIdx, newColIdx)
                        + differenceBetweenSubArray;

                // 좌측 하단 (3번째 배열)
            } else if (subArrayRowIdx== 1 && subArrayColIdx == 0) {
                return recursiveArr(subArrayLength, newRowIdx, newColIdx)
                        + differenceBetweenSubArray * 2;

                // 우측 하단 (4번째 배열)
            } else {
                return recursiveArr(subArrayLength, newRowIdx, newColIdx)
                        + differenceBetweenSubArray * 3;
            }
        }
    }

    public static int solution(int n, int i, int j) {
        return recursiveArr(n, i, j);
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 1, 3));
    }
}
