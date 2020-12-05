package org.aoc.day1;

import org.aoc.utils.InputReader;

import java.util.ArrayList;

public class day1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = InputReader.convertFileContentToInt(InputReader.readInputFile("day1"));

        input.forEach(num1 -> {
            input.forEach(num2 -> {
                if (num1 + num2 == 2020) {
                    System.out.println("Result : " + num1 * num2);
                    System.exit(0);
                }
            });
        });
    }
}
