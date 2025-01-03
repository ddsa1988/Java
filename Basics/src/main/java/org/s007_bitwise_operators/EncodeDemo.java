package org.s007_bitwise_operators;

public class EncodeDemo {
    // Use XOR to encode and decode a message.
    public static void userMain() {
        String msg = "This is a test.";
        int key = 88;

        String encMsg = encodeMsg(msg, key);
        String decMsg = encodeMsg(encMsg, key);

        System.out.println(encMsg);
        System.out.println(decMsg);
    }

    private static String encodeMsg(String msg, int key) {
        if(msg == null){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        int msgLength = msg.length();

        for (int i = 0; i < msgLength; i++) {
            char ch = (char) (msg.charAt(i) ^ key);
            sb.append(ch);
        }

        return sb.toString();
    }
}
