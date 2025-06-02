package com.easybytes.sec14exception;

public class P3_1_MultipleCatchBlocksNotes {

    /*
    In Java, starting from version 7, you can handle multiple exceptions in a single catch block by
    using the pipe (|) symbol.
    This feature is useful when you want to perform the same action for different types of exceptions,
    thereby reducing code duplication and improving readability.

     try {
            // Some code that may throw different types of exceptions
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            // This block handles both ArrayIndexOutOfBoundsException and NullPointerException
            System.out.println("An exception occurred: " + e);
        }

        Try Block:

        The try block contains code that might throw different types of exceptions

        Catch Block:

        The catch block uses the pipe symbol (|) to separate different exception types that it
        can handle.
        If an ArrayIndexOutOfBoundsException or NullPointerException is thrown in the try block,
        the catch block will handle it.

        Points to Note:

        Same Action for Different Exceptions: This feature is useful when you want to perform the
        same action for different types of exceptions.

         Common Superclass: If the exceptions have a common superclass (other than Exception),
         you might consider catching the superclass instead.
         However, using the pipe symbol allows for more specific exception handling.

         Final Variables: The exceptions caught using this feature are effectively final within the
         catch block.
         This means you cannot assign a new value to the exception variable.

         Example

         Let's say you have a piece of code that might throw IOException or SQLException,
         and you want to log the error message and print a generic error message to the user
         for both exceptions.

         Without using the multi-catch block, you would write something like this:

         try {
    // Some code that may throw IOException or SQLException
} catch (IOException e) {
    System.err.println("An I/O error occurred: " + e.getMessage());
    // Perform some common action, like logging the error
} catch (SQLException e) {
    System.err.println("A database error occurred: " + e.getMessage());
    // Perform the same common action, like logging the error
}

Notice that the action taken in both catch blocks is the same: printing an error message and
performing some common action.

Using the multi-catch feature, you can handle both exceptions in a single catch block:

try {
    // Some code that may throw IOException or SQLException
} catch (IOException | SQLException e) {
    System.err.println("An error occurred: " + e.getMessage());
    // Perform some common action, like logging the error
}

Benefits

Reduced Code Duplication: You don't have to write the same code multiple times for each exception type.
Improved Readability: The code is easier to read and understand because the common handling logic
                      is centralized.
Easier Maintenance: If you need to change the common handling logic, you only need to do it in one place.


 So in Hindi, if your code can throw multiple exceptions and for each of them u want to do
 same action in catch block, then instead of handling each exception in diff catch block
 u can use single catch block and handle multiple exception using pipe symbol
 and provide comman code for them
     */


}
