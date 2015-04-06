package com.expresso.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Akshay M on 4/5/2015.
 */
public class SignIn extends Activity implements View.OnClickListener{
    Button btn_signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        getWidgetReferences();
        bindWidgetEvents();
        initialization();
    }

    private void getWidgetReferences() {
        btn_signin= (Button) findViewById(R.id.btn_signin);
    }

    private void bindWidgetEvents() {
        btn_signin.setOnClickListener(this);
    }

    private void initialization() {
    }

    @Override
    public void onClick(View v) {
            Intent i=new Intent(SignIn.this,MainActivity.class);
            startActivity(i);
    }
}