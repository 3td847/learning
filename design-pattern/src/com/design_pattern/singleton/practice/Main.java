package com.design_pattern.singleton.practice;

public class Main {
    public static void main(String[] args) {

        // テスト用にインスタンスの呼び出しを2つ記述
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();

        System.out.println(ticketMaker1.getTicketNextNumber()); // 1000
        System.out.println(ticketMaker2.getTicketNextNumber()); // 1001
    }
}
