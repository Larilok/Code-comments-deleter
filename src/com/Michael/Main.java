package com.Michael;

public class Main {

    public static void main(String[] args) {
        TextWorker t = TextWorker.manualInit();
        t.delCommentsWODocCom();
        System.out.println(t.getData());
    }
}
