package io.fumiaki.androidseimeiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class MyForm extends AppCompatActivity {

    public final static String EXTRA_MYNAME = "io.fumiaki.androidseimeiapp.MYNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void getScore(View view) {
        // EditText取得
        EditText myEditText = (EditText) findViewById(R.id.myEditText);

        // EditTextの中身を取得
        String myName = myEditText.getText().toString().trim();

        if (myName.equals("")) {

            myEditText.setError("please enter your name");

            /*
            Toast.makeText(
                    this,
                    "please enter your name",
                    Toast.LENGTH_LONG
            ).show();
            */

            /*
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder
                    .setTitle("Error")
                    .setMessage("please enter your name")
                    .setPositiveButton("OK", null);
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
            */

        } else {
            // 次の画面へ
            Intent intent = new Intent(this, MyResult.class);
            intent.putExtra(EXTRA_MYNAME, myName);
            startActivity(intent);
        }

    }
}
