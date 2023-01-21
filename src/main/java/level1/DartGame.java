package level1;

import java.util.ArrayList;

public class DartGame {
    public static int solution(String dartResult) {
        int[] areas = new int[3]; // S : 1, D : 2, T : 3
        int[] options = new int[3]; // * : 100, # : -100
        int breakPoint = 0;
        int round = 1;

        String[] dartResults = dartResult.split("");

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < dartResults.length; i++) {
            String text = "";
            if (!Character.isDigit(dartResult.charAt(i))) {
                text += dartResult.charAt(i);
            } else {
                list.add(round, text);
                round++;
            }

        }

        return 0;
    }
    public static void main(String[] args) {
        String[] test = "1S2D*3T".split("[0-9]+]");
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i] + " ");
        }
    }
}
