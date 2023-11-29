package a20230831;
/*
有一个结构如下：
Person类，有名字和年龄属性，有一个公有方法say，返回String类型
Student类，继承Person类，特有属性score
Teacher类，继承Person类，特有属性salary
要求创建1个Person对象，2个Student对象和2个Teacher类对象
统一放在数组中，并调用每个对象say方法

应用升级：如何让调用子类的特有方法？比如Student有一个study方法。Teacher类有一个teach方法
 */
public class polyArr {
    public static void main(String[] args) {
        Person []arr = new Person[5];
        arr[0] = new Person("jack",20);
        arr[1] = new Student("tom",15,80);
        arr[2] = new Student("mary",15,85);
        arr[3] = new Teacher("smith",40,5000);
        arr[4] = new Teacher("mark",45,6000);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].say());//动态绑定机制
            //arr[i]的编译类型是Person，jvm机根据运行类型的不同去执行不同的say方法

            //实现应用升级，老师的做法，使用类型判断和向下转型
            if(arr[i] instanceof Student){
                System.out.println(((Student) arr[i]).study());
            }

            if(arr[i] instanceof Teacher){
                System.out.println(((Teacher) arr[i]).teach());
            }
        }

        //实现应用升级，自己的做法,使用向下转型
        System.out.println("====================");

        Student stu1 = (Student) arr[1];
        System.out.println(stu1.study());
        Student stu2 = (Student) arr[2];
        System.out.println(stu2.study());

        Teacher tea1 = (Teacher) arr[3];
        System.out.println(tea1.teach());
        Teacher tea2 = (Teacher) arr[4];
        System.out.println(tea2.teach());

    }
}
/*
多态数组
定义：数组的定义类型为父类类型，里面保存的实际元素类型为子类类型
 */

class Person{
    private String name;
    private int age;

    public String say(){
        return "名字=" + name + " 年龄=" + age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
        return super.say() + " 分数=" + score;
    }

    public String study(){
        return "学生" + getName() + "正在学习";
    }
}

class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say(){
        return super.say() + " 薪水=" + salary;
    }

    public String teach(){
        return "老师" + getName() + "正在授课";
    }
}