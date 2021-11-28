package com.example.mvp_test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements MainConstants.View{
    MainConstants.Presenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);
        initListener();
    }
    public void initListener() {
        String inputA = ((EditText)findViewById(R.id.editInputA)).getText().toString();
        String inputB = ((EditText)findViewById(R.id.editInputB)).getText().toString();
        findViewById(R.id.btnResult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.addNums(inputA, inputB);
            }
        });

    }
    @Override
    public void showResult(int result) {
        ((TextView)findViewById(R.id.txtResult)).setText(Integer.toString(result));

    }
}