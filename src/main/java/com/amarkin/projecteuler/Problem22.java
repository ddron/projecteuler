package com.amarkin.projecteuler;

import java.io.*;
import java.util.*;

/**
 * Created by amarkin on 12/9/2015.
 */
public class Problem22 {

    private static final Map<Character, Integer> alphabet = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("p022_names.txt"));
        Set<String> names = new TreeSet<>();
        String s = br.readLine();
        String[] split = s.split("\",?\"?");
        for (String s1 : split) {
            if (!s1.isEmpty()) {
                names.add(s1);
            }
        }

        populateAlphabet();

        int i = 1;
        long total = 0;
        for (String name : names) {
            total += nameWeight(name, i++);
        }
        System.out.println(total);
    }

    private static long nameWeight(String name, int position) {
        long weight = 0;
        for (char c : name.toCharArray()) {
            weight += alphabet.get(c);
        }
        return weight * position;

    }

    private static void populateAlphabet() {
        int i = 1;
        alphabet.put('A', i++);
        alphabet.put('B', i++);
        alphabet.put('C', i++);
        alphabet.put('D', i++);
        alphabet.put('E', i++);
        alphabet.put('F', i++);
        alphabet.put('G', i++);
        alphabet.put('H', i++);
        alphabet.put('I', i++);
        alphabet.put('J', i++);
        alphabet.put('K', i++);
        alphabet.put('L', i++);
        alphabet.put('M', i++);
        alphabet.put('N', i++);
        alphabet.put('O', i++);
        alphabet.put('P', i++);
        alphabet.put('Q', i++);
        alphabet.put('R', i++);
        alphabet.put('S', i++);
        alphabet.put('T', i++);
        alphabet.put('U', i++);
        alphabet.put('V', i++);
        alphabet.put('W', i++);
        alphabet.put('X', i++);
        alphabet.put('Y', i++);
        alphabet.put('Z', i++);
    }

}
