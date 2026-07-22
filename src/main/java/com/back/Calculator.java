package com.back;

public class Calculator {

    // int rs = Calc.run("((3 + 5) * 5 + -10) * 10 / 5");

    public int run(String text) {

        text = text.trim();

        int plusIndex = text.indexOf("+");

        if (plusIndex != -1) {
            String leftText = text.substring(0, plusIndex).trim();
            String rightText = text.substring(plusIndex + 1).trim();

            return run(leftText) + run(rightText);
        }

        int multiplyIndex = text.indexOf("*");

        if (multiplyIndex != -1) {
            String leftText = text.substring(0, multiplyIndex).trim();
            String rightText = text.substring(multiplyIndex + 1).trim();

            return run(leftText) * run(rightText);
        }
        return Integer.parseInt(text);

    }
}