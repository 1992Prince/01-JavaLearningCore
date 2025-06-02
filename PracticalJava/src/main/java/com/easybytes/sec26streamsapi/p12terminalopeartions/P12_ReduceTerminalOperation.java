package com.easybytes.sec26streamsapi.p12terminalopeartions;

import java.util.Arrays;
import java.util.List;

public class P12_ReduceTerminalOperation {

    /*
    we can have only single terminal operation on an stream object.
    Streams reduce() is terminal operation
    reduce() combine all elements of a stream to generate a single value.
    Example of reduce operations include - computing sum, maximum, average,
    count and similar aggregates for a stream of integers

    Specialized reduce operations like sum(), max(), min(), count() etc are
    provided by certain stream interfaces

    reduce(seedval, func) where seedval is initial value of the reduction
    and the default result if the stream is empty.


     */

    public static void main(String[] args) {

        /*
        getting sum of list using reduce terminal opera

        sum() is static method in Integer class

         */
        List<Integer> list1 = List.of(10, 20, 30, 40, 50);

        Integer sum1 = list1.stream()
                .reduce(0, Integer::sum);

        // above code can also be written as
        Integer sum2 = list1.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum1 - " + sum1 + " Sum2 - " + sum2);
        // Sum1 - 150 Sum2 - 150

        System.out.println();
        System.out.println("-".repeat(40));
        System.out.println();

        /*
        count terminal operation demo
        count() method is specialized form of reduce method
         */

        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
        long countVal = intList.stream()
                .count();
        System.out.println("Count val is - " + countVal);

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        /*
        How to use specialize reduce method like sum, max, min. But before invoking specialized reduce method
        we have to make sure, our stream is not normal stream obj.
        It should be int stream or double stream or long stream

        Purpose of mapToInt() -
        The mapToInt() method in Java Streams is used to transform each element of the stream into an int.
        This is particularly useful when you need to perform numerical operations or
             use specialized methods available in the IntStream interface.

         It is used to transform each element of a stream into an int, resulting in an IntStream.
         This is particularly useful when you want to perform operations that require an int type, such as summing the elements,
             finding the maximum or minimum value, or converting objects to their integer representations.

         The mapToInt() method is available for both Stream<T> and IntStream, LongStream, and DoubleStream.

         Demo on how to use specialized reduced methods like sum, max, min, count etc but before that we have to make sure
         our stream is of a specialized stream type[it could be double stream, long stream or int stream] and it should not be normal stream object.
         */

        List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50, 5);
        int sum = list2.stream()
                .mapToInt(num -> num)
                .sum();

        // get only even sum
        int evenSum = list2.stream()
                .mapToInt(num -> num)
                .filter(num -> num % 2 == 0)
                .sum();

        // get max element from list
        int max = list2.stream()
                .mapToInt(num -> num)
                .max()
                .orElse(0);

        // get min element from list
        int min = list2.stream()
                .mapToInt(num -> num)
                .min()
                .orElse(0);

        //printing sum, evensum, max and min
        System.out.println("Sum - " + sum + " evensum - "+ evenSum + " maxval - " + max + " minval - " + min);


    }
}
