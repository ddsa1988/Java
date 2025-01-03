package org.s007_bitwise_operators;

public class Encode {
    // Use XOR to encode and decode a message.
    public static void userMain() {
        String msg = "This is a test.";
        String key = "abcdefghi";

        String encMsg = encodeMsg(msg, key);
        String decMsg = encodeMsg(encMsg, key);

        System.out.println(encMsg);
        System.out.println(decMsg);
    }

    private static String encodeMsg(String msg, String key) {
        if(msg == null || key == null){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        int keyNumber = 0;
        int keyLength = key.length();
        int msgLength = msg.length();

        for (int i = 0; i < keyLength; i++) {
            keyNumber += key.charAt(i);
        }

        System.out.println(keyNumber);

        for (int i = 0; i < msgLength; i++) {
            char ch = (char) (msg.charAt(i) ^ keyNumber);
            sb.append(ch);
        }

        return sb.toString();
    }
}
