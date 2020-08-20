package com.example.eurekademo.shiro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
            List<Integer> collect = integers.stream().filter(s -> s > 2).collect(Collectors.toList());
            for (Integer s:collect) {
                System.out.println(s);
            }
            });
        thread.start();
    }
}
