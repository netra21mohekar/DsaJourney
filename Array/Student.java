import java.util.*;

public class Student {
     int rollno;
    String name;
    Character division;

    public Student(int rollno,String name,Character division){
        this.rollno = rollno;
        this.name = name;
        this.division = division;
    }

    public String toString(){
        return "Student{name='" + name + "', rollno =" + rollno + ", division =" + division + "}";
    }

}
 class mycmp implements Comparator<Student>{
    public  int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
}
class mycmproll implements Comparator<Student>{
    public int compare(Student a,Student b){
        return Integer.compare(a.rollno, b.rollno);
    }
}

class test{
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student(28,"netra",'b'));
        s.add(new Student(8,"pratik",'c'));
        s.add(new Student(2,"sakshi",'b'));
        s.add(new Student(9,"gauri",'b'));
        Collections.sort(s,new mycmp());

        System.out.println("Sorted by Name:");
        for (Student student : s) {
            System.out.println(student.name);
        }
        Collections.sort(s,new mycmproll());
        for (Student student : s) {
            System.out.println(student.rollno);
        }
    }
}
