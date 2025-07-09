package org.set.dilip;

import java.util.HashSet;

public class UseCase2 {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Dilip", 100);
        Student s2 = new Student(2, "Alice", 99);
        Student s3 = new Student(3, "Suresh", 88);
        Student s4 = new Student(1, "Dilip", 100);
        Student s5 = new Student(5, "Bob", 90);

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);

        hashSet.add(s1);
        hashSet.add(s2);



        System.out.println("Hashset size - " + hashSet.size()); // Hashset size - 5
        for(Student student: hashSet){
            System.out.println(student);
        }

        /**
         * Student{id=5, name='Bob', marks=90}
         * Student{id=1, name='Dilip', marks=100}
         * Student{id=2, name='Alice', marks=99}
         * Student{id=3, name='Suresh', marks=88}
         * Student{id=1, name='Dilip', marks=100}
         */

        /**
         * Here in memory 5 hashset objects are being created but
         * we have added s1 and s2 two times to HashSet object but giving only size 5 y?
         * Why does HashSet not add s1 and s2 again even though I called add(s1) and add(s2) twice?”
         *
         * "HashSet in Java doesn't allow duplicate elements.
         * When I do hashSet.add(s1) and add(s2) the second time, Java internally checks if those objects are
         * already present using the equals() and hashCode() methods.
         *
         * In this case, since I'm adding the same object references (s1 and s2) again — meaning their memory address
         * is the same — HashSet immediately knows they are duplicates and doesn't add them again.
         *
         * So even if I call add(s1) or add(s2) 10 times, only the first add will count.
         * That’s why the size remains 5."**
         *
         * In short, HashSet checks duplicates based on equals() and hashCode() — not just object data, but how you define object equality.
         *
         *
         */

        /**
         * “But what about s4? It has same values as s1 — why is that added?”
         *
         * Even though s1 and s4 have the same data (id, name, marks), they are different objects in memory.
         * Since I haven’t overridden the equals() and hashCode() methods in my Student class,
         * Java uses the default implementation from the Object class — which compares memory addresses, not content.
         *
         * So, HashSet sees s1 and s4 as different objects and allows both to be added.
         * If I want HashSet to treat s1 and s4 as duplicates based on their field values,
         * I must override equals() and hashCode() in the Student class."
         *
         * 🔧 Code Fix Suggestion (optional if they ask):
         * @Override
         * public boolean equals(Object o) {
         *     if (this == o) return true;
         *     if (!(o instanceof Student)) return false;
         *     Student s = (Student) o;
         *     return id == s.id && marks == s.marks && name.equals(s.name);
         * }
         *
         * @Override
         * public int hashCode() {
         *     return Objects.hash(id, name, marks);
         * }
         */

    }
}
