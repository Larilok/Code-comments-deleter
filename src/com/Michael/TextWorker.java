package com.Michael;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextWorker {
    private String data;

    /**
     * Manual text input
     */

    void manualInit() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\nEOF\n");
        System.out.println("Input your text in here. When finished, press Enter, type \"EOF\" and press Enter again");
        data = sc.next();
    }

    /**
     * Init your text randomly
     */

    void randInit() {
        int length = (int) (Math.random() * 500 + 200);
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < length; i++) {
            temp.append((char) (Math.random() * 256));
        }
        data = temp.toString();
    }

    void delCommentsWODocCom(){
        StringBuilder temp = new StringBuilder();
        String REGEX = "[^:|]((?:/\\*(?:[^*]|\\R|(?:\\*+(?:[^*/]|\\R)))*\\*+/)|//.*)";
        System.out.println("The regex using to del comments is : " + REGEX);
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(data);
        while(m.find()){
            m.appendReplacement(temp, "");
        }
        m.appendTail(temp);
        /* String[] strings;
        *
        * Damn C-style comments                                                 SOLVED
        *
        ****/


        /****
         * Common multi-line comment style.
         ****/

        String string = new String("https://github.com/Larilok/Java_Lab2");     //SOLVED
        /*
         * Another common multi-line comment style.
         */

        /* Some comment around*/


        //temp.append(data.replaceAll("[^:|]((?:/\\*(?:[^*]|\\R|(?:\\*+(?:[^*/]|\\R)))*\\*+/)|//.*)", ""));
        System.out.println(temp.toString());  //[/][*/].+([*][/])?  single line comment beh text SOLVED

        /*"[01]?[0-9]|2[0-3]:[0-5][0-9]"  multi line comment in one line        SOLVED */

        /* (\r)?\n+
        strings = data.split("\\R");                                SOLVED
        for (String string : strings) {   multi line comment                    */

        //((?!https?))[^:][/][*/][^*].*(\R)*([*][/])?      single line comment  SOLVED
        //}                                    (\".*?\"|\'.*?\')|(/\*.*?\*/|//[^\r\n]*$)
        //                       (\".*?(?<!\\)\"|\'.*?(?<!\\)\')|(/\*.*?\*/|//[^\r\n]*$)

        // The comment around this code has been commented out.
        // /*       WT
        // */       FRRR



    }
}
