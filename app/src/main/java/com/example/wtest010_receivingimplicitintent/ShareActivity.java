package com.example.wtest010_receivingimplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ShareActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_activity);

        Intent intent = getIntent();
        String str = intent.getStringExtra(Intent.EXTRA_TEXT);
        ((EditText) findViewById(R.id.etFileContent)).setText(str);
    }
}
