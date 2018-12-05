package com.Michael;


import java.util.Scanner;


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

       /* String[] strings;
        *
        * Damn C-style comments                                                 TODO
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
        StringBuilder temp = new StringBuilder();



        /*"[01]?[0-9]|2[0-3]:[0-5][0-9]"  multi line comment in one line        SOLVED */

        /* (\r)?\n+
        strings = data.split("\\R");                                SOLVED
        for (String string : strings) {   multi line comment                    */

        //((?!https?))[^:][/][*/][^*].*(\R)*([*][/])?      single line comment  SOLVED

            temp.append(data.replaceAll("[^:]((/\\*([^*]|\\R|(\\*+([^*/]|\\R)))*\\*/)|//.*)", "")).append('\n');    //TODO
        //}

        // The comment around this code has been commented out.
        // /*       WT
            System.out.println(temp.toString());  //[/][*/].+([*][/])?  single line comment beh text SOLVED
        // */       FRRR



    }
}
