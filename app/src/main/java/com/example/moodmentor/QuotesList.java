package com.example.moodmentor;

public class QuotesList {
    private final String quoteTxt;
    private final String writer;

    public QuotesList(String quoteTxt, String writer) {
        this.quoteTxt = quoteTxt;
        this.writer = writer;
    }

    public String getQuoteTxt() {
        return quoteTxt;
    }

    public String getWriter() {
        return writer;
    }
}
