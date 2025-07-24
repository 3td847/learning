package com.design_pattern.adapter.deligation;

public class PrintBanner extends Print {
    
    private Banner banner;

    public PrintBanner(String message) {
        banner = new Banner(message);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
    
}
