package day02;
//    定义一个学生类，包含三个属性（学号，姓名，成绩）均为私有的，分别给这三个属性定义两个方法，
//    一个设置它的值，另一个获得它的值。然后在一个测试类里试着调用
public class Student {
    private int no;
    private String name;
    private int score;

    public Student(){

    }

    public Student(int no, String name, int score) {
        this.no = no;
        this.name = name;
        this.score = score;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


class Test2{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Tom");
        student.setNo(123456);
        student.setScore(90);

        System.out.println(student.getName());
        System.out.println(student.getNo());
        System.out.println(student.getScore());
    }
}