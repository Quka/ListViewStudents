package arlind.trainlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private final Student[] students = Students.getAllStudents();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add a click listener on ListView items
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent( MainActivity.this, StudentDetailsActivity.class );
                intent.putExtra(StudentDetailsActivity.EXTRA_STUDENTID, (int) id);

                startActivity(intent);
            }
        };

        // Find the ListView, and set the OnItemClickListener
        ListView listStudents = findViewById(R.id.studentListView);
        listStudents.setOnItemClickListener(itemClickListener);

        // Populate the ListView with students
        ArrayAdapter<Student> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                students);
        listStudents.setAdapter(listAdapter);
    }
}
