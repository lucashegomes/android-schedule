package br.com.projeto.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class StudentsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);

        String[] students = {"Lucas", "Maria", "José"};
        ListView studentsList = (ListView) findViewById(R.id.students_list);

        //Adapta as strings de alunos para uma view, passando esta própria activity e o layout padrao do android para exibir a lista de estudantes adaptada
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, students);
        studentsList.setAdapter(adapter);

        Button newStudent = (Button) findViewById(R.id.button_new_student);
        newStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentOpenForm = new Intent(StudentsListActivity.this, FormActivity.class);
                startActivity(intentOpenForm);
            }
        });
    }
}
