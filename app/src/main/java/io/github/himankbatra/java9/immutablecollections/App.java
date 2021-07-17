
package io.github.himankbatra.java9.immutablecollections;

import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        // NullPointerException – if an element is null
        // Returns an unmodifiable list containing three elements
        List<String> strings = List.of("abc", "xyz", "123");

        // NullPointerException – if an element is null
        // Returns an unmodifiable set containing three elements
        Set<String> uniqueStrings = Set.of("abc", "xyz");

        System.out.println(strings); // [abc, xyz, 123]
        System.out.println(uniqueStrings);  // [abc, xyz]


    }
}
