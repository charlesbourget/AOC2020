package org.aoc.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class InputReader {

    public static ArrayList<String> readInputFile(String fileName) {
        ArrayList<String> result = new ArrayList<>();

        InputStream is = InputReader.class.getClassLoader().getResourceAsStream("input/" + fileName);
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));

        try {
            while (bf.ready()) {
                result.add(bf.readLine());
            }

            bf.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static ArrayList<Integer> convertFileContentToInt(ArrayList<String> input) {
        return input.stream().map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
    }

}
