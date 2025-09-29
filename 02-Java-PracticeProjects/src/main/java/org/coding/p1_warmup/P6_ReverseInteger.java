package org.coding.p1_warmup;

public class P6_ReverseInteger {

    public static int reverse(int x) {

        int reverse = 0;

        int sign = (x < 0) ? -1 : 1;  // store the sign

        x = Math.abs(x); // work with positive value

        while (x > 0) {
            int rem = x % 10;
            reverse = reverse * 10 + rem;
            x = x / 10;
        }

        reverse = reverse * sign;  // restore sign
        System.out.println(reverse);

        return reverse;
    }

    public static int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;

            // check overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            rev = rev * 10 + rem;
            x /= 10;
        }

        System.out.println(rev);
        return rev;
    }

    public static void main(String[] args) {
        reverse(123);
        reverse(-123);
        reverse(120);

        System.out.println();

        reverse2(123);
        reverse2(-123);
        reverse2(120);

        System.out.println();

    }
}
