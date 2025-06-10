package org.tim.sec7basicoops1;

public class P3_DefaultValuesDemo {

    // All these fields will have default values
    private boolean flag;           // false
    private byte byteValue;         // 0
    private short shortValue;       // 0
    private int intValue;           // 0
    private long longValue;         // 0L
    private char charValue;         // '\u0000'
    private float floatValue;       // 0.0f
    private double doubleValue;     // 0.0
    private String stringValue;     // null
    private int[] arrayValue;       // null

    public void printDefaults() {
        System.out.println("=== DEFAULT VALUES ===");
        System.out.println("boolean: " + flag);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("char: '" + charValue + "' (ASCII: " + (int)charValue + ")");
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("String: " + stringValue);
        System.out.println("Array: " + arrayValue);
    }
}
