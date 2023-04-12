public class test07 {
    public static void main(String[] args) {
    /*
编写一个测试程序，创建一门课程，添加三个学生，删除一个学生，然后显示这门课程
的学生。
         */
        Course01 course01 = new Course01("course");
        course01.addStudent("Danny");
        course01.addStudent("Tom");
        course01.addStudent("Jack");
        course01.dropStudent("Tom");
        String []str = new String[2];
        str = course01.getStudents();
        System.out.println("选课学生：");
        for (int i = 0; i < 2; i++) {
            System.out.println(str[i]);
        }
    }
}
class Course01{
    private String name;
    private String[] students = new String[100];
    private int number;

    public Course01(String name){
        this.name =name;
    }

    public void addStudent(String student){
        if (number >= student.length()){
            String[] temp = new String[number + 50];
            for (int i = 0 ; i < number ; i++){
                temp[i] = students[i];
            }
            students = temp;
        }
        students[number] = student;
        number++;
    }

    public String[] getStudents(){
        String[] res = new String[number];
        for (int i = 0 ; i < number ; i++){
            res[i] = students[i];
        }
        return res;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public void dropStudent(String student){
        for (int i = 0 ; i < number ; i++){
            if (students[i].equals(student)){
                for (; i < number ; i++){
                    students[i] = students[i+1];
                }
                number--;
                return;
            }
        }
    }

    public void clear(){
        String[] temp = new String[100];
        students = temp;
    }
}
