package day02;

//    定义一个人类，包含姓名、性别、年龄等信息。所有的变量必须私有。
//    其他类只能通过该类的方法获取和修改。
//    实例化一个人类，试着通过该类的方法修改实例化的人的信息
public class Human {
    private String name;
    private String gender;
    private int age ;

    public Human(){

    }

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}


class test{
    public static void main(String[] args) {
        Human Tom = new Human("Tom","male",20);
        Tom.setName("Tom");
        Tom.setAge(19);
        Tom.setGender("male");

        System.out.println(Tom.getName());
        System.out.println(Tom.getGender());
        System.out.println(Tom.getAge());
    }
}