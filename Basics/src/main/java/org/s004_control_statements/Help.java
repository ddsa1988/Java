package org.s004_control_statements;

public class Help {
    public static void userMain() {
        char choice = ' ';

        showMenu();

        try {
            choice = (char) System.in.read();
        } catch (Exception e) {
            System.out.println("Invalid option!");
        }

        System.out.println();

        switch (choice) {
            case '1':
                showIfStatement();
                break;
            case '2':
                showSwitchStatement();
                break;
            default:
                System.out.println("Invalid option!");
        }

    }

    private static void showMenu() {
        System.out.println("Help on:");
        System.out.println("  1.If");
        System.out.println("  2.Switch");
        System.out.print("Choose one: ");
    }

    private static void showIfStatement() {
        System.out.print("if (condition) {\n  statement;\n}");
        System.out.print(" else {\n  statement;\n}");
    }

    private static void showSwitchStatement() {
        System.out.print("switch (expression) {\n");
        System.out.print("  case constant1:\n    statement;\n    break;\n");
        System.out.print("  case constant2:\n    statement;\n    break;\n");
        System.out.print("  case constant3:\n    statement;\n    break;\n");
        System.out.print("  default:\n    statement;\n}");
    }
}