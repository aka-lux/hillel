package com.zakharchenko.homeworks.hw_01;

public class task_04 {
    public static void main(String[] args) {
        String str = "This is just an example string for test";
        String[] words = str.split("\\s");
        str = "";
        char[] buf;
        for (int i=0; i<words.length; i++){
            buf = words[i].toCharArray();
            buf[0] = Character.toUpperCase( words[i].toCharArray()[0] );
            str = str + String.valueOf(buf) + " ";


        }
        System.out.print(str);
    }


//    Given any sentence. Write a program that will change first letter of each word to capital letter
//    For ex: "This is just an example string for test"
//    Should be: "This Is Just An Example String For Test"

}
