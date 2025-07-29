package com.design_pattern.singleton.practice;

public class TicketMaker {
    // Practice 5-1-1. インスタンスの生成を追記
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;

    // Practice 5-1-2. クラス外からのnewの禁止を追記
    private TicketMaker() {
        System.out.println("TicketMakerインスタンスの生成");
    }
    
    // Practice 5-1-3. インスタンス取得のstaicメソッド追記
    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public int getTicketNextNumber() {
        return ticket++;
    }
}
