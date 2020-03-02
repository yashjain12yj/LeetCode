package com.leetcode._49_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Yash Jain
 * (yashjain12yj@gmail.com)
 * Created on 02-03-2020
 */

public class _49_GroupAnagrams_ByCountKey {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap();
        for (String str : strs) {
            int[] count = new int[26];
            Arrays.fill(count, 0);
            for (char ch : str.toCharArray())
                count[ch - 'a']++;
            StringBuilder key = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                key.append("#");
                key.append(count[i]);
            }
            if (!anagrams.containsKey(key.toString()))
                anagrams.put(key.toString(), new ArrayList());
            anagrams.get(key.toString()).add(str);

        }
        return new ArrayList(anagrams.values());
    }
}
