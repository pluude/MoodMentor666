package com.example.moodmentor;

import java.util.ArrayList;
import java.util.List;

public class QuotesData {

    public static List<QuotesList> getMotivQuotes() {

        final List<QuotesList> motivQuotesList = new ArrayList<>();

        QuotesList motivQuote1 = new QuotesList("Life is a mountain. Your goal is to find your path, not to reach the top.", "- Bruce Lee");
        motivQuotesList.add(motivQuote1);

        //will be continued..


        return motivQuotesList;
    }


    public static List<QuotesList> getSadQuotesList() {

        final List<QuotesList> sadQuotesList = new ArrayList<>();

        QuotesList sadQuote1 = new QuotesList("For every minute you are sad you lose sixty second of happiness", "- Ralph Waldo");
        sadQuotesList.add(sadQuote1);

        //to be continued..

        return sadQuotesList;


    }


    public static List<QuotesList> getHappyQuotesList() {

        final List<QuotesList> happyQuotesList = new ArrayList<>();

        QuotesList happyQuote1 = new QuotesList("Happiness is not something ready-made. It comes from your own actions.", "- Dalai lama");
        happyQuotesList.add(happyQuote1);

        //to be continued..

        return happyQuotesList;


    }
}


