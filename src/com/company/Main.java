package com.company;
import java.lang.reflect.Array;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String[] things = {"Apple", "Bob", "ham", "Bob", "bacon"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s ", list);
        System.out.println();

        Set<String> set = new HashSet<String>(list);
        System.out.printf("%s ", set);
    }
}
