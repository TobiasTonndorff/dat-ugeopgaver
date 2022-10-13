import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
ArrayList<String> rndCourses = new ArrayList<>();
rndCourses.add("Hækling A");
rndCourses.add("Programming A");
rndCourses.add("Math D");
rndCourses.add("Science A");
rndCourses.add("Dansk A");
rndCourses.add("Idræt A");
rndCourses.add("kaffedrikning A+");

String[] studentNames = {"Tobias", "Jakob", "Anders", "Chris"};
String[] teacherNames = {"Peter", "Oscar", "jørgen", "karl-åge"};
ArrayList<Person> pp1 = new ArrayList<>();
for(int i = 0; i < 3; i++){
    pp1.add(new Student(studentNames[i], rndCourses(rndCourses) ));
    pp1.add(new Teacher(teacherNames[i], rndCourses(rndCourses) ));
}
        System.out.println(pp1);
pp1.get(1).addCourse("Java 1.0");
pp1.get(2).addCourse("Java 1.0");

for(int i = 0; i < pp1.size(); i++) {
    var res = pp1.get(i).addCourse("Java 1.0");
    if(!res) {
        if(pp1.get(i) instanceof Student) {
            System.out.println(pp1.get(i).getName() + " Har allerede bestået dette kursus");
        } else{
            System.out.println(pp1.get(i).getName()+"kan ikke undervise i dette fag");
        }
    }
}
    }


    public static ArrayList rndCourses(ArrayList<String> c){
        ArrayList<String> tmpArrlist = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            Random rand = new Random();
            tmpArrlist.add(c.get(rand.nextInt(4)));
        }
        return tmpArrlist;
    }
}