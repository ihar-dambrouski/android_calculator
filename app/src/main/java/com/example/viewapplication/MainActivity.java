package com.example.viewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View topButtonPanel = findViewById(R.id.top_button_panel);
        View bottomButtonPanel = findViewById(R.id.bottom_button_panel);
        final TextView clicksText = findViewById(R.id.clicksText);

        Button topButton = topButtonPanel.findViewById(R.id.clickBtn);
        Button bottomButton = bottomButtonPanel.findViewById(R.id.clickBtn);


        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setClicksCount(false, clicksText);
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setClicksCount(true, clicksText);
            }
        });


    }

    public void setClicksCount(boolean isDecriment, TextView textView) {
        System.out.println(isDecriment);
        if(isDecriment) {
            clicks--;
        } else {
            clicks++;
        }
        System.out.println(clicks + "");
        textView.setText(clicks + " Clicks");

    }

}
