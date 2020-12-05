package org.aoc.day1;

import org.aoc.utils.InputReader;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class day1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = InputReader.convertFileContentToInt(InputReader.readInputFile("day1"));

        //part1(input);
        part2(input);
    }

    private static void part1(ArrayList<Integer> input) {
        input.forEach(num1 -> {
            input.forEach(num2 -> {
                if (num1 + num2 == 2020) {
                    System.out.println("Part 1 : " + num1 * num2);
                    System.exit(0);
                }
            });
        });
    }

    private static void part2(ArrayList<Integer> input) {
        input.forEach(num1 -> {
            input.forEach(num2 -> {
                input.forEach(num3 -> {
                    if (num1 + num2 + num3 == 2020) {
                        System.out.println("Part 2 : " + num1 * num2 * num3);
                        System.exit(0);
                    }
                });
            });
        });
    }
}
