package org.aoc.day1;

import org.aoc.utils.InputReader;

import java.util.ArrayList;

public class Day1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = InputReader.convertFileContentToInt(InputReader.readInputFile("day1"));
        int p1 = 0, p2 = 0;

        for (int num1 : input) {
            for (int num2 : input) {
                if (num1 + num2 == 2020) {
                    p1 = num1 * num2;
                }
                for (int num3 : input) {
                    if (num1 + num2 + num3 == 2020) {
                        p2 = num1 * num2 * num3;
                    }
                }
            }
        }

        System.out.println("Part 1 : " + p1);
        System.out.println("Part 2 : " + p2);
    }
}
