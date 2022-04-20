package com.example.sic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class News5 extends AppCompatActivity {
    public void tonews6(View view)
    {
        Button button =  findViewById(R.id.check);
        Intent intent = new Intent(this,News6.class);
        startActivity(intent);
    }
    public void backnews4(View view)
    {
        Button button =  findViewById(R.id.check);
        Intent intent = new Intent(this,News4.class);
        startActivity(intent);
    }
    public void alert5(View view)
    {
        AlertDialog.Builder builder
                = new AlertDialog
                .Builder(News5.this);
        builder.setMessage("This news is marked TRUE");
        builder.setTitle("PREDICTION!");
        builder.setCancelable(false);
        builder
                .setNegativeButton(
                        "OK",
                        new DialogInterface
                                .OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which)
                            {

                            }
                        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news5);
    }
}