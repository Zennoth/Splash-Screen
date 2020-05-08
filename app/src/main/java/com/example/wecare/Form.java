package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.android.material.textfield.TextInputLayout;

public class Form extends AppCompatActivity implements TextWatcher {

    TextInputLayout Name, Gender, Age, Bloodtype, Weight, Height, Complaints ;
    Button button;
    String aName, aGender, aAge, aBloodtype, aWeight, aHeight, aComplaints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Name = findViewById(R.id.form1);
        Gender = findViewById(R.id.form2);
        Age = findViewById(R.id.form3);
        Bloodtype = findViewById(R.id.form4);
        Weight = findViewById(R.id.form5);
        Height = findViewById(R.id.form6);
        Complaints = findViewById(R.id.form7);

        button = findViewById(R.id.button9);

        Name.getEditText().addTextChangedListener(this);
        Gender.getEditText().addTextChangedListener(this);
        Age.getEditText().addTextChangedListener(this);
        Bloodtype.getEditText().addTextChangedListener(this);
        Weight.getEditText().addTextChangedListener(this);
        Height.getEditText().addTextChangedListener(this);
        Complaints.getEditText().addTextChangedListener(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aName = Name.getEditText().getText().toString().trim();
                aAge = Age.getEditText().getText().toString().trim();
                aGender = Gender.getEditText().getText().toString().trim();
                aBloodtype = Bloodtype.getEditText().getText().toString().trim();
                aWeight = Weight.getEditText().getText().toString().trim();
                aHeight = Height.getEditText().getText().toString().trim();
                aComplaints = Complaints.getEditText().getText().toString().trim();
                System.out.println(aName);

                User user = new User(aName,aGender,aAge,aBloodtype,aWeight,aHeight,aComplaints);
                Array.data.add(new User(aName,aGender,aAge,aBloodtype,aWeight,aHeight,aComplaints));
                System.out.println(Array.data.get(0).getName());
                Intent intent = new Intent(Form.this, PeopleList.class);
//                intent.putExtra("dataUser", user);
                startActivity(intent);
            }
        });


    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
