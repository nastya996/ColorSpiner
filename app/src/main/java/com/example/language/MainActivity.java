package com.example.language;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.LayoutDirection;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.security.cert.Extension;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);

    }

    public void btnOk(View view) {
        Locale locale;
        Spinner spinner = findViewById(R.id.spinnerLanguage);
        int position = spinner.getSelectedItemPosition();
        if (position == 1) {
            locale = new Locale("ru");
        } else {
            locale = new Locale("eng");
        }

        Spinner colorSinner = findViewById(R.id.spinnerColor);
        Utils.changeToTheme(this, colorSinner.getSelectedItemPosition());


        Configuration config = new Configuration();
        config.setLocale(locale);
        getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        recreate();


    }

    public void onClick(View v) {
        switch (this.n) {
            case 0:
                Utils.changeToTheme(this, Utils.THEME_BLACK);
                this.n = 1;
                return;
            case 1:
                Utils.changeToTheme(this, Utils.THEME_GREEN);
                this.n = 2;
                return;
            case 2:
                Utils.changeToTheme(this, Utils.THEME_BLUE);
                this.n = 3;
                return;

            default:
                break;


        }

    }

}