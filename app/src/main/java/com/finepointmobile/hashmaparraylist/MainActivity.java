package com.finepointmobile.hashmaparraylist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private HashMap<String, ArrayList<String>> mData;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);

        mData = new HashMap<>();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doTask();
            }
        });
    }

    private void doTask() {
        ArrayList<String> payload = new ArrayList<>();
        payload.add("Jake Flowers");
        mData.put("daniel", payload);
    }
}
