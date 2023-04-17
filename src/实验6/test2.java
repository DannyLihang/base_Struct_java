public class test2 {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        Staff staff = new Staff();
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
class Person{
    private String name="java";
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTele() {
        return tele;
    }

    public String getEmail() {
        return email;
    }

    private String tele;
    private String email;
    public String toString(){
        return "person "+ getName();
    }
}
class Student extends Person{
    private String statue;
    public String toString(){
        return "Student "+ getName();
    }
}
class Employee extends Person{
    private String workPlace;
    private double salary;
    private String date;
    public String toString(){
        return "Employee "+ getName();
    }
}
class Faculty extends Employee{
    private String workDate;
    private int grade;
    public String toString(){
        return "Faculty "+ getName();
    }
}
class Staff extends Employee{
    private String workName;
    public String toString(){
        return "Staff "+ getName();
    }
}