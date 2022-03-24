package com.example.spesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    private TextView nouvelleListe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        nouvelleListe = findViewById(R.id.laListe);

    }

    public void launchNewListActivity(View view) {
        Intent intent = new Intent(this, NewListActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply =
                        data.getStringExtra(NewListActivity.EXTRA_REPLY);
                nouvelleListe.setVisibility(View.VISIBLE);
                nouvelleListe.setText(reply);
            }
        }
    }

}