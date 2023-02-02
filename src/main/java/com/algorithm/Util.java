package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Util {
    public static List<String> readFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        BufferedReader reader = Files.newBufferedReader(path);
        return reader.lines().collect(Collectors.toList());
    }

    public static String removeParenthesis(String src) {
        return src.replaceAll("^(\\[|\\{|\\()|(\\]|\\}|\\))$", "");
    }

    public static String removeQuotes(String src) {
        return src.replaceAll("^(\\\"|\\')|(\\\"|\\')$", "");
    }

    public static List<String> tokenize(String src, String delimiter) {
        return new ArrayList<>(List.of(src.split(delimiter)));
    }

    public static String removeAllSpaces(String src) {
        return src.replaceAll("\\s", "");
    }
}
