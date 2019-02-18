package arlind.trainlistview;

public class Students {
    private static final Student[] students = new Student[]{
            new Student(0, "Arlind", "arlind@email.dk", R.drawable.blue_booi),
            new Student(1, "Zaki", "zaki@email.dk", R.drawable.grill),
            new Student(2, "Benjamin", "benjamin@email.dk", R.drawable.other_grill)
    };

    public static Student[] getAllStudents() {
        return students;
    }

    public static Student getStudentById(int id) {
        for (Student s : students) {
            if(s.getId() == id) return s;
        }

        return null;
    }
}
