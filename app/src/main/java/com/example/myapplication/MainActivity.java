package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    EditText etStudentName;
    EditText etGrade;
    EditText etStudentQuery;
    Button addStudentBtn,checkStudentBtn,logSortedGradesBtn;
    HashMap<String,Integer>students=new HashMap<>(String,Integer);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        etStudentName = findViewById(R.id.etStudentName);
        etGrade = findViewById(R.id.etGrade);
        etStudentQuery = findViewById(R.id.etStudentQuery);
        addStudentBtn =findViewById(R.id.addStudentBtn);
        checkStudentBtn = findViewById(R.id.checkStudentBtn);
        logSortedGradesBtn = findViewById(R.id.logSortedGradesBtn);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });
        addStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student tempStudent=new Student();
                tempStudent.name =etStudentName.getText().toString();
                tempStudent.grade=Integer.parseInt(etGrade.getText().toString());
                
            }
        });
    }
}