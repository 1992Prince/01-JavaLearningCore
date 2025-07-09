package org.set;

public class P6_Naturalsorting {
    /**
     * If we are depending on default natural sorting order then internally JVM or (TreeSet) will use
     * compareTo() method to arrange objects in sorting order.
     *
     * 🔍 Jab Class Natural Sorting Support Karti Hai:
     * ✅ 1. Class implements Comparable interface
     * Matlab us class ke objects ke paas compareTo() method hota hai.
     *
     * JVM usi method ko use karke sorting kar leta hai — ise natural sorting ya default sorting order kehte hain.
     *
     * ✔️ Example Classes:
     * String
     *
     * All Wrapper classes: Integer, Double, Character, Boolean...
     *
     * BigInteger, BigDecimal
     *
     * Date, LocalDateTime, etc.
     *
     * ❌ Jab Class Natural Sorting Support Nahi Karti:
     * ✖️ Class does NOT implement Comparable
     * JVM confuse ho jata hai ki kaise compare kare.
     *
     * Agar tum TreeSet ya sort() use karte ho bina Comparator diye, toh ClassCastException milta hai, for custom classes
     * like Student , Employee
     *
     * class Student {
     *    int id;
     *    String name;
     * }
     *
     * Agar tum TreeSet<Student> banaoge bina Comparable implement kiye — error aa jaayega.
     *
     *
     *
     * 🔧 Jab Tumhe Custom Sorting Karni Chahiye:
     * ✅ Tum khud decide karna chahte ho sorting ka logic:
     * Example: Student ko id se sort karna ya name se.
     *
     * Option 1: Class me hi implements Comparable<Student> likho and override compareTo method:
     *
     * class Student implements Comparable<Student> {
     *    int id;
     *    public int compareTo(Student s) {
     *        return this.id - s.id;
     *    }
     * }
     *
     * Option 2: Alag Comparator banao:
     *
     * -------------------------------------------------
     *
     * ✅ For String and Wrapper Classes (Integer, Double, etc.):
     * 🔹 Default Sorting (Natural Order):
     * TreeSet internally calls the compareTo() method of the Comparable interface.
     *
     * These classes (String, Integer, etc.) already implement Comparable, so tumhe kuch extra nahi karna hota.
     *
     * 🔸 Examples:
     * String → lexicographical order (dictionary order)
     *
     * Integer, Double → ascending numeric order
     *
     * 🔁 If You Want Custom Sorting (e.g., Descending Order):
     *
     * 🔸 Option 1: Use a Custom Comparator (Recommended)
     * TreeSet<Integer> set = new TreeSet<>((a, b) -> b - a);  // Descending order
     *
     * 🔸 Option 2: Use Comparator.reverseOrder()
     * TreeSet<String> set = new TreeSet<>(Comparator.reverseOrder());
     *
     *
     * 💡 What If You Have a Custom Class (e.g., Student)?
     *
     * Case 1: Want natural sorting → Implement Comparable
     *
     * class Student implements Comparable<Student> {
     *     int marks;
     *     public int compareTo(Student s) {
     *         return this.marks - s.marks; // Ascending
     *     }
     * }
     *
     * Case 2: Want custom sorting with multiple sorting strategies → Pass Comparator to TreeSet
     *
     * TreeSet<Student> set = new TreeSet<>((s1, s2) -> s2.marks - s1.marks); // Descending
     *
     *
     * 🔁 Important Note:
     * Comparable ka use tab hota hai jab ek class ka objects ka natural (default) sort order tum define karna chahte ho.
     * Agar multiple custom sortings chahiye (kabhi marks, kabhi name etc), tab Comparator use karna better hota hai.
     *
     * ✅ 1. Comparable — Natural Sorting (Default)
     * Agar tu Student class ke objects ko ek hi fixed (natural) sorting mein rakhna chahta hai (e.g., marks descending), to:
     *
     * Comparable interface implement karega
     * compareTo() method ke andar woh logic likhega
     *
     * Ye sorting har baar TreeSet ya Collections.sort() mein lagegi.
     *
     * ✅ 2. Comparator — Multiple/Custom Sorting
     * Jab tu chahta hai sorting:
     *
     * kabhi name ke according,
     * kabhi marks ke according,
     * kabhi descending, kabhi ascending...
     *
     * To tu Comparator use karega.
     *
     * Comparator<Student> nameSort = new Comparator<>() {
     *     public int compare(Student s1, Student s2) {
     *         return s1.name.compareTo(s2.name);  // sort by name
     *     }
     * };
     *
     * Comparator<Student> idDescSort = new Comparator<>() {
     *     public int compare(Student s1, Student s2) {
     *         return s2.id - s1.id;  // sort by id descending
     *     }
     * };
     *
     *
     */
}
