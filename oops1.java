
class Student{
    String name;
    int roll_no;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }
}
public class oops1{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("SAGNIK");
        s.setRoll_no(64);
        System.out.println(s.getName());
        System.out.println(s.getRoll_no());
    }
}
