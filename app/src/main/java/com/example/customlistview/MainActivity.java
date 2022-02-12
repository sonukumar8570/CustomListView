package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Hero> heroList;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        heroList.add(new Hero(R.drawable.facebook, "Facebook", "Avengers"));
        heroList.add(new Hero(R.drawable.youtube, "Youtube", "Injustice Gang"));
        heroList.add(new Hero(R.drawable.whatapp, "Whatapp", "Avengers"));
        heroList.add(new Hero(R.drawable.twitter, "Twitter", "Avengers"));
        heroList.add(new Hero(R.drawable.insta, "Instagram", "Avengers"));




        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);

        listView.setAdapter(adapter);
    }
}
