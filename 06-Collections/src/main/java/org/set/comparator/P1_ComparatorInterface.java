package org.set.comparator;

public class P1_ComparatorInterface {

    /**
     * 🔹 1. What is Comparator?
     * ➤ Interface from java.util package:
     * public interface Comparator<T> {
     *     int compare(T o1, T o2);
     * }
     *
     * ➤ Purpose:
     * Define custom sorting logic for objects when natural ordering (provided by Comparable) is not sufficient or not applicable.
     * Allows multiple sorting strategies for the same class.
     *
     * Comparator have 2 methods -:
     * 1) public int compare(Object obj1,Object Obj2);
     * 2) public boolean equals(Object obj);
     *
     * Whenever we are implementing Comparator interface we have to provide implementation only for compare() method.
     * Implementing equals() method is optional because it is already available from Object class through inheritance.
     *
     * ✅ Purpose of Comparator
     * The Comparable interface provides natural sorting order for objects by implementing the compareTo() method inside the class itself.
     * However, if you need to define multiple custom sorting strategies for the same class — for example:
     *
     *      Natural sort: Students sorted in ascending order by ID (via Comparable)
     *      Custom sort: Students sorted in descending order by IDn
     *      Or by name, or by age
     *
     * ...then you should use the Comparator interface.
     *
     * Comparator allows you to:
     *      Write custom sorting logic outside the class [Comparable logic have to written within the class]
     *      Create multiple sorting strategies without modifying the original class
     *      Pass sorting logic dynamically at runtime (especially useful in collections like TreeSet, PriorityQueue, or Collections.sort())
     *
     * Use Comparator when:
     *      You cannot modify the class
     *      You want to sort in different ways (e.g., by name, id, age)
     *      You want to keep sorting logic outside the model
     *
     */
}
