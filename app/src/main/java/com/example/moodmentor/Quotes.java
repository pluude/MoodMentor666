package com.example.moodmentor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Quotes extends AppCompatActivity {

    private TextView quoteTxt, writerName;
    private final List<QuotesList> quotesLists = new ArrayList<>();

    //esamos citatos pozicija
    private int currentQuotePosition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        final TextView categoryName = findViewById(R.id.categoryName);
        quoteTxt = findViewById(R.id.quoteTxt);
        writerName = findViewById(R.id.writerName);

        final Button backBtn = findViewById(R.id.backBtn);
        final Button nextBtn = findViewById(R.id.nextBtn);
        final ImageView copyBtn = findViewById(R.id.copyBtn);

        //gaunam kategorijos pavadinima is is categoriesAdapter klases
        final String getName = getIntent().getStringExtra("name");


        //setinam kategoriju pavadinimus i TextView
        categoryName.setText(getName);

        //tikrinam kateogrija ir gaunam quote'a kuris correspondina i category
        if(getName.equals("Sad")) {
            quotesLists.addAll(QuotesData.getSadQuotesList());

        }

        setQuoteToTextView();

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        copyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //galimybe kopijuoti citata ir autoriu
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("quote",quotesLists.get(currentQuotePosition).getQuoteTxt()+"\nby "+quotesLists.get(currentQuotePosition).getWriter());
                clipboardManager.setPrimaryClip(clipData);
            }
        });


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void setQuoteToTextView() {
        quoteTxt.setText(quotesLists.get(currentQuotePosition).getQuoteTxt());
        //writer info
        writerName.setText(quotesLists.get(currentQuotePosition).getWriter());

    }
}