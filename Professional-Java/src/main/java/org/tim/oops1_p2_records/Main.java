package org.tim.oops1_p2_records;

public class Main {

    public static void main(String[] args) {

        // initializing the Record
        LPAStudent  student = new LPAStudent("S92300", "Tim", "03/11/1985", "Java Masterclass");
        System.out.println(student); // Record toString method is overridden to print record details
        // LPAStudent[id=S92300, name=Tim, dateOfBirth=03/11/1985, classList=Java Masterclass]
        System.out.println(student.name() + " " + student.dateOfBirth() + " " + student.id() + " " + student.classList());
        // Tim 03/11/1985 S92300 Java Masterclass

        System.out.println();
        System.out.println();

        // creating multiple instances of LPAStudent record
        for (int i=1; i<=3; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Tim";
                        case 2 -> "Bill";
                        case 3 -> "Carol";
                        case 4 -> "Mary";
                        case 5 -> "Harry";
                        default -> "Anonymous";
                    },
                    "03/11/1985",
                    "Java Masterclass");

            System.out.println(s);
            /**
             * output
             * LPAStudent[id=S923001, name=Tim, dateOfBirth=03/11/1985, classList=Java Masterclass]
             * LPAStudent[id=S923002, name=Bill, dateOfBirth=03/11/1985, classList=Java Masterclass]
             * LPAStudent[id=S923003, name=Carol, dateOfBirth=03/11/1985, classList=Java Masterclass]
             */
        }
    }
}
