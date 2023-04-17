import java.util.ArrayList;

public class test5 {
    public static void main(String[] args) {

    }

}
 class Course1 {
    private String courseName;
    private ArrayList<String> students;

    public Course1(String courseName){
        this.courseName=courseName;
        students=new ArrayList<>();
    }
    public void addStudent(String student){
        students.add(student);
    }
    public ArrayList<String> getStudents(){
        return students;
    }
    public String getCourseName(){
        return courseName;
    }
    public void clear(){
        students.clear();
    }
    public void dropStudent(String student){
        students.remove(students.indexOf(student));
    }
    public void println(){
        ArrayList<String>str=students;
        System.out.println(str);
    }
}