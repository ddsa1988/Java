package org.s006_strings;

public class PhoneDemo {
    public static void main(String[] args) {
        String[][] phones = {
                { "Tom", "555-3322" },
                { "Mary", "555-8976" },
                { "Jon", "555-1037" },
                { "Rachel", "555-1400" }
        };

        if (args == null || args.length != 1) {
            return;
        }

        String input = args[0];
        int phonesLength = phones.length;
        int i;

        for (i = 0; i < phonesLength; i++) {
            int indexName = 0;
            int indexPhone = 1;

            if (input.equals(phones[i][indexName])) {
                System.out.printf("%s: %s\n", input, phones[i][indexPhone]);
                break;
            }
        }

        if (i == phonesLength) {
            System.out.println("Name not found.");
        }
    }
}
