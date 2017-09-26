package com.allen.code.testmaven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.allen.code.alibrary.NameUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        NameUtils name = new NameUtils();
        Toast.makeText(this, name.getName(), Toast.LENGTH_SHORT).show();

    }
}
