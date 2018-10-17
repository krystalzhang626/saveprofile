package com.example.zhangyuying.saveprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText name, email;
    Button save;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.name);
        email=(EditText) findViewById(R.id.email);
        save=(Button) findViewById(R.id.save);

        databaseReference= FirebaseDatabase.getInstance().getReference("user");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adddata();

            }
        });
    }
    private void adddata(){
        String username,useremail;
        username=name.getText().toString().trim();
        useremail=email.getText().toString().trim();
        String id=databaseReference.push().getKey();
        user user=new user(username,useremail);

        databaseReference.child(id).setValue(user);


    }
}
