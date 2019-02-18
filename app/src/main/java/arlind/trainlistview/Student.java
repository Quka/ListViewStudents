package arlind.trainlistview;

public class Student {

    private int id;
    private String name;
    private String email;
    private int imageResId;

    /**
     *
     * @param id
     * @param name
     * @param email
     * @param imageResId
     */
    public Student(int id, String name, String email, int imageResId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.imageResId = imageResId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getImageResId() {
        return imageResId;
    }

    @Override
    public String toString() {
        return name + " | Email: " + email;
    }
}
