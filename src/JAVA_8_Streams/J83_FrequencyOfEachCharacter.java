package JAVA_8_Streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Que :: 3) How do you find frequency of each character in a string using Java 8 streams?
public class J83_FrequencyOfEachCharacter {

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        Map<Character, Long> charCount= inputString.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c->c, Collectors.counting()));

        System.out.println(charCount);
    }


}
