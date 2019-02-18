package arlind.trainlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_STUDENTID = "studentId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        // Get the student from the intent
        int studentId = (Integer) getIntent().getExtras().get(EXTRA_STUDENTID);
        Student student = Students.getStudentById(studentId);

        // -- Populate view fields --
        // Populate the student name
        TextView name = findViewById(R.id.name);
        name.setText(student.getName());

        // Populate student description
        TextView email = findViewById(R.id.email);
        email.setText(student.getEmail());

        // Populate student image
        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(student.getImageResId());
        photo.setContentDescription(student.getName());


    }
}
