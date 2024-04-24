package JAVA_8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//Que :: 1) Given a list of integers, separate odd and even numbers?
public class J81_SeperateEvenOdd {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        //Collectors.partitioningBy(i->i%2==0) this will partition the array based on the predicate result

        Map<Boolean, List<Integer>> evenOddMap =  listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));

        List<Integer> evenList = evenOddMap.get(true);
        List<Integer> oddList = evenOddMap.get(false);

        System.out.println("Even Number :: "+ evenList);
        System.out.println("Odd Number :: "+ oddList);

    }

}
