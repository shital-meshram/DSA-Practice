package JAVA_8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Que :: 2) How do you remove duplicate elements from a list using Java 8 streams?
public class J82_RemoveDuplicate {

    public static void main(String[] args) {

        List<String> duplicateStrings=Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> uniqueStrings = duplicateStrings.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueStrings);
    }

}
