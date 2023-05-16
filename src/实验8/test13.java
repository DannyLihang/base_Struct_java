import java.util.ArrayList;

public class test13 {
    /**
     * （使得 Course 类可复制）重写程序淸单 10-6（参见教材 P319）中的 Course 类，增加一
     * 个 clone 方法，执行 students 域上的深度复制
     */
}
class Course1 {
    private String courseName;
    ArrayList<String> students = new ArrayList<>();

    public Course1(String courseName) {
        this.courseName = courseName;
    }

    public void addStudents(String student) {
        students.add(student);
    }

    public void getStudents() {
        for(int i=0;i<getSize();i++)
            System.out.println(students.get(i));
    }

    public String getCourseName() {
        return courseName;
    }

    public int getSize() {
        return students.size();
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public ArrayList<String> clone(){
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            arrayList.add(students.get(i));
        }
        return arrayList;
    }
}