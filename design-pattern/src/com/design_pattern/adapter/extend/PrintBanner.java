package com.design_pattern.adapter.extend;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String message) {
        super(message);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
    
}
