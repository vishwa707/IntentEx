package com.example.intentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        ed = findViewById(R.id.editTextText);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ed.getText().toString();
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(in);
            }
        });
    }
}
