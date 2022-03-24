package com.example.spesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewListActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY =
            "com.example.android.spesa.extra.REPLY";
    private EditText titreListe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_list);
        titreListe = findViewById(R.id.editTexte);

    }

    public void launchEditActivity(View view) {
        Intent intent = new Intent();
        String message = titreListe.getText().toString();
        intent.putExtra(EXTRA_REPLY, message);
        setResult(RESULT_OK, intent);
        finish();
    }
}