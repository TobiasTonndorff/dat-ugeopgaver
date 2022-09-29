package Task1;

import Task1.Course;
import Task1.Student;

public class TestStudents{
    public static void main(String[] args) {
        Student a = new Student("Tobias");
        Student b = new Student("Anders");
        Student c = new Student("Chris");
        Student d = new Student("XX");
        Course basic = new Course("Basic Programming");
        Course algorithm = new Course("Algorithms");
        Course web = new Course("Web Programming");
        Course databases = new Course("Databases");

        a.addCourse(basic);
        a.addCourse(algorithm);

        b.addCourse(basic);
        b.addCourse(web);
        b.addCourse(algorithm);

        c.addCourse(basic);
        c.addCourse(databases);

        d.addCourse(algorithm);
        d.addCourse(databases);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}

