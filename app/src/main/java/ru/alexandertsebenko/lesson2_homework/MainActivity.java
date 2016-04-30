package ru.alexandertsebenko.lesson2_homework;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonFlat;
import com.gc.materialdesign.views.ButtonRectangle;

public class MainActivity extends Activity implements View.OnClickListener {

    ButtonFlat button1;
    ButtonFlat button2;
    ButtonFlat button3;
    ButtonRectangle button4;
    TextView textHeader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (ButtonFlat) findViewById(R.id.buttonflat1);
        button2 = (ButtonFlat) findViewById(R.id.buttonflat2);
        button3 = (ButtonFlat) findViewById(R.id.buttonflat3);
        button4 = (ButtonRectangle) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        textHeader = (TextView) findViewById(R.id.textView);

        Typeface day28 = Typeface.createFromAsset(getAssets(), "day28.ttf");
        textHeader.setTypeface(day28);

    }
    public void  onClick(View v) {
        switch (v.getId()){
            case R.id.button4:
                Toast.makeText(MainActivity.this,"inEnglish",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void clickBackButton(View view) {
        setContentView(R.layout.activity_main);
    }

    public void onClickButton1(View view) {
        setContentView(R.layout.activity_pro);
    }

    public void onClickButton3(View view) {
        setContentView(R.layout.activity_contact);
    }
}
