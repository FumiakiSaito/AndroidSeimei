package io.fumiaki.androidseimeiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MyResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MyForm.EXTRA_MYNAME);

        TextView nameLabel = (TextView) findViewById(R.id.nameLabel);
        nameLabel.setText(myName + "の点数は…");
    }

}
