import java.util.*;

public class cmd {
    public static void main(String[] args) {
        if (args.length == 0)
            return;

        int index = 0;
        switch (args[0]) {
        case "-a":
            for (index = 1; index < args.length; index++) {
                System.out.println(args[index]);
            } // for
            break;
        case "-i":
            index = Integer.parseInt(args[1]) + 1;
            String value = args[index];
            System.out.println(Double.parseDouble(value) + 1);
            break;
        case "-ai":
        case "-ia":
            for (index = 1; index < args.length; index++) {
                String argument = args[index];
                if (argument.matches("^\\d+$")) {
                    System.out.println(Double.parseDouble(argument) + 1);
                } else {
                    System.out.println(argument);
                } // if
            } // for
            break;
        case "-h":
            System.out.println("-h : prints help");
            System.out.println("-i : increment integer at the provided index");
            System.out.println("-a : prints all parameters");
            break;
        default:
            index = Integer.parseInt(args[0]);
            System.out.println(args[index]);
            break;
        } // switch
    } // main
} // class