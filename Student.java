package Task1;

import Task1.Course;

import java.util.ArrayList;

public class Student {

    private String name;
   private ArrayList<String> courses = new ArrayList<String>();

public Student(String name){
    this.name = name;
}

    public void addCourse(Course aCourse)
    {
        if (aCourse == null)
        {
            return;
        }

        courses.add(aCourse.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
public String toString(){
    return "Task1.Student " + name + courses;
}
}
