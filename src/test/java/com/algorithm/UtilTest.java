package com.algorithm;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilTest {

    @Test
    void readFileTest() throws IOException {
        String filePath = "src/test/resources/test.txt";
        List<String> inputs = Util.readFile(filePath);

        assertEquals(3, inputs.size());
        for (int i = 1; i < 3; i++) {
            assertEquals("TEST" + i, inputs.get(i - 1));
        }
    }
    @Test
    void removeParenthesisTest() {
        String input = "[h{e}l)l]o}";
        String output = Util.removeParenthesis(input);
        assertEquals("h{e}l)l]o", output);
    }

    @Test
    void removeQuotesTest() {
        String input = "\"h'e\"l'l\"o'";
        String output = Util.removeQuotes(input);
        assertEquals("h'e\"l'l\"o", output);
    }

    @Test
    void tokenizeTest() {
        String input = "a,b,c, d, e";
        List<String> outputs = Util.tokenize(input, ",");
        List<String> expected = List.of(new String[]{"a", "b", "c", " d", " e"});
        assertEquals(expected, outputs);

        outputs = Util.tokenize(input, " ");
        expected = List.of(new String[]{"a,b,c,", "d,", "e"});
        assertEquals(expected, outputs);
    }

    @Test
    void removeAllSpacesTest() {
        String input = " a,b,c, d, e ";
        String output = Util.removeAllSpaces(input);
        assertEquals("a,b,c,d,e", output);
    }
}