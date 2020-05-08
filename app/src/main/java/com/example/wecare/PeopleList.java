package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class PeopleList extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    RecyclerView aRecyclerView;
    RecyclerView.LayoutManager aLayoutManager;
    RecyclerView.Adapter aAdapter;
    ArrayList<User> userArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_list);

        aRecyclerView = (RecyclerView) findViewById(R.id.total);
        userArrayList = Array.data;

        aRecyclerView.setHasFixedSize(true);
        aLayoutManager = new LinearLayoutManager(this);
        aAdapter = new MainAdapter(userArrayList);
        aRecyclerView.setLayoutManager(aLayoutManager);
        aRecyclerView.setAdapter(aAdapter);

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTips();
            }
        });

        button2 = (Button) findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGejala();
            }
        });

        button3 = (Button) findViewById(R.id.button5);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

        button4 = (Button) findViewById(R.id.button6);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPeople();
            }
        });

        button2 = (Button) findViewById(R.id.button8);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForm();
            }
        });


    }

    public void openTips() {
        Intent intent = new Intent(this, Tips.class);
        startActivity(intent);
    }

    public void openGejala() {
        Intent intent = new Intent(this, GejalaPenyakit.class);
        startActivity(intent);
    }

    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openPeople() {
        Intent intent = new Intent(this, PeopleList.class);
        startActivity(intent);
    }

    public void openHospital() {
        Intent intent = new Intent(this, HospitalList.class);
        startActivity(intent);
    }

    public void openFeedback() {
        Intent intent = new Intent(this, Feedback.class);
        startActivity(intent);
    }

    public void openForm() {
        Intent intent = new Intent(this, Form.class);
        startActivity(intent);
    }

}
