import java.util.*;

public class fac {
    public static void main(String[] args) {
        if (args.length == 0)
            return;

        int lastDigit = 0;
        int base = Integer.parseInt(args[0]);

        switch (base) {
        case 1:
            lastDigit = 1;
            break;
        case 2:
            lastDigit = 2;
            break;
        case 3:
            lastDigit = 6;
            break;
        case 4:
            lastDigit = 4;
            break;
        default:
            lastDigit = 0;
            break;
        }

        System.out.println("Last digit of " + base + "! is " + lastDigit);
    } // main
} // class