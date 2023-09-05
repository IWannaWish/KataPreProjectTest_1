package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.stream().forEach(System.out::println);
    }
}
