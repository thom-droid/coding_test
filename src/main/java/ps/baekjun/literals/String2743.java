package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String2743 {

    public static void main(String[] args) {
        new BufferedReader(new InputStreamReader(System.in)).lines()
                .map(String::length)
                .forEach(System.out::println);
    }
}
