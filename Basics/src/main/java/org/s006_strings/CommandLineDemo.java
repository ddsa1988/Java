package org.s006_strings;

public class CommandLineDemo {
    public static void main(String[] args) {
        if(args == null){
            return;
        }
        
        System.out.printf("There are %d command-line arguments.\n", args.length);
        System.out.println("They are:");

        for (int i = 0; i < args.length; i++) {
            System.out.printf("arg[%d]: %s\n", i, args[i]);
        }
    }
}
