package com.example.meghan.classdemo111616;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    //declare all widgets
    private Button buttonGo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link widget to UI
        buttonGo = (Button) findViewById(R.id.buttonGo) ;

        //Start listeners
        buttonGo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //This will happen when the button gets clicked
        //Toast.makeText(this, "You just clicked the button - Boooo!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);


    }
}
