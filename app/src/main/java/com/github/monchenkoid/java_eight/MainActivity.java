package com.github.monchenkoid.java_eight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.listFeatures);
        String[] arrayList = getBaseContext().getResources().getStringArray(R.array.features);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(adapter);
        list.setOnItemClickListener((adapterView, view, i, l) -> {
            String strings = arrayList[i];
            switch (strings){
                case "":
            }
        });
    }
}
