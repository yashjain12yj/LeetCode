package com.leetcode._49_GroupAnagrams;

import java.util.*;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 02-03-2020
 */

public class _49_GroupAnagrams_UniquePrimeMultiplication {
    private static final Map<Character, Integer> map = new HashMap<>() {{
        put('a', 2);
        put('b', 3);
        put('c', 5);
        put('d', 7);
        put('e', 11);
        put('f', 13);
        put('g', 17);
        put('h', 19);
        put('i', 23);
        put('j', 29);
        put('k', 31);
        put('l', 37);
        put('m', 41);
        put('n', 43);
        put('o', 47);
        put('p', 53);
        put('q', 59);
        put('r', 61);
        put('s', 67);
        put('t', 71);
        put('u', 73);
        put('v', 79);
        put('w', 83);
        put('x', 89);
        put('y', 97);
        put('z', 101);
    }};

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, List<String>> anagrams = new HashMap();

        for (String str : strs) {
            int ascii = 1;
            for (char ch : str.toCharArray()) {
                ascii *= map.get(ch);
            }
            if (anagrams.containsKey(ascii)) {
                ArrayList value = new ArrayList(anagrams.get(ascii));
                value.add(str);
                anagrams.put(ascii, value);
            } else {
                anagrams.put(ascii, Arrays.asList(str));
            }
        }
        return new ArrayList(anagrams.values());
    }
}
