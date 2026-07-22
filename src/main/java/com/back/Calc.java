package com.back;

public class Calc {

    // int rs = Calc.run("((3 + 5) * 5 + -10) * 10 / 5");

    public static int run(String text) {

        text = text.trim();

        int plusIndex = text.lastIndexOf("+");
        int minusIndex = text.lastIndexOf("-");

        if (plusIndex != -1 || minusIndex != -1) {
            if(plusIndex > minusIndex) {
                String leftText = text.substring(0, plusIndex).trim();
                String rightText = text.substring(plusIndex + 1).trim();
                return run(leftText) + run(rightText);

            } else {
                String leftText = text.substring(0, minusIndex).trim();
                String rightText = text.substring(minusIndex + 1).trim();
                return run(leftText) - run(rightText);
            }
        }

        int multiplyIndex = text.lastIndexOf("*");
        int divideIndex = text.lastIndexOf("/");

        if (multiplyIndex != -1 || divideIndex != -1) {
            if (multiplyIndex > divideIndex) {
                String leftText = text.substring(0, multiplyIndex).trim();
                String rightText = text.substring(multiplyIndex + 1).trim();
                return run(leftText) * run(rightText);

            } else {
                String leftText = text.substring(0, divideIndex).trim();
                String rightText = text.substring(divideIndex + 1).trim();
                return run(leftText) / run(rightText);
            }

        }
        return Integer.parseInt(text);
    }
}