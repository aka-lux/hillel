package com.zakharchenko.homeworks.homework_04;

public class RevertWord {
    public static void main(String[] args) {
        System.out.println(revertWord("word"));
        System.out.println(revertWord("hello world"));
        System.out.println(revertWord("some!long@text#some$long%text^some&long*text"));
    }

    /**
     * This function reverts given word
     *
     * @param word given word
     * @return reverted word
     */
    private static String revertWord(String word) {
        StringBuilder strBuffer = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            strBuffer.append(word.charAt(i));
        }
        return strBuffer.toString();
    }
}
