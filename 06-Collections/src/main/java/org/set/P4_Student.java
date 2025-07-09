package org.set;

/**✅ 2. TreeSet with Custom Class implementing Comparable
 If you're adding custom objects, TreeSet needs to know how to sort. So the class must implement Comparable and override compareTo().

 Here we have Student class and we are gonna add Student obj to TreeSet class obj.
 Student class obj is implementing Comparable interface and overrding compareTo method of it
 Aand once we add all Student objects to TreeSet obj, we can print them in sorting order wch we defined in compareTo

 Dekh bhai , scene yeh hah ki Student object jab TreeSet me add hoga toh kisi sorted order me add hoga.
 Woh sorted hume id se karna hah ya name se karna hah , woh define karenge compareTo method me by implementing Comparable interface
 */
public class P4_Student implements Comparable<P4_Student> {

    int id;
    String name;

    P4_Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(P4_Student s) {
        return this.id - s.id; // sort by ID
    }

    public String toString() {
        return id + " - " + name;
    }
}
